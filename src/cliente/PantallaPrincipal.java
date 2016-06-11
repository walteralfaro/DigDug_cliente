package cliente;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import cliente.Cliente;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.UIManager;

public class PantallaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private GroupLayout gl_contentPane;
	private JButton btnJugar;
	private JMenu mnJugador;
	private JMenuItem mntmDarseDeAlta;
	private JMenuItem mntmEditarUsuario;
	private JList list;
	public JTextField tConfirmacionLogin;
	private JTextField tMensajeNoLogueado;
	private PantallaLog pantLog;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaLog pantLog = null;
					PantallaPrincipal frame = new PantallaPrincipal();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void completarMensajeLogin() {
		tConfirmacionLogin.setText("Usuario registrado");
		tMensajeNoLogueado.setText("");
	}

	public PantallaPrincipal() {
		this.pantLog = new PantallaLog(this);
		setTitle("Juego Pacoman");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 325);

		menuBar = new JMenuBar();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnJugar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				if (tConfirmacionLogin.getText().equals("")) {
					tMensajeNoLogueado.setText("Necesita Loguearse");
				} else {
					//PantallaJuego pj = new PantallaJuego();
					//pj.setVisible(true);
					Cliente c1= new Cliente();
					//c1.start();
				}

			}
		});

		JButton bIniciarSesion = new JButton("Iniciar Sesion");
		bIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// abrirVentanaLoginConReferencia(pantLog);
				if (tConfirmacionLogin.getText().equals("Usuario registrado"))
					tMensajeNoLogueado.setText("Ud. ya se logue�");
				else
					pantLog.setVisible(true);

			}
		});

		list = new JList();

		tConfirmacionLogin = new JTextField();
		tConfirmacionLogin.setColumns(10);

		tMensajeNoLogueado = new JTextField();
		tMensajeNoLogueado.setEditable(false);
		tMensajeNoLogueado.setBackground(UIManager
				.getColor("CheckBox.background"));
		tMensajeNoLogueado.setForeground(Color.RED);
		tMensajeNoLogueado.setColumns(10);

		gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																list,
																GroupLayout.PREFERRED_SIZE,
																197,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				bIniciarSesion)
																		.addGap(61)
																		.addComponent(
																				btnJugar,
																				GroupLayout.PREFERRED_SIZE,
																				89,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				tConfirmacionLogin,
																				GroupLayout.PREFERRED_SIZE,
																				122,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addComponent(
																				tMensajeNoLogueado,
																				GroupLayout.DEFAULT_SIZE,
																				130,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(1)
										.addComponent(list,
												GroupLayout.PREFERRED_SIZE,
												151, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED, 53,
												Short.MAX_VALUE)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																bIniciarSesion)
														.addComponent(btnJugar))
										.addGap(18)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																tConfirmacionLogin,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																tMensajeNoLogueado,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))));

		mnJugador = new JMenu("Jugador");
		menuBar.add(mnJugador);

		mntmEditarUsuario = new JMenuItem("Editar Usuario");
		mntmEditarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaEditarUser pe = new PantallaEditarUser();
				pe.setVisible(true);
			}
		});
		mnJugador.add(mntmEditarUsuario);

		mntmDarseDeAlta = new JMenuItem("Darse de Alta");
		mntmDarseDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaDarseAlta pa = new PantallaDarseAlta();
				pa.setVisible(true);
			}
		});
		mnJugador.add(mntmDarseDeAlta);
		setJMenuBar(menuBar);
		setContentPane(contentPane);
		contentPane.setLayout(gl_contentPane);
	}

	public static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
