package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarTicket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarTicket frame = new MostrarTicket();
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
	public MostrarTicket() {
		setTitle("Mostrar Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("datos");
		lblNewLabel.setBounds(179, 106, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton BtnVolverMuestra = new JButton("Volver");
		BtnVolverMuestra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaTicket tp=new ConsultaTicket();
				tp.setVisible(true);
				dispose();
			}
		});
		BtnVolverMuestra.setBounds(153, 227, 89, 23);
		contentPane.add(BtnVolverMuestra);
	}
}
