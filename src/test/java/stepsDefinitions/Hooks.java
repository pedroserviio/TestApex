package stepsDefinitions;

import static utils.Utils.acessarSistema;
import static utils.Utils.capturarTela;
import static utils.Utils.driver;
import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.HomePage;

public class Hooks {

	@Before()
	public void setUp() {
		acessarSistema();
	}
	
	@Before()
	public void irPagLogin() {
		Na(HomePage.class).clicarBtnUser();
		Na(HomePage.class).clicarBtnEntrar();
	}
	
	@After()
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		driver.quit();
	}
}
