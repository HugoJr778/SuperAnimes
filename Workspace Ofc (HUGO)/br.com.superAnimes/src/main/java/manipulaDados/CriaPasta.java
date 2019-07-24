package manipulaDados;

import java.io.File;

public class CriaPasta {

	private static String caminho = "C:\\Animes & Desenhos";
	
	public static File file(String caminho) {
		File diretorio = new File(caminho);
		return diretorio;
	}
	
	public void criaPastaAnimes(String conteudo) {
		File diretorio = file(caminho);
		File diretorio2 = file(conteudo);
		
		if(!diretorio.exists()) {
			System.out.println("Pasta criada com sucesso em: " + diretorio);
			diretorio.mkdirs();
		}else {
			System.out.println("Pasta já criada, em: " + diretorio);
		}
		
		if(!diretorio2.exists()) {
			System.out.println("Pasta criada com sucesso em: " + diretorio2);
			diretorio2.mkdirs();
		}else {
			System.out.println("Pasta " + conteudo + " já criada!");
		}
	}
}