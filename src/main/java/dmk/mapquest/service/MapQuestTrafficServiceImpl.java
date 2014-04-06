package dmk.mapquest.service;

import java.net.URI;

import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriTemplate;

import dmk.mapquest.model.BoundingBox;
import dmk.mapquest.model.Filter;
import dmk.mapquest.model.MapQuestTrafficResponse;


public class MapQuestTrafficServiceImpl implements MapQuestTrafficService{

	protected RestOperations restOps;
	protected String mapquestHost;
	protected String mapquestKey;
	
	public MapQuestTrafficServiceImpl(){
		super();
	}
	
	@Override
	public MapQuestTrafficResponse queryForIncidents(BoundingBox boundingBox,
			Filter... filters) {
		String filterParams = "";
		int i = 0;
		for(Filter filter : filters){
			if(i != 0){
				filterParams += ",";
			}
			filterParams += filter.toString().toLowerCase();
			i++;
		}
		String template = this.mapquestHost 
				+ "?key={key}&boundingBox={b1},{b2},{b3},{b4}&filters={filters}&inFormat=kvp&outFormat=json";
		UriTemplate uriTemplate = new UriTemplate(template);
		URI uri = uriTemplate.expand(this.mapquestKey, boundingBox.getBound1(),
				boundingBox.getBound2(), boundingBox.getBound3(), boundingBox.getBound4(), filterParams);
		return this.restOps.getForObject(uri, MapQuestTrafficResponse.class);
	}

	public RestOperations getRestOps() {
		return restOps;
	}

	public void setRestOps(RestOperations restOps) {
		this.restOps = restOps;
	}

	public String getMapquestHost() {
		return mapquestHost;
	}

	public void setMapquestHost(String mapquestHost) {
		this.mapquestHost = mapquestHost;
	}

	public String getMapquestKey() {
		return mapquestKey;
	}

	public void setMapquestKey(String mapquestKey) {
		this.mapquestKey = mapquestKey;
	}

}
