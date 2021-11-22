package empleados;

public class Planta extends Empleados {

	/*
	 * Clase concreta
	 */
	
	public Planta(int cantHijos) {
		super(cantHijos);
	}

	@Override
	protected int getPagos() {
		return this.getSueldoBasico() + this.bonusPorFamilia() ;
	}

	private int getSueldoBasico() {
		return 3000 ;
	}

	private int bonusPorFamilia() {
		return this.getCantHijos() * 150;
	}

}
