package cuentasBancarias;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CuentasBancariasTestCase {
	
	private CuentaCorriente cuentaCorriente;
	private CajaDeAhorro cajaDeAhorro;
	
	@BeforeEach
	public void setUp() {
		cuentaCorriente = new CuentaCorriente("Jose Perez", 1500);
		cajaDeAhorro = new CajaDeAhorro("Jose Perez", 5000);
	}
	
	@Test
	public void cuentaCorrienteNoTieneSaldo() {
		assertFalse(cuentaCorriente.condicionDeExtraccion(2000));
	}
	
	@Test
	public void cajaDeAhorroNoTieneSaldo() {
		assertFalse(cajaDeAhorro.condicionDeExtraccion(2000));
	}
	
	@Test
	public void cuentaCorrienteExtraccionSuperaElSaldoYLimite() {
		cuentaCorriente.setSaldo(2000);
		assertFalse(cuentaCorriente.condicionDeExtraccion(5000));
	}
	
	@Test
	public void cajaDeAhorroSuperaElLimite() {
		cajaDeAhorro.setSaldo(1000);
		assertFalse(cajaDeAhorro.condicionDeExtraccion(6000));
	}
	
	@Test
	public void cuentaCorrientePuedeRetirar() {
		cuentaCorriente.setSaldo(5000);
		CuentaCorriente spy = Mockito.spy(cuentaCorriente);
		spy.extraer(2000);
		Mockito.verify(spy).agregarMovimientos("Extraccion");
	}
	
	@Test
	public void cajaDeAhorroPuedeRetirar() {
		cajaDeAhorro.setSaldo(5000);
		CajaDeAhorro spy = Mockito.spy(cajaDeAhorro);
		spy.extraer(2000);
		Mockito.verify(spy).agregarMovimientos("Extraccion");
	}
	
}
