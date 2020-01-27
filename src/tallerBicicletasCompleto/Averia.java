package tallerBicicletasCompleto;

public class Averia {
	private String referencia;
	private String nombre;
	
	private String getReferencia() {
		return referencia;
	}
	private void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Averia() {
		super();
	}
	
	public Averia(String referencia, String nombre) {
		super();
		setReferencia(referencia);
		setNombre(nombre);
	}
	@Override
	public String toString() {
		return "Averia [getReferencia()=" + getReferencia() + ", getNombre()=" + getNombre() + "]";
	}

	
	
}
