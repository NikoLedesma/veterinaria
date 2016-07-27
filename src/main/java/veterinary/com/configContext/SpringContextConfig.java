package veterinary.com.configContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SecurityConfig.class,SpringDatabaseConfig.class})
@ComponentScan({"veterinary.com.service","veterinary.com.serviceImpl","veterinary.com.dao","veterinary.com.daoImpl"})
public class SpringContextConfig {
}
