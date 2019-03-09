package br.com.innowise.treinamento.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.innowise.treinamento.entity.ClienteEntity;

@RestController
@RequestMapping("clientes/")
public class ClienteResource {
	
	@RequestMapping(value="buscar/",method=RequestMethod.GET)
	public ResponseEntity<?> getCliente(){
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteEntity.setId(01);
		clienteEntity.setNome("CiaCom");
		clienteEntity.setEmail("CiaCom@teste.com.br");
		try {
			clienteEntity.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("05/04/1994"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.OK).body(clienteEntity); 
	}
	
}
