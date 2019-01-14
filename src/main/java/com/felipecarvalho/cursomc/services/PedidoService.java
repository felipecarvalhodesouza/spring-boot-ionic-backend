package com.felipecarvalho.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipecarvalho.cursomc.domain.Pedido;
import com.felipecarvalho.cursomc.repositories.PedidoRepository;
import com.felipecarvalho.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	//essa dependência é automaticamente instanciada pelo spring
	//graças a anotação autowired
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
}
