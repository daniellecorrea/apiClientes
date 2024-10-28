package repositories;

import abstractions.EstoqueRepositoryAbstract;
import entities.Estoque;

public class EstoqueRepositoryTxtImpl extends EstoqueRepositoryAbstract {

	@Override
	public void exportarDados(Estoque estoque) {
		
		try {
			
			var diretorio = "c:\\arquivos_txt";
			criarDiretorio(diretorio);
			var printWriter = new PrintWriter(diretorio + "\\estoque_");
		}
				
	}
}
