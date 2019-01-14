package com.felipecarvalho.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipecarvalho.cursomc.domain.Cliente;
import com.felipecarvalho.cursomc.repositories.ClienteRepository;
import com.felipecarvalho.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	//essa dependência é automaticamente instanciada pelo spring
	//graças a anotação autowired
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
}
