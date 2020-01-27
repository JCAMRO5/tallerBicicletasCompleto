package tallerBicicletasCompleto;

public class BicicletaMontania extends Bicicleta {
	private int suspension;

	/**
	 * @return the suspension
	 */
	public int getSuspension() {
		return suspension;
	}

	public BicicletaMontania(int suspension) {
		super();
		this.suspension = suspension;
	}

	public BicicletaMontania(int velocidadActual, int platoActual, int pinionActual, int suspension) {
		super(velocidadActual, platoActual, pinionActual);
		this.suspension = suspension;
	}

	public void cambiarSuspension(int suspension) { 
		this.suspension = suspension;
	}

	@Override
	public void acelerar() {

		setVelocidadActual(getVelocidadActual() * 3);
		;
	}

	@Override
	public String toString() {
		return "BicicletaMontaÃ±a [VelocidadActual=" + getVelocidadActual() + ", PlatoActual=" + getPlatoActual()
				+ ", PinionActual=" + getPinionActual() + ", suspension=" + suspension + "]";
	}



}
