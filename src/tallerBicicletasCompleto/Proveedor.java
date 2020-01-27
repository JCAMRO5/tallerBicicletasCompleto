package tallerBicicletasCompleto;

public class Proveedor {
	private String nif;
	private String nombre;
	private String getNif() {
		return nif;
	}
	private void setNif(String nif) {
		this.nif = nif;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Proveedor() {
		super();
	}
	public Proveedor(String nif, String nombre) {
		super();
		setNif(nif);
		setNombre(nombre);
		
	}
	@Override
	public String toString() {
		return "Proveedor: Nif:" + getNif() + ", Nombre: " + getNombre() ;
	}
	
	
	
}
