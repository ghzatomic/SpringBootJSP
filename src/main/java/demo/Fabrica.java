package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Fabrica {

	@Bean
	public InjetadoInterface criaInjetado(){
		return new Injetado();
	}
	
}
