import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class E2 extends JFrame {

	private JPanel contentPane;
	public static JTextField txt_usuario;
	public static JPasswordField passwordField; // los ponemos publicos para usarlos fuera de la ventana

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E2 frame = new E2();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public E2() {
		setTitle("                                                                           Contrase\u00F1a");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 434);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 349, 431);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(E2.class.getResource("/imagenes/bbva-open4u-programacion.jpg")));
		panel.add(lblNewLabel);
		
		// delcaramos el objeto de datos usuario
		
		final DatosUsuarios data = new DatosUsuarios();
		
		// Declaramos la variable que nos lleve a la pagina siguiente  al pinchar en entrar
		
		final Ventana2 window2 = new Ventana2();
		Button button = new Button("Entrar");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (data.probarPass() ==1 ) {
					JOptionPane.showMessageDialog(null, "Binvenido al sistema");
					window2.setVisible(true);
					dispose();//se cierre la ventana esta
				}
				else {
					JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
				}
			}
		});
		button.setForeground(SystemColor.textHighlightText);
		button.setBackground(new Color(241, 57, 83));
		button.setBounds(397, 219, 86, 33);
		contentPane.add(button);
		
		txt_usuario = new JTextField();
		txt_usuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txt_usuario.setBounds(397, 52, 248, 33);
		contentPane.add(txt_usuario);
		txt_usuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Nombre ");
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsuario.setBounds(397, 27, 86, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea_1 = new JLabel("Contrase\u00F1a");
		lblContrasea_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblContrasea_1.setBounds(397, 103, 86, 14);
		contentPane.add(lblContrasea_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		passwordField.setBounds(397, 128, 248, 33);
		contentPane.add(passwordField);
		
		Button button_1 = new Button("Salir");
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(241, 57, 83));
		button_1.setBounds(559, 219, 86, 33);
		contentPane.add(button_1);
	}
}
