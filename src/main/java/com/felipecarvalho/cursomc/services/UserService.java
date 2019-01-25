package com.felipecarvalho.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.felipecarvalho.cursomc.security.UserSS;

public class UserService {
	
	// função para retornar o usuário que está autenticado
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch(Exception e){
			return null;
		}
	}
}
