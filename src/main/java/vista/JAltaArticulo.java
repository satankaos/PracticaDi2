package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JAltaArticulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descArticuloalta;
	private JTextField percioArticuloAlta;
	private JTextField cantidadArticuloAlta;
	private JTextField idArticuloAlta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAltaArticulo frame = new JAltaArticulo();
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
	public JAltaArticulo() {
		setTitle("Alta Articulo");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descripcion :");
		lblNewLabel.setBounds(51, 50, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio : ");
		lblNewLabel_1.setBounds(51, 95, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad :");
		lblNewLabel_2.setBounds(51, 143, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		descArticuloalta = new JTextField();
		descArticuloalta.setBounds(140, 47, 134, 20);
		contentPane.add(descArticuloalta);
		descArticuloalta.setColumns(10);
		
		percioArticuloAlta = new JTextField();
		percioArticuloAlta.setBounds(140, 92, 134, 20);
		contentPane.add(percioArticuloAlta);
		percioArticuloAlta.setColumns(10);
		
		cantidadArticuloAlta = new JTextField();
		cantidadArticuloAlta.setBounds(140, 140, 134, 20);
		contentPane.add(cantidadArticuloAlta);
		cantidadArticuloAlta.setColumns(10);
		
		JButton btnGuardarAlta = new JButton("Guardar");
		btnGuardarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarAlta.setBounds(30, 211, 89, 23);
		contentPane.add(btnGuardarAlta);
		
		JButton btnVolverAlta = new JButton("Volver");
		btnVolverAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PArticulo pa= new PArticulo();
				pa.setVisible(true);
				dispose();
			}
		});
		btnVolverAlta.setBounds(185, 211, 89, 23);
		contentPane.add(btnVolverAlta);
		
		JLabel lblNewLabel_3 = new JLabel("id");
		lblNewLabel_3.setBounds(51, 22, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		idArticuloAlta = new JTextField();
		idArticuloAlta.setBounds(140, 13, 134, 20);
		contentPane.add(idArticuloAlta);
		idArticuloAlta.setColumns(10);
	}
}
