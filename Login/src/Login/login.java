package Login;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class login extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;



	public login() {
		setVisible(true);
		setSize(500, 800);
		setLocationRelativeTo(null);

		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(700, 700));
		setMinimumSize(new Dimension(400, 400));

    	this.add(this.loginImagen());

		// Barra principal de opciones/////////
		JMenuBar barra = new JMenuBar();
		
		// Opciones 1////////////////////////////////////////////////
		JMenu cuenta = new JMenu("Cuentas");
		barra.add(cuenta);

		// Subopciones/////////////////////////////////
		JMenuItem login1 = new JMenuItem("Login");
		login1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
			}
		});
		cuenta.add(login1);
		
		JMenuItem registro1 = new JMenuItem("Registro");
		registro1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		cuenta.add(registro1);
		

		
		JMenuItem recuperacionCuenta = new JMenuItem("Recuperacion Cuenta");
		recuperacionCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("recuperacionCuenta");
			}
		});
		cuenta.add(recuperacionCuenta);
		
		// Opciones 2////////////////////////////////////////////////
		JMenu usuarios = new JMenu("Usuarios");
		barra.add(usuarios);

		// Subopciones/////////////////////////////////
		JMenuItem alta = new JMenuItem("Darse de alta");
		alta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("alta");
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
		
		JMenuItem consultar = new JMenuItem("Consultar usuario");
		consultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("consultar");
			}
		});
		usuarios.add(consultar);
		
		// Opciones 3////////////////////////////////////////////////
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

