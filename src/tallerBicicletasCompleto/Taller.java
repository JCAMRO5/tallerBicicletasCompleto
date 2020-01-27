package tallerBicicletasCompleto;

import java.util.List;

public abstract class Taller {
	private double precioHora;
	private List<Empleado> empleados;
	private List<Reparable> reparables;
	private Almacen almacen;
	private List<Averia> averias;
	
	 public abstract boolean reparar (Reparable reparable);
}
