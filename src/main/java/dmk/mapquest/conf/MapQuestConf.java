package dmk.mapquest.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import dmk.mapquest.service.MapQuestTrafficService;
import dmk.mapquest.service.MapQuestTrafficServiceImpl;

@Configuration
public class MapQuestConf{

	@Autowired
	protected String mapquestHost;
	@Autowired
	protected String mapquestKey;
	
	@Bean
	MapQuestTrafficService mapQuestTrafficService(){
		MapQuestTrafficServiceImpl service = new MapQuestTrafficServiceImpl();
		service.setMapquestHost(this.mapquestHost);
		service.setMapquestKey(mapquestKey);
		service.setRestOps(mapquestRestTemplate());
		return service;
	}
	@Bean RestOperations mapquestRestTemplate(){
		return new RestTemplate(clientHttpRequestFactory());
	}
	
	@Bean
	protected ClientHttpRequestFactory clientHttpRequestFactory(){
		return new SimpleClientHttpRequestFactory();
	}
	
}