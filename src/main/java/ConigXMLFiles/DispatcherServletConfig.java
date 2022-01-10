package ConigXMLFiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.*")
public class DispatcherServletConfig {
	
//	@Bean
//	public InternalResourceViewResolver viewtype()
//	{
//		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
//		irvr.setPrefix("/webapp/");
//		irvr.setSuffix(".jsp");
//		
//		return irvr;
//	}

}
