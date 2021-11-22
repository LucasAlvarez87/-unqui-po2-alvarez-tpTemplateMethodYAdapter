package empleados;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadosTestCase {
	
	private Temporario temporario;
	private Pasante pasante;
	private Planta planta;
	
	@BeforeEach																																		
	public void setUp() {
		temporario = new Temporario(1, 20, false);
		pasante = new Pasante(2, 30);
		planta = new Planta(3);
	}
	
	@Test
	public void testSueldoDeTemporarioConBonusFamiliar() {
		assertEquals(1044, temporario.sueldo()) ;
	}
	
	@Test
	public void testSueldoDeTemporarioSinBonusFamiliar() {
		temporario = new Temporario(0, 20, false);
		assertEquals(957, temporario.sueldo()) ;
	}
	
	@Test
	public void testSueldoDePasante() {
		assertEquals(1044, pasante.sueldo()) ;
	}
	
	@Test
	public void testSueldoDePlanta() {
		assertEquals(3002, planta.sueldo()) ;
	}
	
}
