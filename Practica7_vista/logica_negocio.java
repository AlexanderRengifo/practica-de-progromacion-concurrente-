package Practica7_vista;

import Practica7_modelo.Tarea;

public class logica_negocio {
	private panel_tareas pnt;
	private panel_nuevo pnn;
	private ventan_nuevo vtn;
	private ventana_tarea vtt;
	private int contador = 0;
	private Tarea t;

	public logica_negocio(panel_tareas pnt_) {
		this.pnt = pnt_;
	}

	public logica_negocio(panel_nuevo pnn_) {
		this.pnn = pnn_;
		this.pnt = new panel_tareas();
	}

	public void openNew() {
		vtn = new ventan_nuevo();
		vtn.setVisible(true);
	}

	public String jutar_datos() {
		contador++;
		StringBuffer datos = new StringBuffer();

		t.setTarea(pnn.inNombre.getText().toString());
		t.setPrioridad(pnn.inPrioridad.getSelectedItem().toString());
		t.setGrupo(pnn.chk_Grupo.isSelected());
		t.setAvanze(Float.parseFloat(pnn.inNota.getText().toString()));
		datos.append(contador + "---" + t.toString() + "\n");
		System.out.println(datos.toString());
		pnt.inTarea.setText(datos.toString());
		return datos.toString();
	}
}
