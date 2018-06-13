package ru.cetelem.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.camel.CamelContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource("classpath:camel-context.xml")
public class FileToDbApplication {
	private static final Log log = LogFactory.getLog(FileToDbApplication.class);

	@Autowired
	CamelContext camelContext;
	
	public static void main(String[] args) {
		SpringApplication.run(FileToDbApplication.class, args);
	}
	
	@Bean
	public Object dummyBean() {
		//For extra logging
		//camelContext.setTracing(true);
	    return new Object();
	}	
}
