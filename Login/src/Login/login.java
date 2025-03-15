package Login;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class login extends JFrame {

	public login() {

		setVisible(true);
		setSize(1000, 800);
		setLocationRelativeTo(null);

		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(700, 700));
		setMinimumSize(new Dimension(400, 400));

//    	this.add(this.logins());
//    	this.add(this.scrooll_pane());
    	this.add(this.loginImagen());
//    	this.add(this.registro());
//		this.add(this.recuperacionCuenta());

		// Barra principal de
		// opciones////////////////////////////////////////////////////
		JMenuBar barra = new JMenuBar();

		// Opciones 1////////////////////////////////////////////////
		JMenu usuarios = new JMenu("Usuarios");
		barra.add(usuarios);

		// Subopciones/////////////////////////////////
		JMenuItem alta = new JMenuItem("Darse de alta");
		alta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		usuarios.add(alta);
		
		JMenuItem baja = new JMenuItem("Darse de baja");
		baja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("baja");
			}
		});
		usuarios.add(baja);

		this.setJMenuBar(barra);
		
		JMenuItem consultar = new JMenuItem("Login");
		consultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("consultar");
			}
		});
		usuarios.add(consultar);

		this.setJMenuBar(barra);
		
		// Opciones 2////////////////////////////////////////////////
		JMenu ayuda = new JMenu("Ayuda");
		barra.add(ayuda);

		// Subopciones/////////////////////////////////
		JMenuItem comoCrear = new JMenuItem("¿Cómo crear un usuario?");
		comoCrear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("comoCrearUsuario");
			}
		});
		ayuda.add(comoCrear);

		JMenuItem comoAcceder = new JMenuItem("¿Cómo acceder al sistema?");
		comoAcceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("comoAccederSistema");
			}
		});
		ayuda.add(comoAcceder);

		this.setJMenuBar(barra);

		JMenuItem olvidoContrasena = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		olvidoContrasena.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("pasaOlvidoContraseña");
			}
		});
		ayuda.add(olvidoContrasena);

		this.setJMenuBar(barra);
		// Opciones 3////////////////////////////////////////////////
		JMenu cuenta = new JMenu("Cuentas");
		barra.add(cuenta);

		// Subopciones/////////////////////////////////
		JMenuItem registro1 = new JMenuItem("Registro");
		registro1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		cuenta.add(registro1);
		
		JMenuItem login1 = new JMenuItem("Login");
		login1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		cuenta.add(login1);

		this.setJMenuBar(barra);
		
		JMenuItem recuperacionCuenta = new JMenuItem("Login");
		recuperacionCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("recuperacionCuenta");
			}
		});
		cuenta.add(recuperacionCuenta);

		this.setJMenuBar(barra);

		this.repaint();

	}

	public void router(String route) {

		this.getContentPane().removeAll();

		if (route.equals("login")) {
			this.add(this.loginImagen());
		}

		if (route.equals("register")) {
			this.add(this.registro());
		}

		if (route.equals("recuperacionCuenta")) {
			this.add(this.recuperacionCuenta());
		}

		if (route.equals("alta")) {
			this.add(this.alta());
		}

		if (route.equals("baja")) {
			this.add(this.baja());
		}

		if (route.equals("consultar")) {
			this.add(this.consultar());
		}

		if (route.equals("comoCrearUsuario")) {
			this.add(this.comoCrearUsuario());
		}

		if (route.equals("comoAccederSistema")) {
			this.add(this.comoAccederSistema());
		}
		if (route.equals("pasaOlvidoContraseña")) {
			this.add(this.pasaOlvidoContrasena());
		}

		this.repaint();
		this.revalidate();

	}

	public JPanel recuperacionCuenta() {

		JPanel registro = new JPanel();

		registro.setBackground(Color.decode("#DCC8A0"));
		registro.setOpaque(true);
		registro.setSize(1000, 800);
		registro.setLocation(0, 0);
		registro.setLayout(null);// quita todo el molde

		JLabel etiqueta1R = new JLabel("Recuperacion de cuenta");
		etiqueta1R.setSize(200, 40);
		etiqueta1R.setLocation(140, 20);
		etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1R.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		registro.add(etiqueta1R);

		return registro;

	}

	public JPanel alta() {

		JPanel registro = new JPanel();

		registro.setBackground(Color.decode("#909352"));
		registro.setOpaque(true);
		registro.setSize(1000, 800);
		registro.setLocation(0, 0);
		registro.setLayout(null);// quita todo el molde

		JLabel etiqueta1R = new JLabel("Darse de alta");
		etiqueta1R.setSize(200, 40);
		etiqueta1R.setLocation(140, 20);
		etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1R.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		registro.add(etiqueta1R);

		return registro;
	}

	public JPanel baja() {

		JPanel registro = new JPanel();

		registro.setBackground(Color.decode("#938552"));
		registro.setOpaque(true);
		registro.setSize(1000, 800);
		registro.setLocation(0, 0);
		registro.setLayout(null);// quita todo el molde

		JLabel etiqueta1R = new JLabel("Darse de baja");
		etiqueta1R.setSize(200, 40);
		etiqueta1R.setLocation(140, 20);
		etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1R.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		registro.add(etiqueta1R);

		return registro;
	}

	public JPanel consultar() {

		JPanel panelPrincipal = new JPanel();

		panelPrincipal.setBackground(Color.decode("#936f52"));
		panelPrincipal.setOpaque(true);
		panelPrincipal.setSize(1000, 800);
		panelPrincipal.setLocation(0, 0);
		panelPrincipal.setLayout(null);// quita todo el molde

		JLabel etiqueta1R = new JLabel("Consultar Cuenta");
		etiqueta1R.setSize(200, 40);
		etiqueta1R.setLocation(140, 20);
		etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1R.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panelPrincipal.add(etiqueta1R);

		return panelPrincipal;
	}
	
	public JPanel comoCrearUsuario() {

		JPanel panelPrincipal = new JPanel();

		panelPrincipal.setBackground(Color.decode("#526993"));
		panelPrincipal.setOpaque(true);
		panelPrincipal.setSize(1000, 800);
		panelPrincipal.setLocation(0, 0);
		panelPrincipal.setLayout(null);// quita todo el molde

		JLabel etiqueta1R = new JLabel("¿Cómo crear un usuario?");
		etiqueta1R.setSize(200, 40);
		etiqueta1R.setLocation(140, 20);
		etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1R.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panelPrincipal.add(etiqueta1R);

		return panelPrincipal;
	}

	public JPanel comoAccederSistema() {

		JPanel panelPrincipal = new JPanel();

		panelPrincipal.setBackground(Color.decode("#526993"));
		panelPrincipal.setOpaque(true);
		panelPrincipal.setSize(1000, 800);
		panelPrincipal.setLocation(0, 0);
		panelPrincipal.setLayout(null);// quita todo el molde

		JLabel etiqueta1R = new JLabel("¿Cómo acceder al sistema?");
		etiqueta1R.setSize(200, 40);
		etiqueta1R.setLocation(140, 20);
		etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1R.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panelPrincipal.add(etiqueta1R);

		return panelPrincipal;
	}

	public JPanel pasaOlvidoContrasena() {

		JPanel panelPrincipal = new JPanel();

		panelPrincipal.setBackground(Color.decode("#645293"));
		panelPrincipal.setOpaque(true);
		panelPrincipal.setSize(1000, 800);
		panelPrincipal.setLocation(0, 0);
		panelPrincipal.setLayout(null);// quita todo el molde

		JLabel etiqueta1R = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		etiqueta1R.setSize(200, 40);
		etiqueta1R.setLocation(140, 20);
		etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1R.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panelPrincipal.add(etiqueta1R);

		return panelPrincipal;
	}
	
	public JPanel loginImagen() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null); // Desactivar layout para colocar los paneles manualmente
		contenedor.setSize(500, 800);

		// Panel izquierdo (azul)
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setBackground(Color.decode("#004E70"));
		panelIzquierdo.setBounds(0, 0, 500, 800); // Primera mitad
		panelIzquierdo.setLayout(null);

		// Panel derecho
