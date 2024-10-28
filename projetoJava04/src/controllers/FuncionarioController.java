package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Endereco;
import entities.Funcionario;
import interfaces.FuncionarioRepository;
import repositories.FuncionarioRepositoryTxt;
import repositories.FuncionarioRepositoryXml;

public class FuncionarioController {

	/*
	 * Método para capturarmos os dados do funcionário
	 * e exportarmos para um determinado arquivo
	 */
	public void cadastrarFuncionario() {
		
		var funcionario = obterDadosFuncionario();
		funcionario.setEndereco(obterDadosEndereco());
		
		//criando uma variável da interface
		FuncionarioRepository funcionarioRepository = null;
		
		//Escolher o tipo de arquivo desejado
		var tipo = JOptionPane.showInputDialog("ESCOLHA (1)TXT ou (2)XML:");
		switch(tipo) {
		case "1":
			funcionarioRepository = new FuncionarioRepositoryTxt(); //POLIMORFISMO
			break;
		case "2":
			funcionarioRepository = new FuncionarioRepositoryXml(); //POLIMORFISMO
			break;
		}		
		
		//exportar os dados para arquivo
		funcionarioRepository.exportarDados(funcionario);
	}
	
	/*
	 * Criando um método para fazer a captura dos dados do funcionário
	 */
	private Funcionario obterDadosFuncionario() {
		
		var funcionario = new Funcionario();
		
		funcionario.setId(UUID.randomUUID());
		funcionario.setNome(JOptionPane.showInputDialog("INFORME O NOME DO FUNCIONÁRIO:"));
		funcionario.setCpf(JOptionPane.showInputDialog("INFORME O CPF:"));
		funcionario.setMatricula(JOptionPane.showInputDialog("INFORME A MATRICULA:"));
		
		return funcionario;
	}
	
	/*
	 * Criando um método para fazer a captura dos dados do endereço
	 */
	private Endereco obterDadosEndereco() {
		
		var endereco = new Endereco();
		
		endereco.setId(UUID.randomUUID());
		endereco.setLogradouro(JOptionPane.showInputDialog("INFORME O LOGRADOURO:"));
		endereco.setNumero(JOptionPane.showInputDialog("INFORME O NUMERO:"));
		endereco.setComplemento(JOptionPane.showInputDialog("INFORME O COMPLEMENTO:"));
		endereco.setBairro(JOptionPane.showInputDialog("INFORME O BAIRRO:"));
		endereco.setCidade(JOptionPane.showInputDialog("INFORME A CIDADE:"));
		endereco.setEstado(JOptionPane.showInputDialog("INFORME O ESTADO:"));
		endereco.setCep(JOptionPane.showInputDialog("INFORME O CEP:"));
		
		return endereco;
	}
	
}


