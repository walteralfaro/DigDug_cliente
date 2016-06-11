package cliente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import cliente.Cliente;
import cliente.DatoLogin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaDarseAlta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tUserName;
	private JPasswordField tPass;
	private JLabel tUserIncorrecto;
	private JLabel tPassIncorrecta;
	private JLabel tFaltanDatos;
	private JButton bIniciar;
	private JPasswordField tPassConfirm;
	private JLabel lblConfirmarContrasea;
	private JLabel lblContrasea;
	private JLabel lblCrearUsuario;
	private JLabel lblNombreDeUsuario;
	private DatoLogin datoLogin;
	private Cliente c1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaDarseAlta frame = new PantallaDarseAlta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PantallaDarseAlta() {
		setTitle("Crear Usuario");
		setResizable(false);
		contentPane = new JPanel();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 358, 242);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 141, 161, 0 };
		gbl_contentPane.rowHeights = new int[] { 30, 30, 0, 20, 0, 14, 20, 0,
				0, 14, 0, 30, 30 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		contentPane.setLayout(gbl_contentPane);
		GridBagConstraints gbc_tTitulo = new GridBagConstraints();
		gbc_tTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_tTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_tTitulo.gridx = 0;
		gbc_tTitulo.gridy = 0;

		lblCrearUsuario = new JLabel("CREAR USUARIO");
		lblCrearUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblCrearUsuario = new GridBagConstraints();
		gbc_lblCrearUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearUsuario.gridx = 0;
		gbc_lblCrearUsuario.gridy = 2;
		contentPane.add(lblCrearUsuario, gbc_lblCrearUsuario);

		lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		GridBagConstraints gbc_lblNombreDeUsuario = new GridBagConstraints();
		gbc_lblNombreDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDeUsuario.gridx = 0;
		gbc_lblNombreDeUsuario.gridy = 3;
		contentPane.add(lblNombreDeUsuario, gbc_lblNombreDeUsuario);
		tUserName = new JTextField();

		tUserName.setColumns(10);
		GridBagConstraints gbc_tUserName = new GridBagConstraints();
		gbc_tUserName.anchor = GridBagConstraints.NORTH;
		gbc_tUserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tUserName.insets = new Insets(0, 0, 5, 5);
		gbc_tUserName.gridx = 0;
		gbc_tUserName.gridy = 4;
		contentPane.add(tUserName, gbc_tUserName);
		tUserIncorrecto = new JLabel("Nombre de Usuario EN USO");

		tUserIncorrecto.setVisible(false);
		tUserIncorrecto.setForeground(Color.RED);
		GridBagConstraints gbc_tUserIncorrecto = new GridBagConstraints();
		gbc_tUserIncorrecto.anchor = GridBagConstraints.WEST;
		gbc_tUserIncorrecto.insets = new Insets(0, 0, 5, 0);
		gbc_tUserIncorrecto.gridx = 1;
		gbc_tUserIncorrecto.gridy = 4;
		contentPane.add(tUserIncorrecto, gbc_tUserIncorrecto);

		lblContrasea = new JLabel("Contrase\u00F1a:");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 5;
		contentPane.add(lblContrasea, gbc_lblContrasea);
		tPass = new JPasswordField("");
		GridBagConstraints gbc_tPass = new GridBagConstraints();
		gbc_tPass.anchor = GridBagConstraints.NORTH;
		gbc_tPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPass.insets = new Insets(0, 0, 5, 5);
		gbc_tPass.gridx = 0;
		gbc_tPass.gridy = 6;
		contentPane.add(tPass, gbc_tPass);

		lblConfirmarContrasea = new JLabel("Confirmar Contrase\u00F1a: ");
		GridBagConstraints gbc_lblConfirmarContrasea = new GridBagConstraints();
		gbc_lblConfirmarContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarContrasea.gridx = 0;
		gbc_lblConfirmarContrasea.gridy = 7;
		contentPane.add(lblConfirmarContrasea, gbc_lblConfirmarContrasea);

		tPassConfirm = new JPasswordField("");
		GridBagConstraints gbc_tPassConfirm = new GridBagConstraints();
		gbc_tPassConfirm.insets = new Insets(0, 0, 5, 5);
		gbc_tPassConfirm.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPassConfirm.gridx = 0;
		gbc_tPassConfirm.gridy = 8;
		contentPane.add(tPassConfirm, gbc_tPassConfirm);
		tPassIncorrecta = new JLabel("Contrase\u00F1a NO COINCIDE");
		tPassIncorrecta.setVisible(false);
		tPassIncorrecta.setForeground(Color.RED);
		GridBagConstraints gbc_tPassIncorrecta = new GridBagConstraints();
		gbc_tPassIncorrecta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPassIncorrecta.insets = new Insets(0, 0, 5, 0);
		gbc_tPassIncorrecta.gridx = 1;
		gbc_tPassIncorrecta.gridy = 8;
		contentPane.add(tPassIncorrecta, gbc_tPassIncorrecta);
		tFaltanDatos = new JLabel("Faltan Ingresar Datos");
		tFaltanDatos.setVisible(false);
		GridBagConstraints gbc_tFaltanDatos = new GridBagConstraints();
		gbc_tFaltanDatos.anchor = GridBagConstraints.NORTHWEST;
		gbc_tFaltanDatos.insets = new Insets(0, 0, 5, 5);
		gbc_tFaltanDatos.gridx = 0;
		gbc_tFaltanDatos.gridy = 9;
		contentPane.add(tFaltanDatos, gbc_tFaltanDatos);
		bIniciar = new JButton("Crear Usuario");
		// bIniciar.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent arg0) {
		// datoLogin = new DatoLogin(tUserName.getText(),
		// tPass.getText(),"alta");
		// c1 = new Cliente();
		//
		//
		// if (c1.validarUsuario(datoLogin)) {
		// // tRespuestaServer.setText("Usuario OK");
		// System.out.println("usuario dado de alta");
		// }
		// else {
		// System.out.println("Error al dar de alta");
		//
		// // tUserName.setText("");
		// //tPass.setText("");
		// //tRespuestaServer.setText("Usuario � clave incorrecta");
		// }
		//
		// }
		// });
		//

		bIniciar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tFaltanDatos.setVisible(false);
				if (tUserName.getText().equals("")
						|| tPass.getPassword().length == 0
						|| tPassConfirm.getPassword().length == 0) {
					tFaltanDatos.setVisible(true);
				} else {
					if (!Arrays.equals(tPass.getPassword(),
							tPassConfirm.getPassword())) {
						tPassIncorrecta.setVisible(true);
					}

					else {
						datoLogin = new DatoLogin(tUserName.getText(), tPass
								.getText(), "alta");
						c1 = new Cliente();

						if (c1.validarUsuario(datoLogin)) {

							System.out.println("usuario dado de alta");
						} else {
							System.out.println("Error al dar de alta");

							try {
								PantallaLog frame = new PantallaLog(null);
								frame.setVisible(true);
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}

						dispose();
					}
				}
			}
		});
		GridBagConstraints gbc_bIniciar = new GridBagConstraints();
		gbc_bIniciar.anchor = GridBagConstraints.NORTH;
		gbc_bIniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_bIniciar.insets = new Insets(0, 0, 5, 5);
		gbc_bIniciar.gridx = 0;
		gbc_bIniciar.gridy = 10;
		contentPane.add(bIniciar, gbc_bIniciar);
	}
}