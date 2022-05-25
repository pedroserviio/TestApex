package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

	@FindBy(id = "P9999_USERNAME")
	WebElement campoUsername;
	
	@FindBy(id = "P9999_PASSWORD")
	WebElement campoSenha;
	
	@FindBy(id = "B9416855457019515056")
	WebElement btnAcessar;
	
	public void InformarOUsername(String username) {
	    campoUsername.sendKeys(username);
	}

	public void informarASenha(String password) {
	    campoSenha.sendKeys(password);
	}
	
	public void clicarBtnAcessar() {
		btnAcessar.click();
	}
}
