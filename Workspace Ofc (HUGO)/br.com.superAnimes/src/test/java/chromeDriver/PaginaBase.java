package chromeDriver;

import org.openqa.selenium.WebDriver;

public class PaginaBase {
	
	protected WebDriver navegador;

	public PaginaBase (WebDriver navegador) {
		this.navegador = navegador;
	}
}