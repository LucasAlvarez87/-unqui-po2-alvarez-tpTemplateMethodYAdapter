package wikipedia;

import java.util.List;

public class LinkEnComun extends Filtro {

	@Override
	protected Boolean condicionDeFiltro(WikipediaPage paginaPrincipal, WikipediaPage paginaAFlitlar) {
		return paginaPrincipal.getLinks().stream().anyMatch(l -> paginaAFlitlar.getLinks().contains(l));
	}

	


}
