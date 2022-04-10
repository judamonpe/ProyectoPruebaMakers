package com.qa.certificacion.pruebamakers.stepsdefinitions;

import java.util.List;

import com.qa.certificacion.pruebamakers.interactions.CalculateTotalValue;
import com.qa.certificacion.pruebamakers.models.Mensaje;
import com.qa.certificacion.pruebamakers.models.Totales;
import com.qa.certificacion.pruebamakers.questions.CapturaCelular;
import com.qa.certificacion.pruebamakers.questions.TheResult;
import com.qa.certificacion.pruebamakers.task.CalculatingTotalValue;
import com.qa.certificacion.pruebamakers.task.ConsultingInformationDB;
import com.qa.certificacion.pruebamakers.task.IngresarInformacion;
import com.qa.certificacion.pruebamakers.task.IrAPestaña;
import com.qa.certificacion.pruebamakers.task.SendingInformationDB;
import com.qa.certificacion.pruebamakers.utils.conexionbd.ConnectionDB;
import com.qa.certificacion.pruebamakers.utils.drivers.MyDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class LlenarFormularioStepsDefinitions {
	
	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Juan");
	}
	

	@Given("^el usuario esta en la pagina (.*)$")
	public void elUsuarioEstaEnLaPagina(String pagina) {
		
		
		theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriver.web().enLaPagina(pagina))); 
	}

	@When("^el usuario hace clic en el enlace (.*)$")
	public void elUsuarioHaceClicEnElEnlace(String enlace)  {
		
		
		theActorInTheSpotlight().wasAbleTo(IrAPestaña.contacto());
	}

	@Then("^el usuario captura el numero de celular (.*) de servicio al cliente$")
	public void elUsuarioCapturaElNumeroDeCelularDeServicioAlCliente(String celular)  {
		
		theActorInTheSpotlight().should(seeThat(CapturaCelular.deContacto(),is(celular)));
	}

	
	@When("^el usuario ingresa la informacion en el formulario dejanos un mensaje$")
	public void elUsuarioIngresaLaInformacionEnElFormulario(List<Mensaje> mensaje) {
		
		theActorInTheSpotlight().asksFor(CapturaCelular.deContacto());
		theActorInTheSpotlight().wasAbleTo(IngresarInformacion.enDejanosUnMensaje(mensaje.get(0)));
	}
	
	@Then("^el usuario toma un pantallazo a la informacion diligenciada$")
	public void elUsuarioTomaUnPantallazoALaInformacionDiligenciada() {
	}
	

}
