package vista;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton BotonArticulo;
	public JButton BotonTicket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PInicial frame = new PInicial();
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
	public PInicial() {
		setBounds(100, 100, 450, 300);
		setTitle("Pagina inicial");
		setLocationRelativeTo(null);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		BotonArticulo = new JButton("Articulo");
		BotonArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PArticulo pa = new PArticulo();
				pa.setVisible(true);
				dispose();
			}

		});

		BotonArticulo.setBounds(66, 120, 89, 23);
		contentPane.add(BotonArticulo);

		BotonTicket = new JButton("Ticket");
		BotonTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TicketPanel tp = new TicketPanel();
				tp.setVisible(true);
				dispose();
			}
		});
		BotonTicket.setBounds(252, 120, 89, 23);
		contentPane.add(BotonTicket);
	}
}
