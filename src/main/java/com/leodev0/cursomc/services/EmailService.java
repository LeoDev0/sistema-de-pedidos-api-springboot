package com.leodev0.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.leodev0.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
