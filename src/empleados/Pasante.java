package empleados;

public class Pasante extends Empleados {
	
	/*
	 * Clase concreta
	 */
	private int horasTrabajadas;

	public Pasante(int cantHijos, int horasTrabajadas) {
		super(cantHijos);
		this.horasTrabajadas = horasTrabajadas;
	}

	
	@Override
	protected int getPagos() {
		// TODO Auto-generated method stub
		return this.getHorasTrabajadas() * 40;
	}


	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
}
