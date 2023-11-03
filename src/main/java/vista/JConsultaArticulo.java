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

public class JConsultaArticulo extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descriConsultaArticulo;
	private JTextField precioConsultaArticulo;
	private JTextField cantidadConsultaArticulo;
	private JTextField idConsultaArticulo;

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
	public JConsultaArticulo() {
		setTitle("Consultar Articulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		descriConsultaArticulo = new JTextField();
		descriConsultaArticulo.setBounds(140, 47, 134, 20);
		contentPane.add(descriConsultaArticulo);
		descriConsultaArticulo.setColumns(10);
		
		precioConsultaArticulo = new JTextField();
		precioConsultaArticulo.setBounds(140, 92, 134, 20);
		contentPane.add(precioConsultaArticulo);
		precioConsultaArticulo.setColumns(10);
		
		cantidadConsultaArticulo = new JTextField();
		cantidadConsultaArticulo.setBounds(140, 140, 134, 20);
		contentPane.add(cantidadConsultaArticulo);
		cantidadConsultaArticulo.setColumns(10);
		
		JButton btnGuardarConsultaArticulo = new JButton("Guardar");
		btnGuardarConsultaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarAriculo ma= new MostrarAriculo();
				ma.setVisible(true);
				dispose();
			}
		});
		btnGuardarConsultaArticulo.setBounds(30, 211, 89, 23);
		contentPane.add(btnGuardarConsultaArticulo);
		
		JButton BtnVolverConsultaArticulo = new JButton("Volver");
		BtnVolverConsultaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PArticulo pa= new PArticulo();
				pa.setVisible(true);
				dispose();
			}
		});
		BtnVolverConsultaArticulo.setBounds(185, 211, 89, 23);
		contentPane.add(BtnVolverConsultaArticulo);
		
		JLabel lblNewLabel_3 = new JLabel("id");
		lblNewLabel_3.setBounds(51, 22, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		idConsultaArticulo = new JTextField();
		idConsultaArticulo.setBounds(140, 13, 134, 20);
		contentPane.add(idConsultaArticulo);
		idConsultaArticulo.setColumns(10);
	}
}
