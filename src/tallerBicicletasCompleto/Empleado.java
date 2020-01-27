package tallerBicicletasCompleto;

public class Empleado {
	private String nombre;
	private String nSS;
	private String especialidadString;
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getnSS() {
		return nSS;
	}
	private void setnSS(String nSS) {
		this.nSS = nSS;
	}
	private String getEspecialidadString() {
		return especialidadString;
	}
	private void setEspecialidadString(String especialidadString) {
		this.especialidadString = especialidadString;
	}
	
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String nSS, String especialidadString) {
		super();
		setNombre(nombre);
		setnSS(nSS);
		setEspecialidadString(especialidadString);
	}
	
	
}
