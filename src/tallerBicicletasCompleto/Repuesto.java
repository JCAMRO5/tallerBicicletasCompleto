package tallerBicicletasCompleto;

public class Repuesto {
	private String nombre;
	private long ean;
	private String descripcion;
	private double precio;
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private long getEan() {
		return ean;
	}
	private void setEan(long ean) {
		this.ean = ean;
	}
	private String getDescripcion() {
		return descripcion;
	}
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	private double getPrecio() {
		return precio;
	}
	private void setPrecio(double precio) {
		this.precio = precio;
	}
	public Repuesto() {
		super();
	}
	public Repuesto(long ean, String nombre, String descripcion, double precio) {
		super();
		setEan(ean);
		setNombre(nombre);
		setDescripcion(descripcion);
		setPrecio(precio);
				
	}
	@Override
	public String toString() {
		return "Repuesto: Ean:" + getEan() + "Nombre: " + getNombre() + "Descripción"
				+ getDescripcion() + ", Precio: " + getPrecio() + " euros";
	}
	
	
}
