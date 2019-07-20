package runnerDownload;

import org.openqa.selenium.WebDriver;

import chromeDriver.IniciaChromeDriver;
import stepsPassosDownload.Login;

public class RunnerDownloadSuperAnimes {
	
	protected static WebDriver navegador;
	
	public static void main(String[] args) throws InterruptedException {
		navegador = IniciaChromeDriver.createChorme();
		
		passosDownloadSuperAnimes();
	}
	
	public static void passosDownloadSuperAnimes() throws InterruptedException {
		new Login(navegador)
			.indoEntrar()
			.preenchendoDadosLogin("HugoJr778", "16091998");
		finaliza();
	}
	
	public static void finaliza() {
		navegador.close();
	}
}