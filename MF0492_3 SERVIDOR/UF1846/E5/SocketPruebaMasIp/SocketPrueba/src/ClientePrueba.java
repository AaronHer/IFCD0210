import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.*;

import java.net.*;


public class ClientePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
		
		nick = new JTextField(5);
		
		add (nick);
		
	
		JLabel texto=new JLabel("Chat Cliente");
		
		add(texto);
		
		ip = new JTextField (8);
		
		add (ip);
		
		campochat = new JTextArea (12, 20);
		
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto mievento = new EnviaTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);	
		
		Thread mihilo = new  Thread (this); // inicializamos el hilo
		
		mihilo.start();
		
	}
	
	
	private class EnviaTexto implements  ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			//System.out.println(campo1.getText()); Comprobamos que funciona enviando por consola.
			
			try {
				Socket misocket = new Socket("192.168.56.1", 9999);
				
				PaqueteEnvio datos = new PaqueteEnvio();
				
				datos.setNick(nick.getText()); // getText() conseguimos poner el contenido dentro de la caja de texto llamada nick
				datos.setIp(ip.getText());
				datos.setMensaje(campo1.getText());
				
				
				ObjectOutputStream paquete_datos = new ObjectOutputStream (misocket.getOutputStream()); 	
				paquete_datos.writeObject(datos);
				misocket.close();
				
				
				/*DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
				
				flujo_salida.writeUTF(campo1.getText());
				
				flujo_salida.close();*/
				
				
				// El flujo de datos de salida(Flujo_salida) va a viajar el texto del campo1 
				// Ese texto viajará por el socket (misocket) que sale a la direccion IP  por el puerto 9999
				// Finalmente cerramos el flujo de salida para que no quede abierto (.close())
			
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
		
		
		
	private JTextField campo1, nick, ip;
	
	private JTextArea campochat;
	
	private JButton miboton;

	@Override
	public void run() {
		
		try {
			
			ServerSocket servidor_cliente = new ServerSocket (9090);// está a la escucha para el puesto indicado
			
			Socket cliente;
			PaqueteEnvio paqueteRecibido;
			
			while (true) {
				
				cliente= servidor_cliente.accept();
				
				ObjectInputStream flujoEntrda = new ObjectInputStream (cliente.getInputStream());
				
				paqueteRecibido = (PaqueteEnvio) flujoEntrda.readObject(); 
				
				campochat.append("\n"  +  paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());
			
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
}



class PaqueteEnvio implements Serializable{
	
	private String nick, ip, mensaje;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}














