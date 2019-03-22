import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Canvas;


public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField textSalario;
	private ButtonGroup botones = new ButtonGroup();
	//el buttonGroup se importa y permite que no se puedan seleccionar varios botones, de manera que una vez declarado 
	// hay que hacerle un add para añadirlo como botones que pertenecen al grupo, 

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 418);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(213, 52, 71, 14);
		contentPane.add(lblNewLabel);
		
		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtnombre.setBounds(320, 49, 216, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEdad.setBounds(213, 106, 71, 14);
		contentPane.add(lblEdad);
		
		final JComboBox combo_Edad = new JComboBox();
		combo_Edad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		combo_Edad.setModel(new DefaultComboBoxModel(new String[] {"18-20", "20-25", "25-30", "30-35", "35-40", "40-45", "45-50", "50-55", "55-60", "60-65", "+65 "}));
		combo_Edad.setBounds(320, 103, 97, 20);
		contentPane.add(combo_Edad);
		
		JLabel lblNewLabel_1 = new JLabel("Sexo:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(213, 167, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		final JRadioButton rdbtnMas = new JRadioButton("Masculino");
		rdbtnMas.setBackground(SystemColor.text);
		rdbtnMas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnMas.setBounds(320, 183, 109, 23);
		contentPane.add(rdbtnMas);
		
		final JRadioButton rdbtnFem = new JRadioButton("Femenino");
		rdbtnFem.setBackground(SystemColor.text);
		rdbtnFem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnFem.setBounds(320, 163, 109, 23);
		contentPane.add(rdbtnFem);
		
		botones.add(rdbtnMas);
		botones.add(rdbtnFem);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSalario.setBounds(213, 238, 46, 14);
		contentPane.add(lblSalario);
		
		textSalario = new JTextField();
		textSalario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textSalario.setBounds(320, 235, 216, 20);
		contentPane.add(textSalario);
		textSalario.setColumns(10);
		
		Button button = new Button("Ingresar");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mensaje;// queremos guardar los valores rellenados en una variable de tipo String como una ristra de datos.
				// ponemos un if para ver que valor se ha seleccionado en los radioButon
				
				String sexo;
				
				if(rdbtnMas.isSelected()) {
					sexo = "Masculino";
				}else {
					if (rdbtnFem.isSelected()) {
						sexo="Femenino";
					}else {
						sexo="";
					}
				}
				mensaje =  txtnombre.getText()+" tiene un rango de edad "+combo_Edad.getSelectedItem()+" de sexo "+sexo+" y tiene un salario de " + textSalario.getText() ;
				System.out.println(mensaje);
			}
		});
		
		button.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button.setForeground(SystemColor.textHighlightText);
		button.setBackground(new Color(241, 57, 83));
		button.setBounds(213, 320, 102, 34);
		contentPane.add(button);
		
		Button button_1 = new Button("Salir");
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_1.setBackground(new Color(241, 57, 83));
		button_1.setBounds(340, 320, 102, 34);
		contentPane.add(button_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 187, 379);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 186, 379);
		panel.add(label);
		label.setIcon(new ImageIcon(Ventana2.class.getResource("/imagenes/purple-ombre-wallpaper_604564.jpg")));
		
		
		
		Button boton_limpiar = new Button("Limpiar");
		boton_limpiar.addActionListener(arg0 -> { 
			
			txtnombre.setText("");
			textSalario.setText("");
			
		});
		boton_limpiar.setForeground(Color.WHITE);
		boton_limpiar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		boton_limpiar.setBackground(new Color(241, 57, 83));
		boton_limpiar.setBounds(464, 320, 102, 34);
		contentPane.add(boton_limpiar);
		
		
	}
}
