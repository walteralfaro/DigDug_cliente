package cliente;

import java.io.Serializable;
import java.net.Socket;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

//import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class DatoLogin implements Serializable {

	private String userName;
	private String password;
	private String preguntaSecreta;
	private String respuestaSecreta;
	public String alm; // alta - login - modificacion

	public String getPassword() {
		return password;
	}

	public String getPreguntaSecreta() {
		return preguntaSecreta;
	}

	public void setPreguntaSecreta(String preguntaSecreta) {
		this.preguntaSecreta = preguntaSecreta;
	}

	public String getRespuestaSecreta() {
		return respuestaSecreta;
	}

	public void setRespuestaSecreta(String respuestaSecreta) {
		this.respuestaSecreta = respuestaSecreta;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public DatoLogin(String userName, String password, String preguntaSecreta,
			String respuestaSecreta) {
		super();
		this.userName = userName;
		this.password = password;
		this.preguntaSecreta = preguntaSecreta;
		this.respuestaSecreta = respuestaSecreta;
	}

	public DatoLogin(DatoLogin aux) {

		this.userName = aux.userName;
		this.password = aux.password;
		// setUserName(aux.getUserName());
		// setPassword(aux.getPassword());
		// setPreguntaSecreta(aux.getPreguntaSecreta());
		// setRespuestaSecreta(aux.getRespuestaSecreta());
	}

	public DatoLogin(String userName, String password, String alm) {
		super();
		this.userName = userName;
		this.password = password;
		this.alm = alm;
	}

	public DatoLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;

	}

	public DatoLogin(JTextField tUserName, JPasswordField tPass) {
		super();
		this.userName = tUserName.toString();
		this.password = tPass.toString();
	}

	@Override
	public String toString() {
		return "UserName= " + userName + " , password= " + password;
	}

	public boolean estavacio() {
		if (this.userName.isEmpty() && this.password.isEmpty())
			return true;
		return false;
	}

}
