package chromeDriver;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import manipulaDados.CriaPasta;
import utilsDownload.MetodosUtils;

public class PaginaBase {
	
	public static CriaPasta pasta = new CriaPasta();
	public static MetodosUtils utils = new MetodosUtils();
	protected WebDriver navegador;

	public PaginaBase (WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public void click(By by) throws InterruptedException, AWTException {
		navegador.findElement(by).click();
		utils.verificaAba(navegador);
	}
	
	public void clickTime(By by, int tempo) throws InterruptedException, AWTException {
		utils.sleep(tempo);
		navegador.findElement(by).click();
		utils.verificaAba(navegador);
	}
	
	public void clickTimeAfter(By by, int tempo) throws InterruptedException, AWTException {
		navegador.findElement(by).click();
		utils.verificaAba(navegador);
		utils.sleep(tempo);
	}
	
	public void senKeys(By by, String valor) {
		navegador.findElement(by).sendKeys(valor);
	}
	
	public void clear(By by) {
		navegador.findElement(by).clear();
	}
	
	public String getAtributo(By by, String elemento) {
		String valor = navegador.findElement(by).getAttribute(elemento);
		 	
		return valor;
	}
}