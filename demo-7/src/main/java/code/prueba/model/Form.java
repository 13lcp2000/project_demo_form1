package code.prueba.model;

import java.util.Date;

public class Form {
	
	int llavefecha;
	
	int dia;
	
	Date fecha;
	
	public Form() {	}
	
	public void setllaveFecha(int dia) {
		this.dia = dia;
	}
	
	public int getLlavefecha() {
		return llavefecha;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Form(int dia, Date fecha) {
		super();
		this.dia = dia;
		this.fecha = fecha;
	}
	
	
	
}
