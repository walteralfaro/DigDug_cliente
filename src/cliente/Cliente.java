package cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	String iP = "localhost";
	//String iP = "192.168.1.173";
	public boolean validarUsuario(DatoLogin datoLogin) {

		try {
			//
			// Create a connection to the server socket on the server
			// application
			//
			InetAddress host = InetAddress.getLocalHost();
			Socket socket = new Socket(iP, 7777);
			//
			// Send a message to the client application
			//
			ObjectOutputStream oos = new ObjectOutputStream(
					socket.getOutputStream());
			oos.writeObject(datoLogin);

			//
			// Read and display the response message sent by server application
			//
			ObjectInputStream ois = new ObjectInputStream(
					socket.getInputStream());
			// String message = (String) ois.readObject();
			Boolean respuestaServer = (Boolean) ois.readObject();
			ois.close();
			oos.close();
			return respuestaServer;
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

}
