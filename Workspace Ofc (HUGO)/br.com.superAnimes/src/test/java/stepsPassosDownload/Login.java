package stepsPassosDownload;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import chromeDriver.PaginaBase;

public class Login extends PaginaBase {	
	
	public Login(WebDriver navegador) {
		super(navegador);
	}
	
	public Login indoEntrar() throws InterruptedException, AWTException {
		clickTime(By.xpath("//div[@class='menu_btns avatarUser']"), 5000);
		click(By.xpath("//li[@id='myLogin']"));
		
		return this;
	}
	
	public IndoParaPaginaDownload preenchendoDadosLogin(String user, String passoword) throws InterruptedException, AWTException {
		utils.sleep(5000);
		senKeys(By.xpath("//input[@placeholder='Login ou email']"), user);
		senKeys(By.xpath("//input[@id='password']"), passoword);
		clickTime(By.xpath("//button[@id='bt-login']"), 5000);
		
		return new IndoParaPaginaDownload(navegador);
	}
}