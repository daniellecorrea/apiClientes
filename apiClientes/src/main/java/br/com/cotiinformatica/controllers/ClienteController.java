package br.com.cotiinformatica.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.ClienteRequestDto;
import br.com.cotiinformatica.entities.Cliente;
import br.com.cotiinformatica.repositories.ClienteRepository;

@RestController // define a classe como um controlador API (Spring Boot)
@RequestMapping("/api/clientes") // mapeia o ENDPOINT do controlador (endereço)
public class ClienteController {

	/*
	 * Serviço para cadastro de cliente na API
	 */
	@PostMapping // define o método como HTTP POST
	public String post(@RequestBody ClienteRequestDto request) throws Exception {

		//criando um objeto da classe Cliente (instância)
		var cliente = new Cliente();
		
		//capturando os dados enviados para a API (requisição)
		cliente.setId(UUID.randomUUID());
		cliente.setNome(request.getNome());
		cliente.setCpf(request.getCpf());
		cliente.setTelefone(request.getTelefone());
		cliente.setEmail(request.getEmail());
		
		//gravar o cliente no banco de dados
		var clienteRepository = new ClienteRepository();
		clienteRepository.create(cliente);
		
		return "Cliente cadastrado com sucesso.";
	}

	/*
	 * Serviço para edição de cliente na API
	 */
	@PutMapping // define o método como HTTP PUT
	public void put() {
		// TODO
	}

	/*
	 * Serviço para exclusão de cliente na API
	 */
	@DeleteMapping // define o método como HTTP DELETE
	public void delete() {
		// TODO
	}

	/*
	 * Serviço para consulta de clientes na API
	 */
	@GetMapping // define o método como HTTP GET
	public void get() {
		// TODO
	}
}



