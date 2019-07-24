package stepsPassosDownload;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import chromeDriver.PaginaBase;

public class IndoParaPaginaDownload extends PaginaBase{
	
	public IndoParaPaginaDownload(WebDriver navegador) {
		super(navegador);
	}
	
	public IndoParaPaginaDownload atualizandoAssistidos(String conteudoPesquisa, String epNumero) throws InterruptedException, AWTException {
		click(By.xpath("//div[@class='actionSearch']//img"));
		senKeys(By.xpath("//input[@id='buscador']"), conteudoPesquisa);
		utils.sleep(8000);
		click(By.xpath("//div[@id='search-result']//h1[@class='grid_title']"));
		clear(By.xpath("//input[@name='last_content']"));
		senKeys(By.xpath("//input[@name='last_content']"), epNumero);
		clickTimeAfter(By.xpath("//button[@class='bt_change_last_content']"), 5000);
		click(By.xpath("//div[@id='boxLogo']"));
		
		utils.alteraAssistidoNumero();
		GetSetSuperAnimes.setStatusErroAba("NOK");
		
		return this;
	}

	public IndoParaPaginaDownload indoParaJaAssistidos() throws InterruptedException, AWTException {
		clickTime(By.xpath("//div[@class='actionMenuUser']"), 10000);
		clickTimeAfter(By.xpath("//span[contains(text(),'Já Assistido')]"), 5000);
		
		return this;
	}
	
	public FazendoDownload indoParaEpdoAnime(String conteudoParaDownload) throws InterruptedException, AWTException {
		utils.sleep(5000);
		String valor  = getAtributo(By.xpath("//a[contains(text(),'Proximo Conteúdo')]"), "href");
		conteudoParaDownload = conteudoParaDownload.toLowerCase().trim();
		if (valor.contains(conteudoParaDownload)) {
			clickTime(By.xpath("//a[contains(text(),'Proximo Conteúdo')]"), 3000);
		}
		else {
			System.out.println("<CONTEÚDO: " + conteudoParaDownload + " --> INVÁLIDO>");
			utils.finaliza(navegador);
		}
		return new FazendoDownload(navegador);
	}
}