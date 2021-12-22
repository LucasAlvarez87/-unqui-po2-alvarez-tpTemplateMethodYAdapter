package palabrasOrdenadas;

import javax.swing.DefaultListModel;

public class AdaptadorDeLista {
	
	private ListaDePalabrasOrdenadas lista;
	
	public AdaptadorDeLista() {
		super();
		this.lista = new ListaDePalabrasOrdenadas();
	}

	public DefaultListModel listaDefault() {
		DefaultListModel<String> listaDefault= new DefaultListModel<String>();
		for (int i =0; i < this.getLista().cantidadDePalabras(); i++) {
			listaDefault.addElement(this.getLista().getPalabrasDePosicion(i));;
		}
		return listaDefault;
	}
	
	protected ListaDePalabrasOrdenadas getLista() {
		return this.lista;
	}
	
	public void agregarPalabra(String palabra) {
		this.getLista().agregarPalabra(palabra);
	}
	
}
