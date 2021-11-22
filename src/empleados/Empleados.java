package empleados;

public abstract class Empleados {
	/*
	 * Clase Abstracta
	 */
	
	private int cantHijos;
	
	public Empleados(int cantHijos) {
		super();
		this.cantHijos = cantHijos;
	}
	
	public int sueldo() {
		return this.getPagos() - this.getDescuento(); 
	}

	protected int getDescuento() {
		return (this.getPagos() * 13) /100; 
	}

	protected abstract int getPagos();
	
	public int getCantHijos() {
		return this.cantHijos;
	}


	
	
	
}
