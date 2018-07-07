package br.bravi.exercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String>  getHomePage() {
		return new ResponseEntity<String>("Exercício 2", HttpStatus.OK);
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
