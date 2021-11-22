package wikipedia;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Filtro {
	
	public  List<WikipediaPage> getSimilarPages(WikipediaPage page, List <WikipediaPage> wikipedia){
		return wikipedia.stream().filter(p -> this.condicionDeFiltro(page,p)).collect(Collectors.toList());
	}

	protected abstract Boolean condicionDeFiltro(WikipediaPage paginaPrincipal, WikipediaPage paginaAFlitlar);

	
}
