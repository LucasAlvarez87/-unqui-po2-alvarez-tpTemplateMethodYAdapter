package wikipedia;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	
	String getTitle();/* retorna el título de la página */
	
	List<WikipediaPage> getLinks(); /* retorna una lista de las paginas de Wikipedia con las que se conecta*/
	
	Map<String, WikipediaPage> getInfobox(); /* retorna un Map con un valor en texto y la pagina que describe ese valor 
	que aparecen en los infobox de la pagina de wikipedia */
	

}
