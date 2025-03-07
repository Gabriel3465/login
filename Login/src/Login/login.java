package Login;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
    	setSize(500, 600);
    	setLocationRelativeTo(null);
    	
    	setTitle("Login");    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    	
    	setMaximumSize(new Dimension(700, 700));
    	setMinimumSize(new Dimension(400, 400));
    	
//    	this.add(this.logins());
//    	this.add(this.registro());
//    	this.add(this.scrooll_pane());
//    	this.add(this.loginImagen());
    	
    	//Barra principal de opciones////////////////////////////////////////////////////
    	JMenuBar barra = new JMenuBar();
    	
    	//Opciones 1//////////////////////////////////////////////
    	JMenu file = new JMenu("Archivo");
    	barra.add(file);
    	
    	//Subopciones
    	JMenuItem nuevo = new JMenuItem("Nuevo");
    	file.add(nuevo);
    	
    	JMenuItem abrirArch = new JMenuItem("Abrir archivo");
    	file.add(abrirArch);
    	
    	JMenuItem archivosRecientes = new JMenuItem("Archivos recientes");
    	file.add(archivosRecientes);
    	
    	JMenuItem importar = new JMenuItem("Importar archivo");
    	file.add(importar);
    	
    	JMenuItem guardar = new JMenuItem("Guardar");
    	file.add(guardar);
    	
    	JMenuItem guardarComo = new JMenuItem("Guardar como");
    	file.add(guardarComo);
    	
    	JMenuItem cerrar = new JMenuItem("Cerrar");
    	file.add(cerrar);
    	
    	//Opciones 2////////////////////////////////////////////////
    	JMenu opciones = new JMenu("Opciones");
    	barra.add(opciones);
    	
    	//Subopciones
    	JMenuItem editor = new JMenuItem("Editar");
    	opciones.add(editor);
    	
    	JCheckBoxMenuItem instalarPlantilla = new JCheckBoxMenuItem("Instalar Plantillas");
    	opciones.add(instalarPlantilla);
    	
    	JCheckBoxMenuItem recordarContraseña = new JCheckBoxMenuItem("Recordar contraseña");
    	opciones.add(recordarContraseña);
    	
    	JCheckBoxMenuItem modoOscuro = new JCheckBoxMenuItem("Modo oscuro");
    	opciones.add(modoOscuro);
    	
    	JCheckBoxMenuItem habilitarNotificaciones = new JCheckBoxMenuItem("Activar Notificaciones");
    	opciones.add(habilitarNotificaciones);
    	
 
    	this.setJMenuBar(barra);
    	
    	
    	
    	this.repaint();
    	
    }
    
