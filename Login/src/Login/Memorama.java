package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Memorama extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public int c1 = -1, c2 = -1;
	public JButton btn1, btn2; 
	ArrayList<JButton> listaBotones = new ArrayList<JButton>();
	public int aciertos = 0;
	public int movimientos =0;
	private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_1; 
	public int cartas[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8 };

	public void barajear() {
		Random random = new Random();
		for (int i = cartas.length - 1; i > 0; i--) {
			int index = random.nextInt(i + 1);
			int temp = cartas[i];
			cartas[i] = cartas[index];
			cartas[index] = temp;
		}
	}

	public void mostrarCartas() {
		for (int carta : cartas) {
			System.out.print(carta + " ");
		}
		System.out.println();
	}
	
	public void darOrden(int posicion, JButton boton) {

		movimientos ++;
		lblNewLabel_3.setText("Movimientos; "+ movimientos+"    ");
		if (c1 == -1) {
			c1 = cartas[posicion];
			btn1 = boton;
		} else if (c2 == -1) {
			c2 = cartas[posicion];
			btn2 = boton;

			if (btn1 == btn2) {
				System.out.println("NO");

				Timer timer = new Timer(1000, new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btn1.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
						btn2.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
						c1 = -1;
						c2 = -1;
					}
				});
				timer.setRepeats(false);
				timer.start();

			} else if (c1 == c2) {
				aciertos ++;
				System.out.println(aciertos);
                lblNewLabel_1.setText("Aciertos: " + aciertos); 

				btn1.setEnabled(false); 
				btn2.setEnabled(false);

				c1 = -1;
				c2 = -1;
				if (aciertos == 8) {
					int opcion = JOptionPane.showOptionDialog(null, "Se acabo", "Fin del Juego", JOptionPane.YES_NO_OPTION,
							JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Reiniciar", "Salir" }, "Reiniciar");
					if (opcion == JOptionPane.YES_OPTION) {
						reiniciar();
					} else {
						System.exit(0);
					}				}
			} else {
				Timer timer = new Timer(500, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn1.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
                        btn2.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
                        c1 = c2 = -1;
                    }
                });
                timer.setRepeats(false);
                timer.start();
			}
		}
	}
	
	public void reiniciar() {
		aciertos = 0;
		lblNewLabel_1.setText("Aciertos: " + aciertos);

		movimientos = 0;
		lblNewLabel_3.setText("Movimientos; " + movimientos+"    ");

		c1 = -1;
		c2 = -1;
		
		barajear();
		mostrarCartas();
		
		for (Iterator iterator = listaBotones.iterator(); iterator.hasNext();) {
			JButton jButton = (JButton) iterator.next();

			jButton.setEnabled(true);
			jButton.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
			

		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorama frame = new Memorama();
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
	public Memorama() {

		mostrarCartas();
		barajear();
		mostrarCartas();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 601);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#652E91"));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Memorama");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#652E91"));
		contentPane.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		lblNewLabel_1 = new JLabel("   Aciertos: 0");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("   Tiempo: ");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("   Movimiento:        ");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#652E91"));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 4, 5, 5));
		
		
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[0]+".png")));
				darOrden(0, button);
			}
		});
		button.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(button);
		listaBotones.add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[1]+".png")));
				darOrden(1, btnNewButton);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton);
		listaBotones.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[2]+".png")));
				darOrden(2, btnNewButton_1);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_1);
		listaBotones.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[3]+".png")));
				darOrden(3, btnNewButton_2);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_2);
		listaBotones.add(btnNewButton_2);

		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[4]+".png")));
				darOrden(4, btnNewButton_3);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_3);
		listaBotones.add(btnNewButton_3);

		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[5]+".png")));
				darOrden(5, btnNewButton_4);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_4);
		listaBotones.add(btnNewButton_4);

		
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[6]+".png")));
				darOrden(6, btnNewButton_5);
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_5);
		listaBotones.add(btnNewButton_5);

		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_6.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[7]+".png")));
				darOrden(7, btnNewButton_6);
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_6);
		listaBotones.add(btnNewButton_6);

		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_7.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[8]+".png")));
				darOrden(8, btnNewButton_7);
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_7);
		listaBotones.add(btnNewButton_7);

		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[9]+".png")));
				darOrden(9, btnNewButton_8);
			}
		});
		panel_2.add(btnNewButton_8);
		listaBotones.add(btnNewButton_8);

		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_9.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[10]+".png")));
				darOrden(10, btnNewButton_9);
			}
		});
		btnNewButton_9.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_9);
		listaBotones.add(btnNewButton_9);

		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_10.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[11]+".png")));
				darOrden(11, btnNewButton_10);
			}
		});
		btnNewButton_10.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_10);
		listaBotones.add(btnNewButton_10);

		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_11.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[12]+".png")));
				darOrden(12, btnNewButton_11);
			}
		});
		btnNewButton_11.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_11);
		listaBotones.add(btnNewButton_11);

		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_12.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[13]+".png")));
				darOrden(13, btnNewButton_12);
			}
		});
		btnNewButton_12.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_12);
		listaBotones.add(btnNewButton_12);

		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_13.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[14]+".png")));
				darOrden(14, btnNewButton_13);
			}
		});
		btnNewButton_13.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_13);
		listaBotones.add(btnNewButton_13);

		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_14.setIcon(new ImageIcon(Memorama.class.getResource("/Login/memorama"+cartas[15]+".png")));
				darOrden(15, btnNewButton_14);
			}
		});
		btnNewButton_14.setIcon(new ImageIcon(Memorama.class.getResource("/Login/imagenPregunta (1).jpg")));
		panel_2.add(btnNewButton_14);
		listaBotones.add(btnNewButton_14);

		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#652E91"));
		contentPane.add(panel_3, BorderLayout.SOUTH);

		JButton btnNewButton_15 = new JButton("Reiniciar");
		btnNewButton_15.setForeground(new Color(0, 0, 0));
		btnNewButton_15.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 10));
		btnNewButton_15.setBackground(Color.decode("#F9B300"));
		
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		panel_3.add(btnNewButton_15);

	}
	

}
