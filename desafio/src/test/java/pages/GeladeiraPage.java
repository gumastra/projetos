package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeladeiraPage {
	private WebDriver navegador;

	public GeladeiraPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public GeladeiraPage escolhaVoltagem() {
		WebElement elem = navegador.findElement(By.id("variation-label"));
		new Select(elem).selectByVisibleText("110V");
		return this;
	}
	
	public GarantiaPage clickAdicionarASacola() {
		navegador.findElement(By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/button[2]")).click();
		return new GarantiaPage (navegador);
	}
}
