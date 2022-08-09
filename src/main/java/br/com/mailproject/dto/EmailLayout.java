package br.com.mailproject.dto;

import br.com.mailproject.model.Email;

public class EmailLayout {

	public Email montarEmailAdmin(String destinatario, String assunto) {
		
		var texto = new StringBuilder();
		return new Email(destinatario, assunto, texto.toString());
	}
}
