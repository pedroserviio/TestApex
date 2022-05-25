package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LogInPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LogInSteps {

	@Quando("eu informar no campo username {string}")
	public void euInformarNoCampoUsername(String usuario) {
	    Na(LogInPage.class).InformarOUsername(usuario);
	}

	@Quando("informar no campo senha {string}")
	public void informarNoCampoSenha(String senha) {
		 Na(LogInPage.class).informarASenha(senha);
	}

	@Quando("clicar no botao acessar")
	public void clicarNoBotaoAcessar() {
		 Na(LogInPage.class).clicarBtnAcessar();
	}

	@Entao("o sistema exibe que o usuario esta logado")
	public void oSistemaExibeQueOUsuarioEstaLogado() throws Throwable {
	    Thread.sleep(3000);
	    assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'WS_USU_1')]")).isDisplayed());
	}

}
