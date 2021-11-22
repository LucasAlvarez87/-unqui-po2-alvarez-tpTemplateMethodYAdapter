package empleados;

public class Temporario extends Empleados {
	
	/*
	 * Clase concreta
	 */
	private int horasDeTrabajo;
	private boolean estaCasado;

	public Temporario(int cantHijos, int horasDeTrabajo, boolean estaCasado) {
		super(cantHijos);
		this.horasDeTrabajo = horasDeTrabajo;
		this.estaCasado = estaCasado;
	}

	@Override
	protected int getPagos() {
		return this.pagoPorHora() + this.sueldoBasico() + this.bonusFamiliar();
	}

	private int bonusFamiliar() {
		if ( this.getCantHijos() > 0 || this.estaCasado) {
			return 100;
		}
		else {
			return 0;
		}
	}

	private int sueldoBasico() {
		return 1000;
	}

	private int pagoPorHora() {
		return this.getHorasDeTrabajo() * 5;
	}

	public int getHorasDeTrabajo() {
		return horasDeTrabajo;
	}

}
