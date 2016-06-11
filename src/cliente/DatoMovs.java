package cliente;

import java.io.Serializable;
import java.net.Socket;

public class DatoMovs implements Serializable {

		public int posX;
		public int posY;
		public String movimiento;
		private String userName;
		private float puntaje;
		
		public DatoMovs(int posX, int posY, String movimiento) {
			super();
			this.posX = posX;
			this.posY = posY;
			this.movimiento = movimiento;
					
		}

		@Override
		public String toString() {
			return "Dato [posX=" + posX + ", posY=" + posY + ", movimiento="
					+ movimiento + "]";
		}

	
}
