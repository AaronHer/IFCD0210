
public class DatosUsuarios {
	public DatosUsuarios () {
		
	}
	String usuario1="";
	String pass1="";
	
	@SuppressWarnings("deprecation")
	public int probarPass() {
		usuario1=E2.txt_usuario.getText();
		pass1 = E2.passwordField.getText();
		if(usuario1.equals("Aaron")&& pass1.equals("ventana")) {
			return 1;
		}
		else {
			return 0;
		}
	}
	

}
