package controllers;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;
import entities.Estoque;
import entities.Produto;
public class EstoqueController {
	
	/*
	 * Método para fazer a captura dos dados do estoque
	 */
	public void cadastrarEstoque() {
		
		var estoque = obterDadosEstoque();
		
		//solicitando ao usuário o numero de produtos que deseja cadastrar
		var numProdutos = Integer.parseInt(JOptionPane.showInputDialog("INFORME O NUMERO DE PRODUTOS:"));
		if(numProdutos > 0) {
			
			//criando uma lista de produtos
			var lista = new ArrayList<Produto>();
			
			//adicionando produtos na lista
			for(var i = 0; i < numProdutos; i++) {
				JOptionPane.showMessageDialog(null, "PREENCHIMENTO DO " + (i+1) + "º PRODUTO:");
				lista.add(obterDadosProduto());
			}
			
			//adicionando a lista de produtos na classe estoque
			estoque.setProdutos(lista);
		}
	}
	
	/*
	 * Método para ler e retornar os dados de um estoque
	 */
	private Estoque obterDadosEstoque() {
		
		var estoque = new Estoque();
		
		estoque.setId(UUID.randomUUID());
		estoque.setNome(JOptionPane.showInputDialog("NOME DO ESTOQUE:"));
		
		return estoque;
	}
	
	/*
	 * Método para ler e retornar os dados de um produto
	 */
	private Produto obterDadosProduto() {
		
		var produto = new Produto();
		
		produto.setId(UUID.randomUUID());
		produto.setNome(JOptionPane.showInputDialog("NOME DO PRODUTO:"));
		produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("PREÇO:")));
		produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("QUANTIDADE:")));
		
		return produto;
	}
}



