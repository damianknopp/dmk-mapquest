package dmk.mapquest.service;

import dmk.mapquest.model.BoundingBox;
import dmk.mapquest.model.Filter;
import dmk.mapquest.model.MapQuestTrafficResponse;

public interface MapQuestTrafficService {

	public MapQuestTrafficResponse queryForIncidents(BoundingBox boundingBox, Filter... filter);
	
}
