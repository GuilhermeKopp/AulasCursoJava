package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarContaPage;

public class CadastrarContaSteps {

	@Quando("eu acionar a aba sign in")
	public void eu_acionar_a_aba_sign_in() {
		Na(CadastrarContaPage.class).abaSignIn.click();
	}

	@Quando("informar no campo email address {string}")
	public void informar_no_campo_email_address(String email) {
		Na(CadastrarContaPage.class).informarCampoEmail(email);
	}

	@Quando("acionar o botao create an account")
	public void acionar_o_botao_create_an_account() {
		Na(CadastrarContaPage.class).botaoCreateAccountt.click();
	}

    @Quando("o usuario informar o first name {string}")
    public void oUsuarioInformarOFirstName(String firstName) {
    	Na(CadastrarContaPage.class).informarFirstName(firstName);
    }

	@E("informar o last name {string}")
	public void informar_o_last_name(String lastName) {
		Na(CadastrarContaPage.class).informarLastName(lastName);
	}

	@E("informar o password {string}")
	public void informar_o_password(String password) {
		Na(CadastrarContaPage.class).informarPassword1(password);
	}

	@E("informar o address {string}")
	public void informar_o_address(String address1) {
		Na(CadastrarContaPage.class).informarAddress1(address1);
	}

	@E("informar a city {string}")
	public void informar_a_city(String city) {
		Na(CadastrarContaPage.class).informarCity(city);
	}

	@E("informar o zip\\/postal code {string}")
	public void informar_o_zip_postal_code(String postCode) {
		Na(CadastrarContaPage.class).informarPostCode(postCode);
	}

	@E("selecionar o country {string}")
	public void selecionarOCountry() {
	}
	
	@E("informar o mobile phone {string}")
	public void informar_o_mobile_phone(String mobilePhone) {
		Na(CadastrarContaPage.class).informarMobilePhone(mobilePhone);
	}

	@E("acionar o botao register")
	public void acionar_o_botao_register() {
		Na(CadastrarContaPage.class).botaoSubmitAccountt.click();
	}

	@Entao("o sistema deve cadastrar o usuario {string}")
	public void o_sistema_deve_cadastrar_o_usuario(String string) {
	    throw new cucumber.api.PendingException();
	}
	
}
