package br.com.mailproject.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.mailproject.dto.EmailLayout;
import br.com.mailproject.model.Email;
import br.com.mailproject.service.EmailService;

@Named
@RequestScoped
public class EmailBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final String DESTINATARIO = "mauricio.sponton.testes@gmail.com";
	private static final String ASSUNTO = "Montador de email com JSF";
	
	@Inject
	private EmailService emailService;
	
	public String enviarEmail() {
		emailService.enviar(montarEmail());
		return null;
	}
	
	private Email montarEmail() {
		var layout = new EmailLayout();
		return layout.montarEmailAdmin(DESTINATARIO, ASSUNTO);
	}

}
