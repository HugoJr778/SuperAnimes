package runnerDownload;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import chromeDriver.IniciaChromeDriver;
import stepsPassosDownload.GetSetSuperAnimes;
import stepsPassosDownload.Login;
import utilsDownload.MetodosUtils;

public class RunnerDownloadSuperAnimes {
	
	protected static WebDriver navegador;
	private static MetodosUtils utils = new MetodosUtils();

	public static void main(String[] args) throws InterruptedException, AWTException {		
		
		GetSetSuperAnimes.setQuantEp(2);
		GetSetSuperAnimes.setEpComecar("0");
				
		for(int execucoes = 0; execucoes < GetSetSuperAnimes.getQuantEp(); execucoes++) {
			navegador = IniciaChromeDriver.createChorme();
			passosDownloadSuperAnimes();
			utils.finaliza(navegador);
		}
	}
	
	public static void passosDownloadSuperAnimes() throws InterruptedException, AWTException {
		new Login(navegador)
			.indoEntrar()
			.preenchendoDadosLogin("HugoJr778", "16091998")
			.atualizandoAssistidos("Os Simpsons", GetSetSuperAnimes.getEpComecar())
			.indoParaJaAssistidos()
			.indoParaEpdoAnime("Simpsons")
			.indoParaPageDownload()
			.esperandoDownloadTerminar();
	}
}