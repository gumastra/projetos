package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GarantiaPage {
	private WebDriver navegador;
	
	public GarantiaPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public CarrinhoPage clickContinuar() {
		navegador.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div[4]/a")).click();
		return new CarrinhoPage (navegador);
	}
}
