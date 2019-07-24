package utilsDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import runnerDownload.RunnerDownloadSuperAnimes;
import stepsPassosDownload.GetSetSuperAnimes;

public class MetodosUtils {

	public void alteraAssistidoNumero() {
		int epComecar = Integer.parseInt(GetSetSuperAnimes.getEpComecar());
		String statusErroAba = GetSetSuperAnimes.getStatusErroAba();
		
		if (statusErroAba.contains("NOK")) {
			if(epComecar == 0) {
			   System.out.println("ENTROU IF");
			   System.out.println(statusErroAba);
			   epComecar++;
			   GetSetSuperAnimes.setEpComecar(Integer.toString(epComecar));
			}else {
				System.out.println("ENTROU ELSE");
				epComecar++;
				GetSetSuperAnimes.setEpComecar(Integer.toString(epComecar));
			}
		}
		System.out.println("SAIU");
		System.out.println(statusErroAba);
	}
	
	public void finaliza(WebDriver navegador) {
		navegador.quit();
	}
	
	public void verificaAba(WebDriver navegador) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		String urlAtual = navegador.getCurrentUrl();
		
		if(urlAtual.contains("super") && urlAtual.contains("animes")) {
			System.out.println("<ABA OK>");
		} else {
			System.out.println("<ABA NÃO IDENFICADA>");
			navegador.quit();
			GetSetSuperAnimes.setStatusErroAba("OK");
			RunnerDownloadSuperAnimes.passosDownloadSuperAnimes();
		}
	}
	
	public void sleep(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void downloadRobot() throws InterruptedException {
		Thread.sleep(5000);
		Robot teclado;
		
		try {
			teclado = new Robot();
			teclado.keyPress(KeyEvent.VK_CONTROL);
			teclado.keyPress(KeyEvent.VK_J);
		} catch (AWTException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void fechaAbaAnimes(String urlSuperAnimes, WebDriver navegador) throws InterruptedException {
		Thread.sleep(5000);
		String urlAtual = navegador.getWindowHandle();
		
		if(urlAtual != urlSuperAnimes) {
			navegador.switchTo().window(urlSuperAnimes);
			navegador.close();
		}else {
			System.out.println("<ABA NÃO ENCONTRADA>");
		}
	}
}