package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Ventana2 {

	private JFrame frame;
	private JTextField txtBodoque;
	private JTextField txtPredro;
	private JTextField txtCastillo;
	private JTextField txtDdmmaaaa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registros de usuarios");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		panel.setForeground(new Color(0, 128, 64));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 128));
		panel_1.setForeground(new Color(0, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(new GridLayout(7, 1,0,10));
		panel_5.setBackground(new Color(128, 255, 128));
		panel_5.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 0));
		panel_1.add(panel_5, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres:");
		panel_5.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido Paterno:");
		panel_5.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Materno:");
		panel_5.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de nacimiento");
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo:l");
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_5.add(panel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Nacionalidad:");
		panel_5.add(lblNewLabel_6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(new GridLayout(7, 1,0,10));
		panel_6.setBackground(new Color(128, 255, 128));
		panel_6.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 30));
		panel_1.add(panel_6, BorderLayout.CENTER);
		
		txtPredro = new JTextField();
		txtPredro.setText("Predro");
		panel_6.add(txtPredro);
		txtPredro.setColumns(10);
		
		txtBodoque = new JTextField();
		txtBodoque.setText("Bodoque");
		panel_6.add(txtBodoque);
		txtBodoque.setColumns(10);
		
		txtCastillo = new JTextField();
		txtCastillo.setText("oradz");
		panel_6.add(txtCastillo);
		txtCastillo.setColumns(10);
		
		txtDdmmaaaa = new JTextField();
		txtDdmmaaaa.setText("DD/MM/AAAA");
		panel_6.add(txtDdmmaaaa);
		txtDdmmaaaa.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setOpaque(false);
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setOpaque(false);
		panel_6.add(rdbtnNewRadioButton_1);
		
		ButtonGroup grupo = new ButtonGroup();
        grupo.add(rdbtnNewRadioButton);
        grupo.add(rdbtnNewRadioButton);
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("México");
        comboBox.addItem("Perú");
        comboBox.addItem("Argentina");
        comboBox.addItem("Colombia");
        comboBox.addItem("Chile");
        comboBox.addItem("Ecuador");
        comboBox.addItem("España");
        comboBox.addItem("Venezuela");
        panel_6.add(comboBox);
        
        JLabel lblNewLabel_8 = new JLabel("Datos generales");
        panel_1.add(lblNewLabel_8, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 128, 192));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 128, 64));
		panel_2.add(panel_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_7 = new JLabel("Perfil de ususario");
		panel_10.add(lblNewLabel_7);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 128, 64));
		panel_11.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));
		panel_2.add(panel_11, BorderLayout.CENTER);
		panel_11.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setForeground(new Color(0, 128, 128));
		panel_11.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Imagen");
		lblNewLabel_9.setHorizontalAlignment(JLabel.CENTER);
		panel_8.add(lblNewLabel_9, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 128, 64));
		panel_12.setLayout(new GridLayout(2, 1,0,10));
		panel_2.add(panel_12, BorderLayout.SOUTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setHorizontalAlignment(JLabel.CENTER);
		chckbxNewCheckBox.setOpaque(false);
		panel_12.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox_1.setHorizontalAlignment(JLabel.CENTER);
		chckbxNewCheckBox_1.setOpaque(false);
		panel_12.add(chckbxNewCheckBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 192));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Datos Opcionales");
		panel_3.add(lblNewLabel_10, BorderLayout.NORTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(128, 128, 192));
		panel_3.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(128, 128, 192));
		panel_13.setBorder(BorderFactory.createEmptyBorder(40, 20, 40, 10));
		panel_9.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("Descripción");
		panel_13.add(lblNewLabel_11, BorderLayout.NORTH);
		
		JTextArea textArea_1 = new JTextArea();
		panel_13.add(textArea_1, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(128, 128, 192));
		panel_14.setBorder(BorderFactory.createEmptyBorder(40, 10, 40, 20));
		panel_9.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Preferencias");
		panel_14.add(lblNewLabel_12, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		panel_14.add(textArea, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 128, 0));
		panel_4.setBorder(BorderFactory.createEmptyBorder(40, 90, 40, 90));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 1, 20, 40));
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Guardar");
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Salir");
		panel_4.add(btnNewButton_2);
		frame.setBounds(100, 100, 617, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
