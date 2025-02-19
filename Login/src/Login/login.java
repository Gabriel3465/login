package Login;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class login extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public login() {
    	setTitle("Login");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        JLabel userLabel = new JLabel("Usuario:");
        userField = new JTextField();
        JLabel passLabel = new JLabel("Contraseña:");
        passField = new JPasswordField();

        inputPanel.add(userLabel);
        inputPanel.add(userField);
        inputPanel.add(passLabel);
        inputPanel.add(passField);

        loginButton = new JButton("Iniciar sesión");
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            if (validateLogin(username, password)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(inputPanel, BorderLayout.NORTH);
        add(loginButton, BorderLayout.SOUTH);
    }


    private boolean validateLogin(String username, String password) {
        return username.equals("admin") && password.equals("1234");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new login().setVisible(true));
    }
}