//        JPanel panelDerecho = new JPanel();
//        panelDerecho.setBounds(500, 0, 500, 800);
//        panelDerecho.setOpaque(false);
//        panelDerecho.setLayout(null);

//        // imagen de fondo
//        ImageIcon fondoIcono = new ImageIcon("fondoDeInterfaz1.png");
//        Image imagenEscalada = fondoIcono.getImage().getScaledInstance(500, 800, Image.SCALE_SMOOTH);
//        JLabel fondoLabel = new JLabel(new ImageIcon(imagenEscalada));
//        fondoLabel.setBounds(0, 0, 500, 800); // Ajustar al tamaño del panel
//        panelDerecho.add(fondoLabel);
//        
		// imagen de logo
		ImageIcon fondoLogo = new ImageIcon("logo.png");
		Image imagenEscalada3 = fondoLogo.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		JLabel fondoLabel3 = new JLabel(new ImageIcon(imagenEscalada3));
		fondoLabel3.setBounds(210, 20, 50, 50); // Ajustar al tamaño del panel
		panelIzquierdo.add(fondoLabel3);

		// icoono de usuario
		ImageIcon contraseña = new ImageIcon("usuario.png");
		Image imagenEscalada4 = contraseña.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		JLabel fondoLabel_4 = new JLabel(new ImageIcon(imagenEscalada4));
		fondoLabel_4.setBounds(110, 160, 40, 40);
		panelIzquierdo.add(fondoLabel_4);

		// icono de contraseña
		ImageIcon usuario = new ImageIcon("contraseña.png");
		Image imagenEscalada5 = usuario.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		JLabel fondoLabel_5 = new JLabel(new ImageIcon(imagenEscalada5));
		fondoLabel_5.setBounds(110, 260, 40, 40);
		panelIzquierdo.add(fondoLabel_5);

		// Etiqueta de título en el panel izquierdo
		JLabel etiqueta1 = new JLabel("Inicio de sesión");
		etiqueta1.setForeground(Color.WHITE);
		etiqueta1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		etiqueta1.setBounds(165, 70, 200, 40);
		panelIzquierdo.add(etiqueta1);

		// Campos de usuario y contraseña
		JLabel etiqueta2 = new JLabel("Ingrese su usuario");
		etiqueta2.setForeground(Color.WHITE);
		etiqueta2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		etiqueta2.setBounds(120, 120, 200, 40);
		panelIzquierdo.add(etiqueta2);

		JTextField email = new JTextField();
		email.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		email.setBounds(160, 160, 200, 40);
		panelIzquierdo.add(email);

		JLabel etiqueta3 = new JLabel("Ingrese su contraseña:");
		etiqueta3.setForeground(Color.WHITE);
		etiqueta3.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		etiqueta3.setBounds(120, 220, 200, 40);
		panelIzquierdo.add(etiqueta3);

		JPasswordField password = new JPasswordField();
		password.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		password.setBounds(160, 260, 200, 40);
		panelIzquierdo.add(password);

		// Botón de acceder
		JButton botonAcceder = new JButton("Acceder");
		botonAcceder.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		botonAcceder.setBounds(190, 360, 120, 40);

		botonAcceder.addActionListener(new ActionListener() {

			Boolean bandera1 = false, bandera2 = false;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red, 4));
				} else {
					email.setBorder(BorderFactory.createLineBorder(Color.green, 4));
					bandera1 = true;
				}

				String contraseña = new String(password.getPassword());

				if (contraseña.equals("")) {
					password.setBorder(BorderFactory.createLineBorder(Color.red, 4));
				} else {
					password.setBorder(BorderFactory.createLineBorder(Color.green, 4));
					bandera2 = true;
				}

				if (bandera1 && bandera2) {
					if (email.getText().equals("gabriel@alu")) {
						if (contraseña.equals("12345")) {
							JOptionPane.showMessageDialog(null, "Inicio de secion exitoso", "Hello",
									JOptionPane.DEFAULT_OPTION);
						} else
							JOptionPane.showMessageDialog(null, "INICIO DE SECION ERRONEO", "Fallido",
									JOptionPane.CANCEL_OPTION);
					} else
						JOptionPane.showMessageDialog(null, "INICIO DE SECION ERRONEO", "Fallido",
								JOptionPane.CANCEL_OPTION);
				} else
					JOptionPane.showMessageDialog(null, "INICIO DE SECION ERRONEO", "Fallido",
							JOptionPane.CANCEL_OPTION);
			}
		});
		panelIzquierdo.add(botonAcceder);

		JLabel crearCuenta = new JLabel("<html>¿No tienes cuenta? <u>Crear cuenta</u></html>	");
		crearCuenta.setForeground(Color.WHITE);
		crearCuenta.setSize(200, 20);
		crearCuenta.setLocation(160, 415);
		crearCuenta.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		panelIzquierdo.add(crearCuenta);

		JLabel olvidoContrasena = new JLabel("¿Olvidó su contraseña?");
		olvidoContrasena.setForeground(Color.WHITE);
		olvidoContrasena.setSize(200, 20);
		olvidoContrasena.setLocation(240, 300);
		olvidoContrasena.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		panelIzquierdo.add(olvidoContrasena);

		JLabel help = new JLabel("¿Ayuda?");
		help.setForeground(Color.WHITE);
		help.setSize(200, 20);
		help.setLocation(20, 460);
		help.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		panelIzquierdo.add(help);

		JButton irRegistro = new JButton("Ir a registro");
		irRegistro.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		irRegistro.setBounds(190, 600, 120, 40);

		irRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});

		panelIzquierdo.add(irRegistro);

		// Agregar ambos paneles al contenedor
		contenedor.add(panelIzquierdo);
