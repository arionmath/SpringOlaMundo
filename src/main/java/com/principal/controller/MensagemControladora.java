package com.principal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.principal.entities.Mensagem;
import com.principal.repositories.MensagemRepositorio;


@RestController
public class MensagemControladora {
	@Autowired
	MensagemRepositorio RM;
	
	@GetMapping
	public List<Mensagem> listar(){
		return RM.findAll();
	}

}
