package cliente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PantallaEditarUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tUserName;
	private JPasswordField tPass;
	private JLabel tUserIncorrecto;
	private JLabel tPassIncorrecta;
	private JLabel tFaltanDatos;
	private JLabel tTitulo;
	private JButton bIniciar;
	private JLabel lblNuevoNombreDe;
	private JTextField tNewName;
	private JLabel lblContraseaActual;
	private JLabel lblNombreDeUsuario;
	private JLabel lblNuevaContrasea;
	private JPasswordField tPassNew;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEditarUser frame = new PantallaEditarUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PantallaEditarUser() {
		setTitle("Editar Usuario");
		setResizable(false);
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 337);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{141, 161, 0};
		gbl_contentPane.rowHeights = new int[]{14, 14, 20, 14, 20, 0, 14, 23, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		tTitulo = new JLabel("INICIO DE SESION");
		tTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_tTitulo = new GridBagConstraints();
		gbc_tTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_tTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_tTitulo.gridx = 0;
		gbc_tTitulo.gridy = 0;
		contentPane.add(tTitulo, gbc_tTitulo);
		
		lblNombreDeUsuario = new JLabel("Nombre de Usuario Actual:");
		GridBagConstraints gbc_lblNombreDeUsuario = new GridBagConstraints();
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
		tUserIncorrecto = new JLabel("Nombre de Usuario INCORRECTO");
		
		
		tUserIncorrecto.setVisible(false);
		tUserIncorrecto.setForeground(Color.RED);
		GridBagConstraints gbc_tUserIncorrecto = new GridBagConstraints();
		gbc_tUserIncorrecto.anchor = GridBagConstraints.WEST;
		gbc_tUserIncorrecto.insets = new Insets(0, 0, 5, 0);
		gbc_tUserIncorrecto.gridx = 1;
		gbc_tUserIncorrecto.gridy = 2;
		contentPane.add(tUserIncorrecto, gbc_tUserIncorrecto);
		
		lblNuevoNombreDe = new JLabel("Nuevo Nombre de Usuario:");
		GridBagConstraints gbc_lblNuevoNombreDe = new GridBagConstraints();
		gbc_lblNuevoNombreDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblNuevoNombreDe.gridx = 0;
		gbc_lblNuevoNombreDe.gridy = 3;
		contentPane.add(lblNuevoNombreDe, gbc_lblNuevoNombreDe);
		
		tNewName = new JTextField();
		GridBagConstraints gbc_tNewName = new GridBagConstraints();
		gbc_tNewName.insets = new Insets(0, 0, 5, 5);
		gbc_tNewName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tNewName.gridx = 0;
		gbc_tNewName.gridy = 4;
		contentPane.add(tNewName, gbc_tNewName);
		tNewName.setColumns(10);
		
		lblContraseaActual = new JLabel("Contrase\u00F1a Actual:");
		GridBagConstraints gbc_lblContraseaActual = new GridBagConstraints();
		gbc_lblContraseaActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseaActual.gridx = 0;
		gbc_lblContraseaActual.gridy = 5;
		contentPane.add(lblContraseaActual, gbc_lblContraseaActual);
		tPass = new JPasswordField("");
		GridBagConstraints gbc_tPass = new GridBagConstraints();
		gbc_tPass.anchor = GridBagConstraints.NORTH;
		gbc_tPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPass.insets = new Insets(0, 0, 5, 5);
		gbc_tPass.gridx = 0;
		gbc_tPass.gridy = 6;
		contentPane.add(tPass, gbc_tPass);
		tPassIncorrecta = new JLabel("Contrase\u00F1a INCORRECTA");
		tPassIncorrecta.setVisible(false);
		tPassIncorrecta.setForeground(Color.RED);
		GridBagConstraints gbc_tPassIncorrecta = new GridBagConstraints();
		gbc_tPassIncorrecta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPassIncorrecta.insets = new Insets(0, 0, 5, 0);
		gbc_tPassIncorrecta.gridx = 1;
		gbc_tPassIncorrecta.gridy = 6;
		contentPane.add(tPassIncorrecta, gbc_tPassIncorrecta);		
		bIniciar = new JButton("Iniciar Sesion");
		
		
		
		
		bIniciar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(tUserName.getText().equals("") && tPass.getPassword().length==0){
					tFaltanDatos.setVisible(true);
				}
				else{
					/*if(no coinciden datos){
					 * mostrar cartel avisando
					 * cont++;
					 * if(cont==3){
					 * 		mostrar pregunta de verificacion
					 * }
					 */
					dispose();
				}
			}
		});
		tFaltanDatos = new JLabel("Faltan Ingresar Datos");
		tFaltanDatos.setVisible(false);
		
		lblNuevaContrasea = new JLabel("Nueva Contrase\u00F1a:");
		GridBagConstraints gbc_lblNuevaContrasea = new GridBagConstraints();
		gbc_lblNuevaContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblNuevaContrasea.gridx = 0;
		gbc_lblNuevaContrasea.gridy = 7;
		contentPane.add(lblNuevaContrasea, gbc_lblNuevaContrasea);
		
		tPassNew = new JPasswordField("");
		GridBagConstraints gbc_tPassNew = new GridBagConstraints();
		gbc_tPassNew.anchor = GridBagConstraints.NORTH;
		gbc_tPassNew.insets = new Insets(0, 0, 5, 5);
		gbc_tPassNew.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPassNew.gridx = 0;
		gbc_tPassNew.gridy = 8;
		contentPane.add(tPassNew, gbc_tPassNew);
		GridBagConstraints gbc_tFaltanDatos = new GridBagConstraints();
		gbc_tFaltanDatos.anchor = GridBagConstraints.NORTHWEST;
		gbc_tFaltanDatos.insets = new Insets(0, 0, 5, 5);
		gbc_tFaltanDatos.gridx = 0;
		gbc_tFaltanDatos.gridy = 9;
		contentPane.add(tFaltanDatos, gbc_tFaltanDatos);
		GridBagConstraints gbc_bIniciar = new GridBagConstraints();
		gbc_bIniciar.anchor = GridBagConstraints.NORTH;
		gbc_bIniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_bIniciar.insets = new Insets(0, 0, 0, 5);
		gbc_bIniciar.gridx = 0;
		gbc_bIniciar.gridy = 10;
		contentPane.add(bIniciar, gbc_bIniciar);
	}
}

