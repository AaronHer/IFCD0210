
import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorPrueba  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable  {
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		// Creamos y ejecutamos el hilo
		
		Thread mihilo = new Thread (this);
		
		mihilo.start();
		
		}
	
	

	
	
	// Creamos un hilo que es que va a mantaner al puerto del chocket abierto 
	// y a la escucha de recibir más información
	
	
	
	// Creamos un socket de servidor abierto para un puesto espacificado 
	
	
	@Override
	public void run() {
		
		try {
			
			// Ponemos a la escucha el servidor, creando el serverSocket
			ServerSocket servidor = new ServerSocket(9999);
			
			
			String nick, ip, mensaje;
			
			// En el servidor necesitamos crear una instania pernteneciente a paquete envío
			// Creamos la instacia
			
			PaqueteEnvio paquete_recibido;
						
			
			while (true) {
			
				
				Socket misocket = servidor.accept();
				ObjectInputStream paquete_datos = new ObjectInputStream (misocket.getInputStream());
				paquete_recibido = (PaqueteEnvio) paquete_datos.readObject();
				
				nick = paquete_recibido.getNick();
				ip = paquete_recibido.getIp();
				mensaje = paquete_recibido.getMensaje();	// usamos los getter y setter para obtener las bariables que os interesan 
															// del objeto datos
				
				areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);
				
				Socket enviarDestinatario = new Socket(ip,9090);
				
				ObjectOutputStream paqueteReenvio = new ObjectOutputStream (enviarDestinatario.getOutputStream());
				paqueteReenvio.writeObject (paquete_recibido);
				
				paqueteReenvio.close();
				
				enviarDestinatario.close();
				misocket.close(); 
				
				
				// Creamos el flujo de entrada del servidor
			
				//DataInputStream flujo_entrda =  new DataInputStream (misocket.getInputStream());
				// Creamo una variable de tipo String en la cual   indica que es de tipo texto. 
				//String mensaje_texto = flujo_entrda.readUTF();
				//areatexto.append("\n" + mensaje_texto);
			
				// Cerramos el Socket. 
			
					// Con esta centencia cerramos el servidor de maner que solo nos entra un mensaje, 
									// por lo que creando un bucle infinito, siempre vuelve a abrir el socket. 
			}
			
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	private	JTextArea areatexto;
}
