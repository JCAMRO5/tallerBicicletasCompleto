package tallerBicicletasCompleto;

public class BicicletaTandem extends Bicicleta{
	private int numAsientos;
	
	/**
	 * @return the numAsientos
	 */
	public int getNumAsientos() {
		return numAsientos;
	}

	public BicicletaTandem(int numAsientos) {
		super();
		this.numAsientos = numAsientos;
	}
	
	public BicicletaTandem(int velocidadActual, int platoActual, int pinioActual, 
			int numAsientos) {
		super(velocidadActual, platoActual, pinioActual);
		this.numAsientos = numAsientos;
	}
	
	public void acelerar() {
		setVelocidadActual(getVelocidadActual()*4);;
	}

	@Override
	public String toString() {
		return "BicicletaTandem [VelocidadActual=" + getVelocidadActual()
				+ ", PlatoActual=" + getPlatoActual() + ", PinionActual=" 
				+ getPinionActual() + ", numAsientos=" + numAsientos + "]";
	}
	
	
}
