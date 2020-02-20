package com.pucese.aplicacion.service;

import org.springframework.mail.SimpleMailMessage;


public interface EmailService {
	public void sendEmail(SimpleMailMessage email);
}