package chromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IniciaChromeDriver {
	
	private static String url = "https://www.superanimes.site";
	
	public static WebDriver createChorme() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.manage().window().maximize();
		navegador.get(url);
		
		return navegador;
	}
}