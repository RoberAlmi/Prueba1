import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Tunning extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDirección;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tunning frame = new Tunning();
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
	public Tunning() {
		setTitle("Taller de TuNing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Taller TuNing");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		
		JPanel panelDatos = new JPanel();
		panelPrincipal.add(panelDatos);
		panelDatos.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		panelDatos.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_2);
		
		txtApellidos = new JTextField();
		panelDatos.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_3);
		
		txtDirección = new JTextField();
		panelDatos.add(txtDirección);
		txtDirección.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Provincia:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		panelDatos.add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Edad:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		panelDatos.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panelDatos.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Hombre");
		rdbtnNewRadioButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Mujer");
		rdbtnNewRadioButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("No Binario");
		rdbtnNewRadioButton_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_7 = new JLabel("Preferencias:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_7);
		
		JPanel panelCaracteristicas = new JPanel();
		panelPrincipal.add(panelCaracteristicas);
		panelCaracteristicas.setLayout(new GridLayout(4, 2, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tunning");
		panelCaracteristicas.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Equipamiento");
		panelCaracteristicas.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Recambios");
		panelCaracteristicas.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Reparaciones");
		panelCaracteristicas.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Puesta a Punto");
		panelCaracteristicas.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Mantenimiento");
		panelCaracteristicas.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Competici\u00F3n");
		panelCaracteristicas.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Veh\u00EDculos ocasi\u00F3n");
		panelCaracteristicas.add(chckbxNewCheckBox_7);
		
		JPanel panelExtra = new JPanel();
		panelPrincipal.add(panelExtra);
		panelExtra.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Comentarios:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panelExtra.add(lblNewLabel_8);
		
		JTextArea textArea = new JTextArea();
		panelExtra.add(textArea);
		
		JLabel lblNewLabel_9 = new JLabel("");
		panelExtra.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		panelExtra.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Pedidos:");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		panelExtra.add(lblNewLabel_11);
		
		JTextArea textArea_1 = new JTextArea();
		panelExtra.add(textArea_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Enviar");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		panel.add(btnNewButton_1);
		comboBox_1.addItem("18");
	}

}
