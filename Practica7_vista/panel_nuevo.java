package Practica7_vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class panel_nuevo extends JPanel {
	public JTextField inNombre;
	public JTextField inNota;
	public JComboBox inPrioridad;
	public JCheckBox chk_Grupo;
	private logica_negocio ln;
	
	/**
	 * Create the panel.
	 */
	public panel_nuevo() {
		ln = new logica_negocio(this);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		
		JLabel lb_nombre = new JLabel("Nombre:");
		lb_nombre.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		lb_nombre.setBounds(48, 11, 95, 25);
		add(lb_nombre);
		
		inNombre = new JTextField();
		inNombre.setColumns(10);
		inNombre.setBounds(173, 17, 106, 20);
		add(inNombre);
		
		inPrioridad = new JComboBox();
		inPrioridad.setBounds(167, 104, 112, 22);
		add(inPrioridad);
		inPrioridad.setModel(new DefaultComboBoxModel(new String[] {"Alta","Media","Baja"}));
		
		
		JLabel lb_nombre_1 = new JLabel("Prioridad:");
		lb_nombre_1.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		lb_nombre_1.setBounds(48, 99, 109, 25);
		add(lb_nombre_1);
		
		chk_Grupo = new JCheckBox("En grupo?");
		chk_Grupo.setBounds(178, 144, 101, 23);
		add(chk_Grupo);
		
		
		
		JButton btn_new = new JButton("Aceptar");
		btn_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			ln.jutar_datos();
			//System.exit(0);
			}
		});
		btn_new.setActionCommand("OK");
		btn_new.setBounds(112, 212, 109, 23);
		add(btn_new);
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_cancelar.setActionCommand("Cancel");
		btn_cancelar.setBounds(277, 212, 112, 23);
		add(btn_cancelar);
		
		JLabel lb_nota = new JLabel("Nota:");
		lb_nota.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		lb_nota.setBounds(48, 47, 95, 25);
		add(lb_nota);
		
		inNota = new JTextField();
		inNota.setColumns(10);
		inNota.setBounds(173, 53, 106, 20);
		add(inNota);
	}

}
