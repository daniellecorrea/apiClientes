package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	//atributos
	private static String host = "jdbc:mysql://localhost:3306/bd_apiclientes";
	private static String user = "root";
	private static String pass = "Adm@123";
	
	//método para abrir conexao com o banco 
	public static Connection getConnection() throws Exception{
		
		return DriverManager.getConnection(host, user, pass);
	}
	
}
