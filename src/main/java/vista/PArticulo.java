package vista;

import java.awt.Component;
import java.awt.EventQueue;
import vista.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PArticulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PArticulo frame = new PArticulo();
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
	public PArticulo() {
		setTitle("Articulo");
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAltaArticulo = new JButton("Alta");
		btnAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAltaArticulo ja= new JAltaArticulo();
				ja.setVisible(true);
				dispose();
			}
		});
		btnAltaArticulo.setBounds(28, 55, 107, 51);
		contentPane.add(btnAltaArticulo);
		
		JButton VolverPanel2 = new JButton("volver");
		VolverPanel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PInicial pi=new PInicial();
				pi.setVisible(true);
				dispose();}});
		VolverPanel2.setBounds(161, 323, 89, 23);
		contentPane.add(VolverPanel2);
		
		JButton btnBajaArticulo = new JButton("Baja");
		btnBajaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JBajaArticulo ba=new JBajaArticulo();
				ba.setVisible(true);
				dispose();
			}
		});
		btnBajaArticulo.setBounds(275, 55, 107, 51);
		contentPane.add(btnBajaArticulo);
		
		JButton btnConsultaArticulo = new JButton("consulta");
		btnConsultaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JConsultaArticulo ca=new JConsultaArticulo();
				ca.setVisible(true);
				dispose();
			}
		});
		btnConsultaArticulo.setBounds(28, 142, 107, 51);
		contentPane.add(btnConsultaArticulo);
		
		JButton btnModArticulo = new JButton("modificacion");
		btnModArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JModificacionArticulo ma=new JModificacionArticulo();
				ma.setVisible(true);
				dispose();
			}
		});
		btnModArticulo.setBounds(275, 142, 107, 51);
		contentPane.add(btnModArticulo);
	
	}

}
