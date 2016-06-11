package cliente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import cliente.Cliente;
import cliente.DatoLogin;
import cliente.DatoMovs;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaLog extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tUserName;
	private JLabel lblNewLabel;
	private JPasswordField tPass;
	private JLabel tFaltanDatos;
	private JLabel lblNombreDeUsuario;
	private JLabel tTitulo;
	private JButton bIniciar;
	private int cont = 0;
	private DatoLogin datoLogin;
	private Cliente c1;
	public JTextField tRespuestaServer;
	

	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaLog frame = new PantallaLog(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PantallaLog(final PantallaPrincipal pantallaPrincipal) {
		setTitle("Iniciar Sesion");
		setResizable(false);
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 449, 270);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 141, 161, 0 };
		gbl_contentPane.rowHeights = new int[] { 14, 14, 20, 14, 20, 14, 23, 0,
				0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		bIniciar = new JButton("Iniciar Sesion");
		bIniciar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				// datoLogin = new DatoLogin(tUserName.getText(), tPass);
				datoLogin = new DatoLogin(tUserName.getText(), tPass.getText(),
						"login");

				c1 = new Cliente();
				if (!datoLogin.estavacio()) {
					if (c1.validarUsuario(datoLogin)) {
						tRespuestaServer.setText("Usuario OK");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						pantallaPrincipal.completarMensajeLogin();
						dispose();
					} else {
						tUserName.setText("");
						tPass.setText("");
						tRespuestaServer.setText("Usuario � clave incorrecta");
					}
				}
				else{
					tRespuestaServer.setText("Por favor ingrese Usuario y Contrase�a");
					
				}
			}
		});

//		bIniciar.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				if (tUserName.getText().equals("")
//						|| tPass.getPassword().length == 0) {
//					tFaltanDatos.setVisible(true);
//				} else {
//					/*
//					 * if(no coinciden datos){ mostrar cartel avisando cont++;
//					 * if(cont==3){ mostrar pregunta de verificacion }
//					 */
//					// dispose();
//				}
//			}
//		}
//		
//		);
		
		tTitulo = new JLabel("INICIO DE SESION");
		tTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_tTitulo = new GridBagConstraints();
		gbc_tTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_tTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_tTitulo.gridx = 0;
		gbc_tTitulo.gridy = 0;
		contentPane.add(tTitulo, gbc_tTitulo);
		lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		GridBagConstraints gbc_lblNombreDeUsuario = new GridBagConstraints();
		gbc_lblNombreDeUsuario.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNombreDeUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDeUsuario.gridx = 0;
		gbc_lblNombreDeUsuario.gridy = 1;
		contentPane.add(lblNombreDeUsuario, gbc_lblNombreDeUsuario);
		tUserName = new JTextField();

		tUserName.setColumns(10);
		GridBagConstraints gbc_tUserName = new GridBagConstraints();
		gbc_tUserName.anchor = GridBagConstraints.NORTH;
		gbc_tUserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tUserName.insets = new Insets(0, 0, 5, 5);
		gbc_tUserName.gridx = 0;
		gbc_tUserName.gridy = 2;
		contentPane.add(tUserName, gbc_tUserName);
		lblNewLabel = new JLabel("Contrase\u00F1a:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		tPass = new JPasswordField("");
		GridBagConstraints gbc_tPass = new GridBagConstraints();
		gbc_tPass.anchor = GridBagConstraints.NORTH;
		gbc_tPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPass.insets = new Insets(0, 0, 5, 5);
		gbc_tPass.gridx = 0;
		gbc_tPass.gridy = 4;
		contentPane.add(tPass, gbc_tPass);
		tFaltanDatos = new JLabel("Faltan Ingresar Datos");
		tFaltanDatos.setVisible(false);
		GridBagConstraints gbc_tFaltanDatos = new GridBagConstraints();
		gbc_tFaltanDatos.anchor = GridBagConstraints.NORTHWEST;
		gbc_tFaltanDatos.insets = new Insets(0, 0, 5, 5);
		gbc_tFaltanDatos.gridx = 0;
		gbc_tFaltanDatos.gridy = 5;
		contentPane.add(tFaltanDatos, gbc_tFaltanDatos);
		GridBagConstraints gbc_bIniciar = new GridBagConstraints();
		gbc_bIniciar.anchor = GridBagConstraints.NORTH;
		gbc_bIniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_bIniciar.insets = new Insets(0, 0, 5, 5);
		gbc_bIniciar.gridx = 0;
		gbc_bIniciar.gridy = 6;
		contentPane.add(bIniciar, gbc_bIniciar);

		tRespuestaServer = new JTextField();
		tRespuestaServer.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_tRespuestaServer = new GridBagConstraints();
		gbc_tRespuestaServer.insets = new Insets(0, 0, 0, 5);
		gbc_tRespuestaServer.fill = GridBagConstraints.HORIZONTAL;
		gbc_tRespuestaServer.gridx = 0;
		gbc_tRespuestaServer.gridy = 7;
		contentPane.add(tRespuestaServer, gbc_tRespuestaServer);
		tRespuestaServer.setColumns(10);
	}
}
