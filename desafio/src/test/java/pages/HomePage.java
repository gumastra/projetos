package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver navegador;
	
	public HomePage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public HomePage searchGeladeira() {
		navegador.findElement(By.id("inpHeaderSearch")).click();
		navegador.findElement(By.id("inpHeaderSearch")).sendKeys("geladeira");
		return this;
	}
	
	public HomePage searchInvalid() {
		navegador.findElement(By.id("inpHeaderSearch")).click();
		navegador.findElement(By.id("inpHeaderSearch")).sendKeys("dsfdsfsdfdsfdsfs");
		return this;
	}
	
	public SearchPage clickSearchBtn() {
		navegador.findElement(By.id("btnHeaderSearch")).click();
		return new SearchPage(navegador);
	}
}
