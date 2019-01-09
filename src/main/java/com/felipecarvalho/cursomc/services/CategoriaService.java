package com.felipecarvalho.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipecarvalho.cursomc.domain.Categoria;
import com.felipecarvalho.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//essa dependência é automaticamente instanciada pelo spring
	//graças a anotação autowired
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
