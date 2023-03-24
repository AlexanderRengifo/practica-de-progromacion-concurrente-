package Practica7_vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Practica7_modelo.Tarea;

import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import Practica7_vista.Venta_nuevo;

public class Ventana_tarae extends JFrame {

	public JPanel contentPane;
	private JMenuItem Opc_Salir;
	private JMenuItem Opc_Nuevo;
	public panel_tareas panel_tareas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_tarae frame = new Ventana_tarae();
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
	public Ventana_tarae() {
		setTitle("Tarea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 426);
		setMinimumSize(new java.awt.Dimension(303,250));
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar Barra_menu = new JMenuBar();
		Barra_menu.setBounds(0, 0, 670, 22);
		contentPane.add(Barra_menu);
		
		
		JMenu Menu_archivo = new JMenu("Archivo");
		Barra_menu.add(Menu_archivo);
		
		Opc_Nuevo = new JMenuItem("Nuevo");
		Opc_Nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Venta_nuevo vtnew = new Venta_nuevo();
			vtnew.setVisible(true);
			
			}
		});
		Opc_Nuevo.setHorizontalAlignment(SwingConstants.LEFT);
		Menu_archivo.add(Opc_Nuevo);
		
		Opc_Salir = new JMenuItem("Salir");
		Opc_Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Opc_Salir.setHorizontalAlignment(SwingConstants.LEFT);
		Menu_archivo.add(Opc_Salir);
		panel_tareas = new panel_tareas();
		panel_tareas.inTarea.setText("");
		//panel_tareas.textPane.setEditable(true);
		panel_tareas.setBounds(0, 24, 670, 367);
		contentPane.add(panel_tareas);
	}
}
