package stepsPassosDownload;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import chromeDriver.PaginaBase;

public class FazendoDownload extends PaginaBase{

	public FazendoDownload(WebDriver navegador) {
		super(navegador);
	}

	public FazendoDownload indoParaPageDownload() throws InterruptedException, AWTException {
		clickTime(By.xpath("//div[@class='MenuEpsTitulo']//a[1]//img[1]"), 3000);
		clickTime(By.xpath("//a[@class='bt-download']"), 7000);
		
		return this;
	}
	
	public FazendoDownload esperandoDownloadTerminar() throws InterruptedException, AWTException {
		String urlSuperAnimes = navegador.getWindowHandle();
		utils.downloadRobot();
		pasta.criaPastaAnimes("C:\\Animes & Desenhos\\Os Simpsons");
		utils.fechaAbaAnimes(urlSuperAnimes, navegador);
		
//		Shadow shadow = new Shadow(navegador);
//		WebElement element = shadow.findElement("#show:nth-child(1)");
//		element.click();
		
//		navegador.findElement(By.cssSelector("a[id='show']")).click();
		
		return null;
	}
}