package dmk.mapquest.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dmk.mapquest.conf.Bootstrap;
import dmk.mapquest.model.BoundingBox;
import dmk.mapquest.model.Filter;
import dmk.mapquest.model.Incident;
import dmk.mapquest.model.MapQuestTrafficResponse;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Bootstrap.class)
public class MapQuestTrafficServiceTest {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MapQuestTrafficService mapQuestTrafficService;
	
	@Before
	public void before(){ }
	
	@Test
	public void bmoreTraffic(){
//		MapQuestTrafficResponse resp = mapQuestTrafficService.queryForIncidents(BoundingBox.BALTIMORE, Filter.INCIDENTS, 
//				Filter.CONGESTION, Filter.CONSTRUCTION, Filter.EVENT);
		MapQuestTrafficResponse resp = mapQuestTrafficService.queryForIncidents(BoundingBox.BALTIMORE, Filter.INCIDENTS, 
				Filter.CONSTRUCTION);
		final Incident[] incidents = resp.getIncidents();
		
		Assert.assertNotNull(incidents);
		logger.info("" +incidents.length);
		for(Incident incident : incidents){
			logger.info(incident.toString());
		}
	}
}