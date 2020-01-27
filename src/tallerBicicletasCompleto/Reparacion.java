package tallerBicicletasCompleto;

import java.util.List;

public class Reparacion {
	private List<Averia> averias;
	private double horas;
	private List<Averia> getAverias() {
		return averias;
	}
	private void setAverias(List<Averia> averias) {
		this.averias = averias;
	}
	private double getHoras() {
		return horas;
	}
	private void setHoras(double horas) {
		this.horas = horas;
	}
	public Reparacion() {
		super();
	}
	public Reparacion(List<Averia> averias, double horas) {
		super();
		this.averias = averias;
		this.horas = horas;
	}
	
	
}
