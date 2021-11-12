package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ClockPage;
import static utils.Utils.*;

import java.util.List;

public class ClockSteps {

	ClockPage c = new ClockPage(driver);
	

	@Dado("acionar o menu alarme")
	public void acionarOMenuAlarme() throws Exception {
		c.acessarMenuAlarme();
	}

	@Quando("o ususario acionar o botao adicionar alarme")
	public void oUsusarioAcionarOBotaoAdicionarAlarme() throws Exception {
		c.acionarBotaoNovoAlarme();
	}

	@E("configurar a hora para {string},{string}")
	public void configurarAHoraPara(String hora, String periodo) throws Exception {
		
		String tempo [] = hora.split(":");
		String horaA = tempo[0];
		String minutos = tempo[1];
		
		c.clicarNaHora(horaA);
		c.clicarNaMinuto(minutos);
		c.selecionarOPeriodo(periodo);
		c.acionarBotaoOk();
	}
	
	@Entao("o app adiciona um novo alarme com as infroma?oes")
	public void oAppAdicionaUmNovoAlarmeComAsInfromaOes(List <String> dados) {
		
		c.validarInformacoes(dados);
	}
}
