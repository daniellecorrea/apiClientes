package br.com.cotiinformatica.components;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenComponent {

		/*
		 * Metodo para gerar um TOKEN JWT para um usuário
		 * autenticado pelo sistema
		 */
	
	public String generateToken(UUID usuarioId) {
		
		
		var dataAtual = new Date(); // gerando a data atuall do sistema
		
		
		return Jwts.builder()
				.setSubject(usuarioId.toString())  //identificacao do usuario
				.setNotBefore(dataAtual) //data de geraçao do token
				.setExpiration(new Date(dataAtual.getTime()+600000))
				.signWith(SignatureAlgorithm.HS256, "73cbce54-24dd-46af-a820-4e8fa5f8ecc2") //chave do token da assinatura da aplicaçao
		         .compact();	
	}

}