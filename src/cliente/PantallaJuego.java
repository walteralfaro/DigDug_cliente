package cliente;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PantallaJuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tPantalla;
	private JTextField txtEstadozombihumano;
	private JTextField txtHumanosRestantes;
	private JButton bArriba;
	private JButton bAbajo;
	private JButton bDerecha;
	private JButton bIzquierda;
	private JEditorPane tListaJugadores;
	private GroupLayout groupLayout;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaJuego frame = new PantallaJuego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PantallaJuego() {
		setTitle("Juego");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 514, 455);
		
		bArriba = new JButton("\u25B2");
		bAbajo = new JButton("\u25BC");
		bDerecha = new JButton("\u25BA");
		bIzquierda = new JButton("\u25C4");
		tPantalla = new JTextField();
		txtEstadozombihumano = new JTextField();
		txtHumanosRestantes = new JTextField();
		tListaJugadores = new JEditorPane();
		
	
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(112)
									.addComponent(bIzquierda)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(bArriba, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(bAbajo))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bDerecha))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(tPantalla, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
										.addComponent(txtHumanosRestantes, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
										.addComponent(txtEstadozombihumano, Alignment.TRAILING, 350, 350, 350))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tListaJugadores, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addGap(71)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(166))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtEstadozombihumano, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtHumanosRestantes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tListaJugadores, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
						.addComponent(tPantalla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(bArriba)
							.addGap(18)
							.addComponent(bAbajo))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(bIzquierda)
								.addComponent(bDerecha))))
					.addContainerGap())
		);
		
		tPantalla.setBackground(Color.WHITE);
		tPantalla.setEditable(false);
		tPantalla.setColumns(10);
		
		txtEstadozombihumano.setBorder(null);
		txtHumanosRestantes.setBorder(null);
		txtEstadozombihumano.setText("");
		txtEstadozombihumano.setEditable(false);
		txtEstadozombihumano.setColumns(10);
		txtHumanosRestantes.setEditable(false);
		txtHumanosRestantes.setText("");
		txtHumanosRestantes.setColumns(10);
		tListaJugadores.setEditable(false);
		tListaJugadores.setText("LISTADO JUGADORES:\r\nNo me deja\r\nusar JList\r\n");
		getContentPane().setLayout(groupLayout);
	}
}
