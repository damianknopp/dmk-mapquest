package dmk.mapquest.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("dmk.mapquest")
@Import({
	MapQuestConf.class,
	PropertiesConf.class
})
public class Bootstrap {

	
}
