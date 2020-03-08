package in.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.nit.runner.MyDataRunner;

@Configuration
public class AppConfig {
	@Bean
	public MyDataRunner mdr() {
		MyDataRunner m=new MyDataRunner();	
		return m;
	}

}
