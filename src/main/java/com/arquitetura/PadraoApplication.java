package com.arquitetura;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PadraoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new PadraoApplication().configure(new SpringApplicationBuilder(PadraoApplication.class)).run(args);
	}
	
	/**
	 * Caso queira usar no tomcat externo descomentar e alterar o pom de Jar para War
	 */

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(PadraoApplication.class);
//	}
	
	

	
	
}
