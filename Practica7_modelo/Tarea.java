package Practica7_modelo;


public class Tarea {
	//variables
	private String tarea;
	private String prioridad;
	private boolean grupo;
	private float avanze;
	//constructores
	public Tarea() {
		this.tarea = "\0";
		this.prioridad = "\0";
		this.grupo = false;
		this.avanze = 0;

	}
	public Tarea(String tarea, String prioridad, boolean grupo,float avanze) {
		this.tarea = tarea;
		this.prioridad = prioridad;
		this.grupo = grupo;
		this.avanze = avanze;

	}
	//getters and setters
	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public boolean isGrupo() {
		return grupo;
	}

	public void setGrupo(boolean grupo) {
		this.grupo = grupo;
	}
	public String toString() {
		String grp="\0";
		if(this.grupo==true) {
			grp="En Grupo";
		}else {
			grp="Individual";
		}
		return this.tarea+"---"+this.prioridad+"---"+grp+"---"+"Valor:"+this.avanze;
	}
	public float getAvanze() {
		return avanze;
	}
	public void setAvanze(float avanze) {
		this.avanze = avanze;
	}
}
