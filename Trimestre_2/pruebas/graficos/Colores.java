package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// TODO Nuestro Potenciometro
import dpm.bloque5.excepciones.Potenciometro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Colores {

	private JFrame frmPruebaClase;
	private JTextField txtRojo;
	private JTextField txtVerde;
	private JTextField txtAzul;
	private JTextArea pColor;
	
	// TODO Nuestro Potenciometro
	private Potenciometro rojo,verde,azul;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colores window = new Colores();
					window.frmPruebaClase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Colores() {
		initialize();

		// TODO Nuestro Potenciometro
//		float[] valores1 = {0,40,80,120,160,200,255};
//		float[] valores2 = {0,90,180,255};
		float[] valores3 = {0,20,40,60,80,90,100,110,120,
							130,140,150,160,170,180,190,200,
							210,220,230,240,255};
		rojo=new Potenciometro(valores3);
		verde=new Potenciometro(valores3);
		azul=new Potenciometro(valores3);
		actualizarPaneles();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPruebaClase = new JFrame();
		frmPruebaClase.setTitle("Prueba clase  - Potenciometro -");
		frmPruebaClase.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmPruebaClase.setResizable(false);
		frmPruebaClase.setBounds(100, 100, 1066, 372);
		frmPruebaClase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPruebaClase.getContentPane().setLayout(null);
		
		
		pColor = new JTextArea();
		pColor.setBackground(Color.BLACK);
		pColor.setRows(9);
		pColor.setEditable(false);
		pColor.setBounds(22, 242, 1015, 94);
		frmPruebaClase.getContentPane().add(pColor);

		
		JPanel controlesRojo = new JPanel();
		controlesRojo.setBackground(Color.RED);
		controlesRojo.setBounds(22, 12, 1015, 67);
		frmPruebaClase.getContentPane().add(controlesRojo);
		
		JButton rojoBajar = new JButton("Bajar");
		rojoBajar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Nuestro Potenciometro
				rojo.bajar();
				actualizarPaneles();
			}
		});
		controlesRojo.add(rojoBajar);
		
		JButton rojoSubir = new JButton("Subir");
		rojoSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Nuestro Potenciometro
				rojo.subir();
				actualizarPaneles();
			}
		});
		controlesRojo.add(rojoSubir);
		
		txtRojo = new JTextField();
		txtRojo.setHorizontalAlignment(SwingConstants.CENTER);
		txtRojo.setEditable(false);
		controlesRojo.add(txtRojo);
		txtRojo.setColumns(90);
		
		JPanel controlesVerde = new JPanel();
		controlesVerde.setBackground(Color.GREEN);
		controlesVerde.setBounds(22, 91, 1015, 67);
		frmPruebaClase.getContentPane().add(controlesVerde);
		
		JButton verdeBajar = new JButton("Bajar");
		verdeBajar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Nuestro Potenciometro
				verde.bajar();
				actualizarPaneles();
			}
		});
		controlesVerde.add(verdeBajar);
		
		JButton verdeSubir = new JButton("Subir");
		verdeSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Nuestro Potenciometro
				verde.subir();
				actualizarPaneles();
			}
		});
		controlesVerde.add(verdeSubir);
		
		txtVerde = new JTextField();
		txtVerde.setHorizontalAlignment(SwingConstants.CENTER);
		txtVerde.setEditable(false);
		txtVerde.setColumns(90);
		controlesVerde.add(txtVerde);
		
		JPanel controlesAzul = new JPanel();
		controlesAzul.setBackground(Color.BLUE);
		controlesAzul.setBounds(22, 171, 1015, 61);
		frmPruebaClase.getContentPane().add(controlesAzul);
		
		JButton azulBajar = new JButton("Bajar");
		azulBajar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Nuestro Potenciometro
				azul.bajar();
				actualizarPaneles();
			}
		});
		controlesAzul.add(azulBajar);
		
		JButton azulSubir = new JButton("Subir");
		azulSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Nuestro Potenciometro
				azul.subir();
				actualizarPaneles();
			}
		});
		controlesAzul.add(azulSubir);
		
		txtAzul = new JTextField();
		txtAzul.setHorizontalAlignment(SwingConstants.CENTER);
		txtAzul.setEditable(false);
		txtAzul.setColumns(90);
		controlesAzul.add(txtAzul);		
	}
	private void actualizarPaneles() {
		// TODO Nuestro Potenciometro
		pColor.setBackground(new Color((int)rojo.getPotencia(),
							 		   (int)verde.getPotencia(),
							 		   (int)azul.getPotencia()));
		txtRojo.setText("Rojo"+ rojo);
		txtVerde.setText("Intensidad de verde: "+verde.getPotencia());
		txtAzul.setText("Valor elegido de intensidad azul: "+azul.getPosicion());
	}
}
