package wikipedia;

import java.util.List;
import java.util.Map;

public class Page implements WikipediaPage {
	private String title;
	private List<WikipediaPage> links;
	Map<String, WikipediaPage> infobox;
	
	
	public Page(String title, List<WikipediaPage> links, Map<String, WikipediaPage> infobox) {
		super();
		this.title = title;
		this.links = links;
		this.infobox = infobox;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		// TODO Auto-generated method stub
		return this.links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		// TODO Auto-generated method stub
		return this.infobox;
	}

}
