package Login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
    	
    	//this.add(this.logins());
    	this.add(this.scrooll_pane());
    	
    	this.repaint();
    	
    }
   
    
    public JPanel logins() {
    	
    	JPanel elPanel = new JPanel();
    	
    	elPanel.setBackground(Color.decode("#917841"));
    	elPanel.setOpaque(true);
    	elPanel.setSize(500, 500);
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
        
        JRadioButton terms1 = new JRadioButton("Acepto los terminos");
        terms1.setSize(200, 40);
        terms1.setLocation(40, 500);
        elPanel.add(terms1);
        
        JRadioButton terms2 = new JRadioButton("Acepto los terminos");
        terms2.setSize(200, 40);
        terms2.setLocation(40, 550);
        elPanel.add(terms2);
    
    	
    	return elPanel;
    }
    
 public JPanel scrooll_pane() {
    	
    	JPanel elPanel = new JPanel();
    	
    	elPanel.setBackground(Color.decode("#917841"));
    	elPanel.setOpaque(true);
    	elPanel.setSize(500, 500);
    	elPanel.setLocation(0, 0);
    	elPanel.setLayout(null);//quita todo el molde
    	
    	JLabel etiqueta1 = new JLabel("Inicio de sesion");
    	etiqueta1.setSize(200, 40);
    	etiqueta1.setLocation(400, 20);
    	etiqueta1.setHorizontalAlignment(JLabel.CENTER);
    	etiqueta1.setFont(new Font("Bahnschrift",Font.BOLD,20));
    	elPanel.add(etiqueta1);
    	
    	
    	
    	
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
    	    elPanel.add(scroll_pane);
    	    
    	    JButton botonDes = new JButton("Descargar");
            botonDes.setSize(100, 30);
            botonDes.setLocation(670, 70);
            botonDes.setFont(new Font("Bahnschrift", Font.BOLD, 11));
            elPanel.add(botonDes);
            
            JButton botonAd = new JButton("Añadir");
            botonAd.setSize(100, 30);
            botonAd.setLocation(800, 70);
            botonAd.setFont(new Font("Bahnschrift", Font.BOLD, 11));
            elPanel.add(botonAd);
            
            JLabel etiqueta21 = new JLabel("Alumnos:");
        	etiqueta21.setSize(200, 40);
        	etiqueta21.setLocation(140, 50);
        	etiqueta21.setFont(new Font("Bahnschrift",Font.BOLD,15));
        	elPanel.add(etiqueta21);
        	
        	JLabel etiqueta22 = new JLabel("34");
        	etiqueta22.setSize(200, 40);
        	etiqueta22.setLocation(170, 70);
        	etiqueta22.setFont(new Font("Bahnschrift",Font.BOLD,15));
        	elPanel.add(etiqueta22);
    	
    	
    	
    	
    	
    	return elPanel;
    }
    
    
  
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new login());
    }
}