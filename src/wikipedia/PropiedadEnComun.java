package wikipedia;

import java.util.List;
import java.util.stream.Stream;

public class PropiedadEnComun extends Filtro {

	@Override
	protected Boolean condicionDeFiltro(WikipediaPage paginaPrincipal, WikipediaPage paginaAFlitlar) {
		Stream<String> keysP1 = paginaPrincipal.getInfobox().keySet().stream();
		return keysP1.anyMatch(k -> paginaAFlitlar.getInfobox().containsKey(k));
	}



}
