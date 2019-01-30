package com.felipecarvalho.cursomc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipecarvalho.cursomc.services.S3Service;

	
// ao implementar CommandLineRunner, é permitido instanciar objetos assim que a aplicação for rodada.

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\Felipe\\Pictures\\cao-shitzu.jpg");
	}

}

