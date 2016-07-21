package veterinary.com.configWeb;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import veterinary.com.configContext.SecurityConfig;
import veterinary.com.configContext.SprinfContextConfig;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {

		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SprinfContextConfig.class);
		// ///////////
		container.addListener(new ContextLoaderListener(rootContext));
		// ////////////////
		AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
		dispatcherServlet.register(MvcConfig.class);
		// /////////////
		ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet(dispatcherServlet));
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}

}