//		this.setJMenuBar(barra);

		JMenuItem olvidoContrasena = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		olvidoContrasena.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("pasaOlvidoContraseña");
			}
		});
		ayuda.add(olvidoContrasena);

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

	public Component recuperacionCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#17A29D"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recuperación de cuenta");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblNewLabel.setBounds(89, 42, 298, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese su correo:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(98, 139, 247, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(99, 172, 246, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese el codigo:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(98, 268, 247, 21);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(98, 299, 246, 25);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Se le enviara un codigo al correo");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(98, 207, 247, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 10, 85, 21);
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar codigo");
//		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(167, 379, 127, 32);
		return contentPane.add(btnNewButton_1);
	}

	public Component alta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#f35131"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alta de usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblNewLabel.setBounds(85, 74, 298, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(98, 139, 247, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(99, 172, 246, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(98, 299, 247, 21);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(99, 330, 246, 25);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 10, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(173, 514, 127, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(98, 216, 247, 21);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(99, 247, 246, 25);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirmar contraseña:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(98, 375, 247, 21);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(99, 406, 246, 25);
		return contentPane.add(textField_3);
	}

	public Component baja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#20287c"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dar de baja a un usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblNewLabel.setBounds(85, 74, 298, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese su correo:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(98, 139, 247, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(99, 172, 246, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirme contraseña para eliminar:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(98, 346, 247, 21);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(99, 377, 246, 25);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 10, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar usuario");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(173, 454, 127, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre de usuario: Juan Perez Lopez");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(99, 274, 314, 21);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Buscar usuario");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(173, 219, 127, 32);
		return contentPane.add(btnNewButton_1_1);
	}

	public Component consultar(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setToolTipText("jlvhkc jd\r\nsjcbdhuv\r\ncidjb");
		contentPane.setBackground(Color.decode("#531987"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(85, 74, 298, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese ID:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel_1.setBounds(108, 120, 247, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(108, 151, 284, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		btnNewButton.setBounds(10, 10, 93, 25);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cerrar");
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnNewButton_1.setBounds(186, 514, 127, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Buscar usuario");
		btnNewButton_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		btnNewButton_1_1.setBounds(186, 197, 127, 32);
		contentPane.add(btnNewButton_1_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
		    new Object[][] {
		        {"1", "Juan Pérez", "juan.perez@email.com", "555-1234"},
		        {"2", "María López", "maria.lopez@email.com", "555-5678"},
		        {"3", "Carlos Gómez", "carlos.gomez@email.com", "555-9101"},
		        {"4", "Ana Ramírez", "ana.ramirez@email.com", "555-1122"},
		        {"5", "Pedro Torres", "pedro.torres@email.com", "555-3344"},
		        {"6", "Laura Díaz", "laura.diaz@email.com", "555-5566"},
		        {"7", "José Martínez", "jose.martinez@email.com", "555-7788"},
		        {"8", "Sofía Herrera", "sofia.herrera@email.com", "555-9900"},
		        {"9", "Ricardo Mendoza", "ricardo.mendoza@email.com", "555-2233"},
		        {"10", "Fernanda Cruz", "fernanda.cruz@email.com", "555-4455"},
		        {"11", "Luis Vázquez", "luis.vazquez@email.com", "555-6677"},
		        {"12", "Andrea Morales", "andrea.morales@email.com", "555-8899"},
		        {"13", "Miguel Rojas", "miguel.rojas@email.com", "555-0011"},
		        {"14", "Gabriela Castillo", "gabriela.castillo@email.com", "555-2234"},
		        {"15", "David Reyes", "david.reyes@email.com", "555-5567"},
		    },
		    new String[] {
		        "ID", "Nombre", "Correo", "Número"
		    }
		));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 284, 400, 200); 
		return contentPane.add(scrollPane);
	}
	
	public Component comoCrearUsuario()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#875319"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Como crear un usuario?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(85, 74, 298, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		btnNewButton.setBounds(10, 10, 93, 25);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cerrar");
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnNewButton_1.setBounds(161, 324, 127, 32);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrDirgeteA = new JTextArea();
		txtrDirgeteA.setForeground(new Color(255, 255, 255));
		txtrDirgeteA.setBackground(new Color(0, 0, 0));
		txtrDirgeteA.setOpaque(false);
		txtrDirgeteA.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		txtrDirgeteA.setText("1. Dirígete a la sección 'Cuentas'. \n"+
				"2. Haz clic en 'Registro'.\n"+
	            "3. Completa los datos requeridos.\n" +
	            "4. Presiona el botón 'Guardar'.\n\n" +
	            "Si necesitas más información, consulta el manual."
        );
		txtrDirgeteA.setBounds(85, 180, 298, 92);
		return contentPane.add(txtrDirgeteA);
	}

	public Component comoAccederSistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#872b19"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Cómo acceder al sistema? ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(85, 74, 298, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		btnNewButton.setBounds(10, 10, 93, 25);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cerrar");
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnNewButton_1.setBounds(161, 324, 127, 32);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrDirgeteA = new JTextArea();
		txtrDirgeteA.setForeground(new Color(255, 255, 255));
		txtrDirgeteA.setBackground(new Color(0, 0, 0));
		txtrDirgeteA.setOpaque(false);
		txtrDirgeteA.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		txtrDirgeteA.setText("1.Abrir la pantalla de inicio de sesión:\r\n2.Ingresar tus credenciales.\r\n3.Haz clic en el botón \"Iniciar sesión\".\r\n4.Acceso exitoso o errores:\r\n-Si las credenciales son correctas, entrarás al sistema.\r\n-Si aparece un error, verifica que.\r\n   -El correo electrónico esté escrito correctamente.\r\n   -La contraseña sea la correcta.\r\n"
        );
		txtrDirgeteA.setBounds(42, 131, 420, 183);
		return contentPane.add(txtrDirgeteA);
	}

	public Component pasaOlvidoContrasena() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#871957"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Cómo acceder al sistema? ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(85, 74, 298, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		btnNewButton.setBounds(10, 10, 93, 25);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cerrar");
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnNewButton_1.setBounds(161, 324, 127, 32);
		contentPane.add(btnNewButton_1);

		JTextArea txtrDirgeteA = new JTextArea();
		txtrDirgeteA.setForeground(new Color(255, 255, 255));
		txtrDirgeteA.setBackground(new Color(0, 0, 0));
		txtrDirgeteA.setOpaque(false);
		txtrDirgeteA.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		txtrDirgeteA.setText(
				"1.Abrir la opción de recuperación.\r\n2.Ingresar el correo registrado.\r\n3.Verificar tu correo electrónico.\r\n4.Ingresar el código de verificación.\r\n5.Restablecer la contraseña:\r\n6.Iniciar sesión con la nueva contraseña.\r\n");
		txtrDirgeteA.setBounds(98, 147, 319, 137);
		return contentPane.add(txtrDirgeteA);
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