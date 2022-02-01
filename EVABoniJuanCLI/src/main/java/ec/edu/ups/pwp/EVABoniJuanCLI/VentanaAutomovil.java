package ec.edu.ups.pwp.EVABoniJuanCLI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAutomovil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAutomovil frame = new VentanaAutomovil();
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
	public VentanaAutomovil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AutomovilesServiceSOAPService auto=new AutomovilesServiceSOAPService();
				//auto.AutomovilesServiceSOAPPo
				
				AutomovilesServiceSOAPService ss = new AutomovilesServiceSOAPService();
		        AutomovilesServiceSOAP port = ss.getAutomovilesServiceSOAPPort();
				
				 System.out.println("Invoking crearAutomovil...");
			        ec.edu.ups.pwp.EVABoniJuanCLI.Automovil auto = null;
			        auto=new Automovil();
			        auto.setPlaca("ABI2222");
			        auto.setPlaca("Toyota");
			        auto.setModelo("YARIS");
			        auto.setTipo("Camioneta");
			        java.lang.String _crearAutomovil__return = port.crearAutomovil(auto);
			        System.out.println("crearAutomovil.result=" + _crearAutomovil__return);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
	}

}
