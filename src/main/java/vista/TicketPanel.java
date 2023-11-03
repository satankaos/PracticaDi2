package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketPanel frame = new TicketPanel();
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
	public TicketPanel() {
		setTitle("Ticket");
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAltaTicket = new JButton("Alta Ticket");
		btnAltaTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaTicket at=new AltaTicket();
				at.setVisible(true);
				dispose();
			}
		});
		btnAltaTicket.setBounds(52, 120, 89, 23);
		contentPane.add(btnAltaTicket);
		
		JButton btnConsTicket = new JButton("Consulta Ticket");
		btnConsTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaTicket ct=new ConsultaTicket();
				ct.setVisible(true);
				dispose();
			}
		});
		btnConsTicket.setBounds(264, 120, 136, 23);
		contentPane.add(btnConsTicket);
		
		JButton btnNewButton = new JButton("volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PInicial pi = new PInicial();
				pi.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(159, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
