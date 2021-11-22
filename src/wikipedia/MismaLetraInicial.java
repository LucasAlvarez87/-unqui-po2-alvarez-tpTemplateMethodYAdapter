package wikipedia;


public class MismaLetraInicial extends Filtro {

	private String inicialDePagina(WikipediaPage page) {
		return String.valueOf(page.getTitle().charAt(0)) ;
	}

	@Override
	protected Boolean condicionDeFiltro(WikipediaPage paginaPrincipal, WikipediaPage paginaAFlitlar) {
		return paginaAFlitlar.getTitle().startsWith(this.inicialDePagina(paginaPrincipal));
	}


	 

}
