package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "L9416864690565515065")
	WebElement userButton;
	
	@FindBy(id = "menu_L9416864690565515065_1i")
	WebElement btnEntrar;
	
	public void clicarBtnUser() {
		userButton.click();
	}
	
	public void clicarBtnEntrar() {
		btnEntrar.click();
	}
}
