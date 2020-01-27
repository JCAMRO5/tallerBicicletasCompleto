package tallerBicicletasCompleto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {
	private String nombre;
	private List<Repuesto> repuestos;
	private List<Proveedor> proveedores;

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private List<Repuesto> getRepuestos() {
		return repuestos;
	}

	private void setRepuestos(List<Repuesto> repuestos) {
		if (repuestos == null) {
			this.repuestos = new ArrayList<>();
			this.repuestos.addAll(repuestos);
		} else {
			getRepuestos().addAll(repuestos);
		}

	}

	private List<Proveedor> getProveedores() {
		return proveedores;
	}

	private void setProveedores(List<Proveedor> proveedores) {
		if (getProveedores().isEmpty()) {
			this.proveedores = new ArrayList<>();
			this.proveedores.addAll(proveedores);
		} else {
			getProveedores().addAll(proveedores);
		}
	}

	public Almacen() {

	}

	public Almacen(String nombre, List<Repuesto> repuestos, List<Proveedor> proveedores) {
		setNombre(nombre);
		setRepuestos(repuestos);
		setProveedores(proveedores);
	}

	public int getNivel(Repuesto repuesto) {
		int nivel = 0;
		for (Repuesto repu : getRepuestos()) {
			if (repu == repuesto) {
				nivel++;
			}
		}
		return nivel;
	}

	public void addNivel(Repuesto repuesto, int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			getRepuestos().add(repuesto);
		}
	}
	
	public void quitarNivel(Repuesto repuesto, int cantidad) {
		int numeroRepuestos = 0;
		for (int i = 0; i < getRepuestos().size(); i++) {
			if (getRepuestos().get(i) == repuesto) {
				numeroRepuestos ++;
			}
		}
		if (numeroRepuestos >= cantidad) {
			for (int j = 0; j < cantidad; j++) {
					getRepuestos().remove(repuesto);
			}
		}else {
			for (int i = 0; i < numeroRepuestos; i++) {
				getRepuestos().remove(repuesto);
			}
			System.out.println("Solo se pueden suministrar " + numeroRepuestos);
		}
				
	}
}
