package Login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    	
    	this.add(this.logins());
    	this.add(this.registro());
    	//this.add(this.scrooll_pane());
    	
    	this.repaint();
    	
    }
   
    
    public JPanel logins() {
    	
    	JPanel elPanel = new JPanel();
    	
    	elPanel.setBackground(Color.decode("#917841"));
    	elPanel.setOpaque(true);
    	elPanel.setSize(this.getWidth()/2, this.getHeight());
    	elPanel.setLocation(0, 0);
    	elPanel.setLayout(null);//quita todo el molde
    	
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