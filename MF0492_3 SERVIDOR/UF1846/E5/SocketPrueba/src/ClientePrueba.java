import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;

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

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
	
		JLabel texto=new JLabel("CLIENTE");
		
		add(texto);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto mievento = new EnviaTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);	
		
	}
	
	
	private class EnviaTexto implements  ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			//System.out.println(campo1.getText()); Comprobamos que funciona ençviando por consola.
			
			try {
				Socket misocket = new Socket("192.168.56.1", 9999);
				
				DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
				
				flujo_salida.writeUTF(campo1.getText());
				
				flujo_salida.close();
				
				
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
		
		
		
	private JTextField campo1;
	
	private JButton miboton;
	
}