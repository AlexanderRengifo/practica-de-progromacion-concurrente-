package Practica7_vista;

import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JSlider;
import java.awt.Scrollbar;
import java.awt.SystemColor;

import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;

import Practica7_modelo.Tarea;

import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class panel_tareas extends JPanel {
	public JTextPane textPane;
	public JComboBox cbx_prioridad;
	private JTextPane NombreTarea;
	public JTextPane inTarea;
	private logica_negocio ln;
	/**
	 * Create the panel.
	 */
	public panel_tareas() {
		ln = new logica_negocio(this);
		setLayout(null);
		setMinimumSize(new java.awt.Dimension(303,250));
		JLabel lblNewLabel = new JLabel("Lista de Tareas");
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 21, 158, 25);
		add(lblNewLabel);
				
		JLabel lblNombre = new JLabel("Nombre Tarea");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Century", Font.BOLD, 15));
		lblNombre.setBounds(473, 45, 157, 25);
		add(lblNombre);
		
		NombreTarea = new JTextPane();
		NombreTarea.setEnabled(false);
		NombreTarea.setEditable(false);
		NombreTarea.setBounds(473, 81, 157, 35);
		add(NombreTarea);
		
		
		JLabel lblPrioridad = new JLabel("Prioridad");
		lblPrioridad.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrioridad.setFont(new Font("Century", Font.BOLD, 15));
		lblPrioridad.setBounds(472, 127, 158, 25);
		add(lblPrioridad);
		
		cbx_prioridad = new JComboBox();
		cbx_prioridad.setEnabled(false);
		cbx_prioridad.setBounds(472, 156, 158, 22);
		add(cbx_prioridad);
		
		
		JCheckBox inGrupo = new JCheckBox("Es en grupo ?");
		inGrupo.setEnabled(false);
		inGrupo.setBounds(505, 185, 101, 23);
		add(inGrupo);
		
		JLabel lblPrioridad_1 = new JLabel("Avance");
		lblPrioridad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrioridad_1.setFont(new Font("Century", Font.BOLD, 15));
		lblPrioridad_1.setBounds(473, 214, 158, 25);
		add(lblPrioridad_1);
		
		JTextPane inAvanze = new JTextPane();
		inAvanze.setEnabled(false);
		inAvanze.setBounds(473, 239, 157, 20);
		add(inAvanze);
		
		
		JTextPane inTarea = new JTextPane();
		inTarea.setForeground(SystemColor.desktop);
		inTarea.setFont(new Font("Century", Font.PLAIN, 15));
		inTarea.setEnabled(false);
		inTarea.setEditable(false);
		inTarea.setLocation(20,62);
		add(inTarea);
		
		
		JScrollPane scrollBar = new JScrollPane(inTarea);
		scrollBar.setBounds(20, 60, 325, 242);
		add(scrollBar);
		
		/*
		 * tabla1 = new JTextPane();
		tabla1.setEnabled(false);
		tabla1.setEditable(false);
		tabla1.setForeground(SystemColor.desktop);
		tabla1.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		tabla1.setLocation(10, 233);
		add(tabla1);
		
		JScrollPane barra_tabla1= new JScrollPane(tabla1);
		barra_tabla1.setBounds(10, 233, 148, 331);
		add(barra_tabla1);
		 */
		JSlider slider = new JSlider();
		slider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				float avanze= slider.getValue();
				inAvanze.setText(Float .toString(avanze));
			}
		});
		slider.setValue(1);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setMinimum(10);
		slider.setBounds(405, 270, 247, 50);
		add(slider);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(182, 344, 141, 35);
		add(btnGuardar);
		
		JButton btnOpenaArchivos = new JButton("Abrir Archivos");
		btnOpenaArchivos.setBounds(10, 344, 141, 35);
		add(btnOpenaArchivos);
		JMenuBar Barra_menu = new JMenuBar();
		Barra_menu.setBounds(0, 0, 670, 22);
		add(Barra_menu);
		
		
		JMenu Menu_archivo = new JMenu("Archivo");
		Barra_menu.add(Menu_archivo);
		
		JMenuItem Opc_Nuevo = new JMenuItem("Nuevo");
		Opc_Nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.openNew();
			}
		});
		Opc_Nuevo.setHorizontalAlignment(SwingConstants.LEFT);
		Menu_archivo.add(Opc_Nuevo);
		
		JMenuItem Opc_Salir = new JMenuItem("Salir");
		Opc_Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Opc_Salir.setHorizontalAlignment(SwingConstants.LEFT);
		Menu_archivo.add(Opc_Salir);
	}

}
