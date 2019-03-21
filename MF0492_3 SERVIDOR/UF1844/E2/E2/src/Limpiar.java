import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Limpiar {

	public void Limpiar(JPanel jPanel1) {
		
		for(int i = 0;jPanel1.getComponents().length>i; i++ ) {
			//Lo que hace el for es ir recorriendo los valores dentro del panel
			if(jPanel1.getComponents()[i]instanceof JTextField) {
				((JTextField)jPanel1.getComponents()[i]).setText("");//Cojemos y limpiamos lo JText
			}else if(jPanel1.getComponents()[i]instanceof JPasswordField) {
				((JPasswordField)jPanel1.getComponents()[i]).setText("");
			}
		}
		

	}

}
