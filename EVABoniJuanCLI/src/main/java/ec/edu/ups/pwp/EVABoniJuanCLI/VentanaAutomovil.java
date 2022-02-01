package ec.edu.ups.pwp.EVABoniJuanCLI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VentanaAutomovil extends JFrame {

	private JPanel contentPane;
	private JTextField placa;
	private JTextField modelo;
	private JTextField marca;
	private JTextField tipo;

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
		setContentPane(contentPane);
		
		JButton crear = new JButton("crear");
		crear.setBounds(182, 195, 90, 38);
		crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AutomovilesServiceSOAPService auto=new AutomovilesServiceSOAPService();
				//auto.AutomovilesServiceSOAPPo
				
				AutomovilesServiceSOAPService ss = new AutomovilesServiceSOAPService();
		        AutomovilesServiceSOAP port = ss.getAutomovilesServiceSOAPPort();
		        
		        
				
				 System.out.println("Invoking crearAutomovil...");
			        ec.edu.ups.pwp.EVABoniJuanCLI.Automovil auto = null;
			        auto=new Automovil();
			        auto.setPlaca(placa.getText());
			        auto.setMarca(marca.getText());
			        auto.setModelo(modelo.getText());
			        auto.setTipo(tipo.getText());
			        java.lang.String _crearAutomovil__return = port.crearAutomovil(auto);
			        System.out.println("crearAutomovil.result=" + _crearAutomovil__return);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(crear);
		
		placa = new JTextField();
		placa.setBounds(176, 77, 96, 19);
		contentPane.add(placa);
		placa.setColumns(10);
		
		JLabel Placa = new JLabel("Placa");
		Placa.setBounds(104, 80, 45, 13);
		contentPane.add(Placa);
		
		JLabel lblModelo = new JLabel("modelo");
		lblModelo.setBounds(104, 103, 45, 13);
		contentPane.add(lblModelo);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(104, 133, 45, 13);
		contentPane.add(lblMarca);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(104, 162, 45, 13);
		contentPane.add(lblTipo);
		
		modelo = new JTextField();
		modelo.setColumns(10);
		modelo.setBounds(176, 100, 96, 19);
		contentPane.add(modelo);
		
		marca = new JTextField();
		marca.setColumns(10);
		marca.setBounds(176, 130, 96, 19);
		contentPane.add(marca);
		
		tipo = new JTextField();
		tipo.setColumns(10);
		tipo.setBounds(176, 159, 96, 19);
		contentPane.add(tipo);
	}
}
