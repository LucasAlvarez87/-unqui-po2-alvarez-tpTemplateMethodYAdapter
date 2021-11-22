package wikipedia;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class filtroTestCase {
	
	private  Page laPlata;
	private  Page lucasArts;
	private MismaLetraInicial filtroDeLetra;
	private List<WikipediaPage> wikipedia;
	private LinkEnComun filtroLinks;
	private PropiedadEnComun filtroPropiedad;
	
	@BeforeEach
	public void SetUp() {
		 laPlata = new Page("La Plata", new ArrayList<WikipediaPage>(),  new HashMap<String,WikipediaPage>());
		 lucasArts = new Page ("Lucas Arts", new ArrayList<WikipediaPage>(),  new HashMap<String,WikipediaPage>()); 
		 filtroDeLetra = new MismaLetraInicial();
		 filtroLinks = new LinkEnComun();
		 filtroPropiedad = new PropiedadEnComun();
		 wikipedia = new ArrayList<WikipediaPage>();
		 wikipedia.add(laPlata);
		 wikipedia.add(lucasArts);
	}
	
	@Test
	public void testFiltroDeMismaLetra() {
		List<WikipediaPage> filtrados = filtroDeLetra.getSimilarPages(laPlata, wikipedia);
		assertTrue(filtrados.contains(lucasArts));
	}
	
	@Test
	public void testFiltroLinkEnComun() {
		Page gimnasia = new Page("Gimnasia y Esgrima La Plata",  Arrays.asList(laPlata) ,  new HashMap<String,WikipediaPage>());
		Page buenosAires = new Page("Buenos Aires", Arrays.asList(laPlata), new HashMap<String,WikipediaPage>() );
		wikipedia.add(buenosAires);
		wikipedia.add(gimnasia);
		List<WikipediaPage> filtrados = filtroLinks.getSimilarPages(buenosAires, wikipedia);
		assertTrue(filtrados.contains(gimnasia));
	}
	
	@Test
	public void testFiltroPropiedadEnComun() {
		HashMap<String, WikipediaPage> skayMap = new HashMap<String, WikipediaPage>();
		skayMap.put("birth_place", laPlata);
		Page skay = new Page("Skay Belinson", new ArrayList<WikipediaPage>(), skayMap);
		
		HashMap<String, WikipediaPage> favaloroMap = new HashMap<String, WikipediaPage>();
		favaloroMap.put("birth_place", laPlata);
		Page favaloro = new Page("René Favaloro", new ArrayList<WikipediaPage>(), favaloroMap);
		
		wikipedia.add(skay);
		wikipedia.add(favaloro);
		List<WikipediaPage> filtrados = filtroPropiedad.getSimilarPages(skay, wikipedia);
		assertTrue(filtrados.contains(favaloro));
		
	}
}
