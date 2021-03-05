package com.principal.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.principal.entities.Mensagem;
import com.principal.repositories.MensagemRepositorio;

@Configuration
public class Config implements CommandLineRunner {
	
	@Autowired
	MensagemRepositorio MR;
	
	@Override
	public void run(String... args) throws Exception {
		
		Mensagem m = new Mensagem("Olá mundo!!");
		Mensagem m1 = new Mensagem("Estou Funcionando");
		Mensagem m2 = new Mensagem("ç---Arion Mathias---ç");
		
		
		
		MR.saveAll(Arrays.asList(m,m1,m2));
		
	}
	

}
