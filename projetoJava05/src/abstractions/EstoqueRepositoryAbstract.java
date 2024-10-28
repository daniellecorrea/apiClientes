package abstractions;
import java.io.File;
/*
* Classe abstrata para definição de rotinas
* de repositório de estoque
*/
public abstract class EstoqueRepositoryAbstract {
	/*
	 * Método para criar a pasta onde os arquivos serão gravados
	 */
	public void criarDiretorio(String caminho) {
		
		var file = new File(caminho);
		
		if(!file.exists()) { //verificando se o caminho não existe
			file.mkdir(); //criando a pasta para gravar o arquivo
			System.out.println("DIRETÓRIO CRIADO COM SUCESSO!");
		}
		else {
			System.out.println("DIRETÓRIO JÁ EXISTENTE!");
		}
	}
	
}


