package palabrasOrdenadas;

import org.junit.jupiter.api.BeforeEach;

public class AdaptorTestCase {
	
	private Ventana ventana;
	private AdaptadorDeLista adaptador;
	
	@BeforeEach 
	public void setUp() {
	
	}
	
	public static void main(String[] args) {
		Ventana ventana;
		AdaptadorDeLista adaptador;
		
		adaptador = new AdaptadorDeLista();
		adaptador.agregarPalabra("algo");
		adaptador.agregarPalabra("barco");
		adaptador.agregarPalabra("casco");
		
		ventana = new Ventana(adaptador.listaDefault());
	}
}
