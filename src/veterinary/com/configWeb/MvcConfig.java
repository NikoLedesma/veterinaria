package veterinary.com.configWeb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry ;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages={"veterinary.com.*"})
public class MvcConfig extends WebMvcConfigurerAdapter{

	
	
// public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	 registry.addResourceHandler("/*.html").addResourceLocations("/WEB-INF/views/");
//	};
//	
//	
// public void addViewControllers(ViewControllerRegistry registry) {
//	 registry.addViewController("/").setViewName("forward:/index.html");
//};	
	
	
	//Se establecio la carpeta resources para que se busque
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resource/**").addResourceLocations("/resource/");
	}

	
	
	
	@Bean 
	public InternalResourceViewResolver jspViewResolver(){
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}	
	
	
}
