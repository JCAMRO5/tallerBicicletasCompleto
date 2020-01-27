package tallerBicicletasCompleto;


public class Bicicleta extends Vehiculo{
	private int velocidadActual;
	private int platoActual;
	private int pinionActual;
	
	
	protected int getVelocidadActual() {
		return velocidadActual;
	}

	protected void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	protected int getPlatoActual() {
		return platoActual;
	}

	protected void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}

	protected int getPinionActual() {
		return pinionActual;
	}

	protected void setPinionActual(int pinionActual) {
		this.pinionActual = pinionActual;
	}

	public Bicicleta() {
		super();
		setVelocidadActual(0);
		setPinionActual(1);
		setPlatoActual(1);
	}

	public Bicicleta(Integer velocidadActual, int platoActual, int pinionActual) {
		super();
		setVelocidadActual(velocidadActual);
		setPinionActual(pinionActual);
		setPlatoActual(platoActual);
	}

	@Override
	public void acelerar() {
		this.velocidadActual = getVelocidadActual() * 2;
				
	}

	@Override
	public void frenar() {
		this.velocidadActual = getVelocidadActual()	/ 2;
		
	}

	@Override
	public String toString() {
		return "Bicicleta [getVelocidadActual()=" + getVelocidadActual() + ", getPlatoActual()=" + getPlatoActual()
				+ ", getPinionActual()=" + getPinionActual() + "]";
	}
	
}
