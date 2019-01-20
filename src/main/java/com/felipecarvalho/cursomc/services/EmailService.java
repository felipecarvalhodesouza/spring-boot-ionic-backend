package com.felipecarvalho.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.felipecarvalho.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
