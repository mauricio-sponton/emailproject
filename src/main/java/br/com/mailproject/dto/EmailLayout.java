package br.com.mailproject.dto;

import br.com.mailproject.model.Email;

public class EmailLayout {

	private static final String QUEBRA_DE_LINHA = "<br>";

	public Email montarEmailAdmin(String destinatario, String assunto) {

		var texto = new StringBuilder();

		texto.append("A/C Administrador").append(QUEBRA_DE_LINHA);

		texto.append("Solicito alteração de senha do sistema!").append(QUEBRA_DE_LINHA);

		gerarAssinatura(texto);
		gerarRodapé(texto);

		return new Email(destinatario, assunto, texto.toString());
	}

	private String gerarAssinatura(StringBuilder texto) {
		return texto.append("Att.:").append(QUEBRA_DE_LINHA).append("Maurício").toString();
	}

	private String gerarRodapé(StringBuilder texto) {
		return texto.append("E-mail automático. Favor não responder esse email!").toString();
	}
}
