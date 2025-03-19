package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

public class pruebas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebas frame = new pruebas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pruebas() {
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
//		btnNewButton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				router("login");
//			}
//		});
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
		contentPane.add(scrollPane);
	}
}
