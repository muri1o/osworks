package com.murilo.osworks.api.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.osworks.domain.model.Cliente;
import java.util.List;


@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João Martins");
		cliente1.setTelefone("11970530550");
		cliente1.setEmail("teste@teste.com.br");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("11970530550");
		cliente2.setEmail("teste@teste.com.br");
		
		
		return Arrays.asList(cliente1, cliente2);
	}
}
