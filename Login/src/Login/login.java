package Login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class login extends JFrame {


    public login() {
    	
    	setVisible(true);
    	setSize(500, 500);
    	setLocationRelativeTo(null);
    	
    	setTitle("Login");    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    	
    	setMaximumSize(new Dimension(700, 700));
    	setMinimumSize(new Dimension(400, 400));
    	
    	this.add(this.logins());
    	this.repaint();
    	
    }
    
    public JPanel logins() {
    	
    	JPanel elPanel = new JPanel();
    	
    	elPanel.setBackground(Color.decode("#917841"));
    	elPanel.setOpaque(true);
    	elPanel.setSize(500, 500);
    	elPanel.setLocation(0, 0);
    	elPanel.setLayout(null);//quita todo el molde
    	
    	JLabel etiqueta1 = new JLabel("Bienvenido");
    	etiqueta1.setSize(200, 40);
    	etiqueta1.setLocation(140, 20);
    	etiqueta1.setHorizontalAlignment(JLabel.CENTER);
    	etiqueta1.setFont(new Font("Bahnschrift",Font.BOLD,20));
    	elPanel.add(etiqueta1);
    	
    	JLabel etiqueta2 = new JLabel("Ingrese su correo; ");
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
    	
        JButton btnVolver = new JButton("Volver");
        btnVolver.setSize(75, 40);
        btnVolver.setLocation(20, 20);
        btnVolver.setFont(new Font("Bahnschrift", Font.BOLD, 10));
        
        elPanel.add(btnVolver);
    
    	
    	return elPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new login());
    }
}