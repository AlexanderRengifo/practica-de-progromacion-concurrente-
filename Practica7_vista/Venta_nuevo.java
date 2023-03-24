package Practica7_vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Practica7_modelo.Tarea;

public class Venta_nuevo extends JFrame {
	private JTextField inNombre;
	public Tarea t;
	private JTextField inNota;
	private Ventana_tarae vtt;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venta_nuevo frame = new Venta_nuevo();
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
	public Venta_nuevo() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lb_nombre = new JLabel("Nombre:");
		lb_nombre.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		lb_nombre.setBounds(48, 11, 95, 25);
		getContentPane().add(lb_nombre);
		
		inNombre = new JTextField();
		inNombre.setColumns(10);
		inNombre.setBounds(173, 17, 106, 20);
		getContentPane().add(inNombre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(167, 104, 112, 22);
		getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Alta","Media","Baja"}));
		
		
		JLabel lb_nombre_1 = new JLabel("Prioridad:");
		lb_nombre_1.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		lb_nombre_1.setBounds(48, 99, 109, 25);
		getContentPane().add(lb_nombre_1);
		
		JCheckBox chk_Grupo = new JCheckBox("En grupo?");
		chk_Grupo.setBounds(178, 144, 101, 23);
		getContentPane().add(chk_Grupo);
		
		JButton btn_new = new JButton("Aceptar");
		btn_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t= new Tarea();
				t.setTarea(inNombre.getText().toString());
				t.setPrioridad(comboBox.getSelectedItem().toString());
				t.setGrupo(chk_Grupo.isSelected());
				t.setAvanze(Float.parseFloat(inNota.getText().toString()));
				vtt.panel_tareas.inTarea.setText("pat");
				System.out.println(t.toString());
				
			}
		});
		btn_new.setActionCommand("OK");
		btn_new.setBounds(112, 212, 109, 23);
		getContentPane().add(btn_new);
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_cancelar.setActionCommand("Cancel");
		btn_cancelar.setBounds(277, 212, 112, 23);
		getContentPane().add(btn_cancelar);
		
		JLabel lb_nota = new JLabel("Nota:");
		lb_nota.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		lb_nota.setBounds(48, 47, 95, 25);
		getContentPane().add(lb_nota);
		
		inNota = new JTextField();
		inNota.setColumns(10);
		inNota.setBounds(173, 53, 106, 20);
		getContentPane().add(inNota);
	}
	
}