//        contenedor.add(panelDerecho);

		return contenedor;
	}

	public JPanel logins() {

		JPanel elPanel = new JPanel();

		elPanel.setBackground(Color.decode("#917841"));
		elPanel.setOpaque(true);
		elPanel.setSize(500, 800);
		elPanel.setLocation(0, 0);
		elPanel.setLayout(null);// quita todo el molde+

		JLabel etiqueta1 = new JLabel("Inicio de sesion");
		etiqueta1.setSize(200, 40);
		etiqueta1.setLocation(140, 20);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		elPanel.add(etiqueta1);

		JLabel etiqueta2 = new JLabel("Ingrese su correo: ");
		etiqueta2.setSize(200, 40);
		etiqueta2.setLocation(140, 100);
		etiqueta2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		elPanel.add(etiqueta2);

		JTextField email = new JTextField();
		email.setSize(200, 40);
		email.setLocation(140, 140);
		email.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		elPanel.add(email);

		JLabel etiqueta3 = new JLabel("Ingrese su contraseña:");
		etiqueta3.setSize(200, 40);
		etiqueta3.setLocation(140, 180);
		etiqueta3.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		elPanel.add(etiqueta3);

		JPasswordField password = new JPasswordField();
		password.setSize(200, 40);
		password.setLocation(140, 220);
		password.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		elPanel.add(password);

		JLabel OlvidoContrasena = new JLabel("¿Olvidó su contraseña?");
		OlvidoContrasena.setSize(200, 20);
		OlvidoContrasena.setLocation(220, 260);
		OlvidoContrasena.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		elPanel.add(OlvidoContrasena);

		JButton botonAcceder = new JButton("Acceder");
		botonAcceder.setSize(120, 40);
		botonAcceder.setLocation(190, 300);
		botonAcceder.setFont(new Font("Bahnschrift", Font.BOLD, 15));

		botonAcceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
			}
		});

		elPanel.add(botonAcceder);

		JLabel CrearCuenta = new JLabel("¿No tienes cuenta? Crear cuenta");
		CrearCuenta.setSize(200, 20);
		CrearCuenta.setLocation(160, 350);
		CrearCuenta.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		elPanel.add(CrearCuenta);

		JLabel hepl = new JLabel("¿Ayuda?");
		hepl.setSize(200, 20);
		hepl.setLocation(20, 420);
		hepl.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		elPanel.add(hepl);

		JButton volver = new JButton("Volver");
		volver.setSize(75, 40);
		volver.setLocation(20, 20);
		volver.setFont(new Font("Bahnschrift", Font.BOLD, 10));
		elPanel.add(volver);

		return elPanel;

	}

	public JPanel registro() {

		JPanel registro = new JPanel();

		registro.setBackground(Color.decode("#DCC8A0"));
		registro.setOpaque(true);
		registro.setSize(500, 800);
		registro.setLocation(0, 0);
		registro.setLayout(null);// quita todo el molde

		JLabel etiqueta1R = new JLabel("Registro");
		etiqueta1R.setSize(200, 40);
		etiqueta1R.setLocation(140, 20);
		etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1R.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		registro.add(etiqueta1R);

		JLabel etiqueta2 = new JLabel("Ingrese su correo: ");
		etiqueta2.setSize(200, 40);
		etiqueta2.setLocation(140, 100);
		etiqueta2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		registro.add(etiqueta2);

		JTextField email = new JTextField();
		email.setSize(200, 40);
		email.setLocation(140, 140);
		email.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		registro.add(email);

		JLabel etiqueta3 = new JLabel("Ingrese su contraseña:");
		etiqueta3.setSize(200, 40);
		etiqueta3.setLocation(140, 180);
		etiqueta3.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		registro.add(etiqueta3);

		JPasswordField password = new JPasswordField();
		password.setSize(200, 40);
		password.setLocation(140, 220);
		password.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		registro.add(password);

		JLabel OlvidoContrasena = new JLabel("¿Olvidó su contraseña?");
		OlvidoContrasena.setSize(200, 20);
		OlvidoContrasena.setLocation(220, 260);
		OlvidoContrasena.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		registro.add(OlvidoContrasena);

		JLabel CrearCuenta = new JLabel("¿No tienes cuenta? Crear cuenta");
		CrearCuenta.setSize(200, 20);
		CrearCuenta.setLocation(160, 350);
		CrearCuenta.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		registro.add(CrearCuenta);

		JButton volver = new JButton("Volver");
		volver.setSize(75, 40);
		volver.setLocation(20, 20);
		volver.setFont(new Font("Bahnschrift", Font.BOLD, 10));
		registro.add(volver);

		JLabel animal = new JLabel("¿Mascota favorita?");
		animal.setSize(200, 20);
		animal.setLocation(100, 390);
		animal.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		registro.add(animal);

		JCheckBox animal1 = new JCheckBox("Gatos");
		animal1.setBounds(100, 400, 200, 40);
		animal1.setOpaque(false);
		registro.add(animal1);

		JCheckBox animal2 = new JCheckBox("Perros");
		animal2.setBounds(100, 430, 200, 40);
		animal2.setOpaque(false);
		registro.add(animal2);

		JRadioButton terms1 = new JRadioButton("Acepto los terminos");
		terms1.setSize(200, 40);
		terms1.setLocation(150, 480);
		registro.add(terms1);

		JRadioButton terms2 = new JRadioButton("NO acepto los terminos");
		terms2.setSize(200, 40);
		terms2.setLocation(150, 530);
		registro.add(terms2);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(terms1);
		grupo.add(terms2);

		JLabel comentario = new JLabel("Comentarios");
		comentario.setSize(200, 20);
		comentario.setLocation(70, 600);
		comentario.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		registro.add(comentario);

		JTextArea comentario1 = new JTextArea(10, 10);
		comentario1.setSize(350, 100);
		comentario1.setLocation(70, 620);
		registro.add(comentario1);

		JButton botonAcceder = new JButton("Acceder");
		botonAcceder.setSize(120, 40);
		botonAcceder.setLocation(190, 300);
		botonAcceder.setFont(new Font("Bahnschrift", Font.BOLD, 15));

		botonAcceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Boolean bandera1 = false, bandera2 = false;

				if (email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red, 4));
				} else {
					email.setBorder(BorderFactory.createLineBorder(Color.green, 4));
					bandera1 = true;
				}

				String contraseña = new String(password.getPassword());

				if (contraseña.equals("")) {

					password.setBorder(BorderFactory.createLineBorder(Color.red, 4));

				} else {
					password.setBorder(BorderFactory.createLineBorder(Color.green, 4));
					bandera2 = true;
				}

				if (comentario1.getText().equals("")) {
					comentario1.setBorder(BorderFactory.createLineBorder(Color.red, 4));
				} else {
					comentario1.setBorder(BorderFactory.createLineBorder(Color.green, 4));
				}

				if (bandera1 && bandera2) {
					if (email.getText().equals("gabriel@alu")) {
						if (contraseña.equals("12345")) {
							JOptionPane.showMessageDialog(null, "Inicio de secion exitoso", "Hello",
									JOptionPane.DEFAULT_OPTION);
						} else
							JOptionPane.showMessageDialog(null, "INICIO DE SECION ERRONEO", "Fallido",
									JOptionPane.CANCEL_OPTION);
					} else
						JOptionPane.showMessageDialog(null, "INICIO DE SECION ERRONEO", "Fallido",
								JOptionPane.CANCEL_OPTION);
				} else
					JOptionPane.showMessageDialog(null, "INICIO DE SECION ERRONEO", "Fallido",
							JOptionPane.CANCEL_OPTION);

			}
		});
		registro.add(botonAcceder);

		JButton irLogin = new JButton("Ir a login");
		irLogin.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		irLogin.setBounds(300, 400, 120, 40);

		irLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		registro.add(irLogin);

		return registro;
	}

	public JPanel scrooll_pane() {

		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#917841"));
		panel.setOpaque(true);
		panel.setSize(1000, 800);
		panel.setLocation(0, 0);
		panel.setLayout(null);// quita todo el molde

		JLabel etiqueta1 = new JLabel("Inicio de sesion");
		etiqueta1.setSize(200, 40);
		etiqueta1.setLocation(400, 20);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panel.add(etiqueta1);

		Object data[][] = { { "Marisol", "19", "si" }, { "carlos", "29", "si" }, { "javier", "25", "no" },
				{ "Marisol", "19", "si" }, { "carlos", "29", "si" }, { "javier", "25", "no" }, { "carlos", "29", "si" },
				{ "javier", "25", "no" }, { "Marisol", "19", "si" }, { "carlos", "29", "si" }, { "javier", "25", "no" },
				{ "carlos", "29", "si" }, { "javier", "25", "no" }, { "Marisol", "19", "si" }, { "carlos", "29", "si" },
				{ "javier", "25", "no" }, { "carlos", "29", "si" }, { "javier", "25", "no" }, { "Marisol", "19", "si" },
				{ "carlos", "29", "si" }, { "javier", "25", "no" }, { "carlos", "29", "si" }, { "javier", "25", "no" },
				{ "Marisol", "19", "si" }, { "carlos", "29", "si" }, { "javier", "25", "no" }, { "carlos", "29", "si" },
				{ "javier", "25", "no" }, { "Marisol", "19", "si" }, { "carlos", "29", "si" }, { "javier", "25", "no" },
				{ "carlos", "29", "si" }, { "javier", "25", "no" }, { "Marisol", "19", "si" }, { "carlos", "29", "si" },
				{ "javier", "25", "no" }, };
		String titles[] = { "Nombre", "Años", "si / no??" };

		JTable tablas = new JTable(data, titles);
		JScrollPane scroll_pane = new JScrollPane(tablas);
		scroll_pane.setSize(850, 300);
		scroll_pane.setLocation(60, 120);
		panel.add(scroll_pane);

		JButton botonDes = new JButton("Descargar");
		botonDes.setSize(100, 30);
		botonDes.setLocation(670, 70);
		botonDes.setFont(new Font("Bahnschrift", Font.BOLD, 11));
		panel.add(botonDes);

		JButton botonAd = new JButton("Añadir");
		botonAd.setSize(100, 30);
		botonAd.setLocation(800, 70);
		botonAd.setFont(new Font("Bahnschrift", Font.BOLD, 11));
		panel.add(botonAd);

		JLabel etiqueta21 = new JLabel("Alumnos:");
		etiqueta21.setSize(200, 40);
		etiqueta21.setLocation(140, 50);
		etiqueta21.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		panel.add(etiqueta21);

		JLabel etiqueta22 = new JLabel("34");
		etiqueta22.setSize(200, 40);
		etiqueta22.setLocation(170, 70);
		etiqueta22.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		panel.add(etiqueta22);

		return panel;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new login());
	}
}