//    @Override
//	public void paint(Graphics g) {
//		super.paint(g);
//		
//		Graphics2D g2d= (Graphics2D) g.create();
//		
//		g2d.drawRect(100, 100, 80, 80);
//		g2d.setStroke(new BasicStroke(5));
//		
////		g2d.setColor(Color.green);
//		
//		g2d.setColor(Color.green);
//		g2d.fillRect(120, 120, 80, 80);
//		
//		g2d.setColor(Color.orange);
//		g2d.drawLine(0, 0, 200 ,250);
//		
//		g2d.setColor(Color.red);
//		g2d.setFont(new Font("Bahnschrift", Font.BOLD, 25));
//		g2d.drawString("hola", 150, 220);
//		
//		g2d.setColor(Color.decode("#15a9f3"));
//		g2d.drawOval(300, 400, 60, 100);
//		
//		g2d.setColor(Color.decode("#15f3e9"));
//		g2d.fillOval(320, 350, 100, 60);
//		
//		g2d.setColor(Color.decode("#82e708"));
//		g2d.drawArc(350, 100, 90, 80, 0, 180);
//		
//		g2d.setColor(Color.decode("#a3f342"));
//		g2d.fillArc(280, 100, 90, 80, 0, 180);
//		
//		g2d.setColor(Color.green);
//		int[] x = {200, 250, 300}; 
//        int[] y = {200, 150, 200}; 
//        g2d.drawPolygon(x, y, 3);
//        
//        g2d.setColor(Color.orange);
//		int[] x1 = {200, 250, 300}; 
//        int[] y1 = {200, 150, 200}; 
//        g2d.fillPolygon(x1, y1, 3);
//	
//		try {
//			BufferedImage image = ImageIO.read(new File("naranja2.png"));
//			g2d.drawImage(image,150, 300, null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
    
    
    public void paint(Graphics g) {
    	super.paint(g);
		
		Graphics2D g2d= (Graphics2D) g.create();
		
		g2d.setStroke(new BasicStroke(5));
		
		g2d.setColor(Color.decode("#b1f5f2"));//fondo
		g2d.fillRect(0, 50, 500, 600);
		
		g2d.setColor(Color.decode("#ad8429"));//vallas en horizontal
		g2d.fillRect(0, 375, 500, 15);
		g2d.fillRect(0, 420, 500, 15);

		g2d.setColor(Color.decode("#14a20f"));//cesped
		g2d.fillRect(0, 440, 500, 75);
		
		g2d.setColor(Color.decode("#87a7a7"));//calle
		g2d.fillRect(0, 515, 500, 85);
		
		g2d.setColor(Color.decode("#ecbb17"));//pared
		g2d.fillRect(125, 250, 250, 200);
		
		g2d.setColor(Color.decode("#fc5e14"));//puerta
		g2d.fillRect(220, 350, 60, 100);
		
		g2d.setColor(Color.decode("#503200"));//perilla
		g2d.fillRect(270, 400, 5, 5);
		
		g2d.setColor(Color.decode("#c31106"));//techo
		g2d.fillRect(125, 150, 250, 100);
		
		int[] xIzq = {125, 125, 50}; 
	    int[] yIzq = {150, 250, 250}; 
	    g2d.fillPolygon(xIzq, yIzq, 3);
	    
	    int[] xDer = {375, 375, 450};
	    int[] yDer = {150, 250, 250}; 
	    g2d.fillPolygon(xDer, yDer, 3);
	    
	    g2d.setColor(Color.decode("#df6900"));//chimenea
	    g2d.fillRect(300, 100, 40, 50);
	    
		g2d.setColor(Color.decode("#df2900"));
	    g2d.fillRect(290, 100, 60, 20);
	    
		g2d.setColor(Color.decode("#87a7a7"));
		g2d.fillRect(150, 270, 50, 50);//ventana 1
		g2d.fillRect(300, 270, 50, 50);//ventana 2
		
		//cruz ventana 1
		g2d.setColor(Color.decode("#fc5e14"));
		g2d.drawLine(150, 295, 200, 295);
		g2d.drawLine(175, 270, 175, 320);
		
		// Cruz ventana 2
		g2d.drawLine(300, 295, 350, 295); 
		g2d.drawLine(325, 270, 325, 320); 

		//cercas
		g2d.setColor(Color.decode("#e1b759"));
		g2d.fillRect(95, 360, 15, 90);
		g2d.fillRect(65, 360, 15, 90);
		g2d.fillRect(35, 360, 15, 90);
		g2d.fillRect(5, 360, 15, 90);
		
		for (int x = 390; x <= 480; x +=30) {
		    g2d.fillRect(x, 360, 15, 90);
		}
		
		//for que hace la lineas de las calles
		g2d.setColor(Color.decode("#e4eb00"));
		for (int x = 0; x <= 500; x += 80) {
			g2d.fillRect(x, 545, 40, 20);
		}
		
    }
    
    public JPanel loginImagen() {
        JPanel contenedor = new JPanel();
        contenedor.setLayout(null); // Desactivar layout para colocar los paneles manualmente
        contenedor.setSize(1000, 800);

        // Panel izquierdo (azul)
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(Color.decode("#004E70"));
        panelIzquierdo.setBounds(0, 0, 500, 800); // Primera mitad
        panelIzquierdo.setLayout(null);
        
        // Panel derecho
        JPanel panelDerecho = new JPanel();
        panelDerecho.setBounds(500, 0, 500, 800);
        panelDerecho.setLayout(null);
        
        // imagen de fondo
        ImageIcon fondoIcono = new ImageIcon("fondoDeInterfaz1.png");
        Image imagenEscalada = fondoIcono.getImage().getScaledInstance(500, 800, Image.SCALE_SMOOTH);
        JLabel fondoLabel = new JLabel(new ImageIcon(imagenEscalada));
        fondoLabel.setBounds(0, 0, 500, 800); // Ajustar al tamaño del panel
        panelDerecho.add(fondoLabel);
        
        //imagen de logo
        ImageIcon fondoLogo = new ImageIcon("logo.png");
        Image imagenEscalada3 = fondoLogo.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JLabel fondoLabel3 = new JLabel(new ImageIcon(imagenEscalada3));
        fondoLabel3.setBounds(210,  20, 50, 50); // Ajustar al tamaño del panel
        panelIzquierdo.add(fondoLabel3);
        
        //icoono de usuario
        ImageIcon contraseña = new ImageIcon("usuario.png");
        Image imagenEscalada4 = contraseña.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        JLabel fondoLabel_4 = new JLabel(new ImageIcon(imagenEscalada4));
        fondoLabel_4.setBounds(110, 160, 40, 40);
        panelIzquierdo.add(fondoLabel_4);
        
        //icono de contraseña
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

        // Agregar ambos paneles al contenedor
        contenedor.add(panelIzquierdo);
        contenedor.add(panelDerecho);

        return contenedor;
    }
  
    public JPanel logins() {
    	
    	JPanel elPanel = new JPanel();
    	
    	elPanel.setBackground(Color.decode("#917841"));
    	elPanel.setOpaque(true);
    	elPanel.setSize(500, 800);
    	elPanel.setLocation(0, 0);
    	elPanel.setLayout(null);//quita todo el molde+

    	JLabel etiqueta1 = new JLabel("Inicio de sesion");
    	etiqueta1.setSize(200, 40);
    	etiqueta1.setLocation(140, 20);
    	etiqueta1.setHorizontalAlignment(JLabel.CENTER);
    	etiqueta1.setFont(new Font("Bahnschrift",Font.BOLD,20));
    	elPanel.add(etiqueta1);
    	
    	JLabel etiqueta2 = new JLabel("Ingrese su correo: ");
    	etiqueta2.setSize(200, 40);
    	etiqueta2.setLocation(140, 100);
    	etiqueta2.setFont(new Font("Bahnschrift",Font.BOLD,15));
    	elPanel.add(etiqueta2);
    	
    	JTextField email = new JTextField();
    	email.setSize(200, 40);
    	email.setLocation(140, 140);
    	email.setFont(new Font("Bahnschrift",Font.BOLD,15));
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
    	registro.setLocation(500, 0);
    	registro.setLayout(null);//quita todo el molde
    	
    	JLabel etiqueta1R = new JLabel("Registro");
    	etiqueta1R.setSize(200, 40);
    	etiqueta1R.setLocation(640, 20);
    	etiqueta1R.setHorizontalAlignment(JLabel.CENTER);
    	etiqueta1R.setFont(new Font("Bahnschrift",Font.BOLD,20));
        registro.add(etiqueta1R);
    	
    	JLabel etiqueta2 = new JLabel("Ingrese su correo: ");
    	etiqueta2.setSize(200, 40);
    	etiqueta2.setLocation(640, 100);
    	etiqueta2.setFont(new Font("Bahnschrift",Font.BOLD,15));
    	registro.add(etiqueta2);
    	
    	JTextField email = new JTextField();
    	email.setSize(200, 40);
    	email.setLocation(640, 140);
    	email.setFont(new Font("Bahnschrift",Font.BOLD,15));
    	registro.add(email);
    	
        JLabel etiqueta3 = new JLabel("Ingrese su contraseña:");
        etiqueta3.setSize(200, 40);
        etiqueta3.setLocation(640, 180);
        etiqueta3.setFont(new Font("Bahnschrift", Font.BOLD, 15));
        registro.add(etiqueta3);

        JPasswordField password = new JPasswordField();
        password.setSize(200, 40);
        password.setLocation(640, 220);
        password.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        registro.add(password);
        
        JLabel OlvidoContrasena = new JLabel("¿Olvidó su contraseña?");
        OlvidoContrasena.setSize(200, 20);
        OlvidoContrasena.setLocation(720, 260);
        OlvidoContrasena.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
        registro.add(OlvidoContrasena);
        
        JButton botonAcceder = new JButton("Acceder");
        botonAcceder.setSize(120, 40);
        botonAcceder.setLocation(690, 300);
        botonAcceder.setFont(new Font("Bahnschrift", Font.BOLD, 15));
        registro.add(botonAcceder);
        
        JLabel CrearCuenta = new JLabel("¿No tienes cuenta? Crear cuenta");
        CrearCuenta.setSize(200, 20);
        CrearCuenta.setLocation(660, 350);
        CrearCuenta.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
        registro.add(CrearCuenta);
    	
        JButton volver = new JButton("Volver");
        volver.setSize(75, 40);
        volver.setLocation(520, 20);
        volver.setFont(new Font("Bahnschrift", Font.BOLD, 10));
        registro.add(volver);
        
        JLabel animal = new JLabel("¿Mascota favorita?");
        animal.setSize(200, 20);
        animal.setLocation(600, 390);
        animal.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
        registro.add(animal);
        
        JCheckBox animal1 = new JCheckBox("Gatos");
        animal1.setBounds(600, 400, 200, 40);
        animal1.setOpaque(false);
        registro.add(animal1);
        
        JCheckBox animal2 = new JCheckBox("Perros");
        animal2.setBounds(600, 430, 200, 40);
        animal2.setOpaque(false);
        registro.add(animal2);
        
        JRadioButton terms1 = new JRadioButton("Acepto los terminos");
        terms1.setSize(200, 40);
        terms1.setLocation(650, 480);
        registro.add(terms1);
        
        JRadioButton terms2 = new JRadioButton("NO acepto los terminos");
        terms2.setSize(200, 40);
        terms2.setLocation(650, 530);
        registro.add(terms2);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(terms1);
        grupo.add(terms2);
        
        JLabel comentario = new JLabel("Comentarios");
        comentario.setSize(200, 20);
        comentario.setLocation(570, 600);
        comentario.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
        registro.add(comentario);
        
        JTextArea comentario1 = new JTextArea(10, 10);
        comentario1.setSize(350, 100);
        comentario1.setLocation(570, 620);
        registro.add(comentario1);
        
        
        
        
        
    	
    	
    	return registro;
    	
    	
    	
    	
    }
    
    public JPanel scrooll_pane() {
    	
    	JPanel panel = new JPanel();
    	
    	panel.setBackground(Color.decode("#917841"));
    	panel.setOpaque(true);
    	panel.setSize(1000, 800);
    	panel.setLocation(0, 0);
    	panel.setLayout(null);//quita todo el molde
    	
    	JLabel etiqueta1 = new JLabel("Inicio de sesion");
    	etiqueta1.setSize(200, 40);
    	etiqueta1.setLocation(400, 20);
    	etiqueta1.setHorizontalAlignment(JLabel.CENTER);
    	etiqueta1.setFont(new Font("Bahnschrift",Font.BOLD,20));
    	panel.add(etiqueta1);
    	
    	   Object data[][]={ {"Marisol","19","si"},    
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"Marisol","19","si"},    
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"Marisol","19","si"},    
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"Marisol","19","si"},    
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"Marisol","19","si"},    
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"Marisol","19","si"},    
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"Marisol","19","si"},    
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            {"Marisol","19","si"},    
    	            {"carlos","29","si"},    
    	            {"javier","25","no"},
    	            };    
    	    String titles[]={"Nombre","Años","si / no??"};   
    	    
    	    
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
        	etiqueta21.setFont(new Font("Bahnschrift",Font.BOLD,15));
        	panel.add(etiqueta21);
        	
        	JLabel etiqueta22 = new JLabel("34");
        	etiqueta22.setSize(200, 40);
        	etiqueta22.setLocation(170, 70);
        	etiqueta22.setFont(new Font("Bahnschrift",Font.BOLD,15));
        	panel.add(etiqueta22);
    
    	return panel;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new login());
    }
}