package com.qa.certificacion.pruebamakers.stepsdefinitions;

import java.util.List;

import com.qa.certificacion.pruebamakers.interactions.CalculateTotalValue;
import com.qa.certificacion.pruebamakers.models.Totales;
import com.qa.certificacion.pruebamakers.questions.TheResult;
import com.qa.certificacion.pruebamakers.task.CalculatingTotalValue;
import com.qa.certificacion.pruebamakers.task.ConsultingInformationDB;
import com.qa.certificacion.pruebamakers.task.SendingInformationDB;
import com.qa.certificacion.pruebamakers.utils.conexionbd.ConnectionDB;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class SendInformationDbStepsDefinitions {
	
	private Totales totales;
	
	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
		ConnectionDB.createConnection();
		theActorCalled("Juan");
	}


	@When("^user send customer information$")
	public void userSendCustomerInformation(List<Totales> totales)  {

		theActorInTheSpotlight().wasAbleTo(SendingInformationDB.forTable(totales.get(0)));
	}

	
	@When("^User consult the information(.*) in the database$")
	public void userConsultTheInformationInTheDatabase(String total)  {
		
		theActorInTheSpotlight().wasAbleTo(ConsultingInformationDB.forfield(total));
	}
	
	
	@When("^User calculate total value with fields (.*), (.*) and (.*)$")
	public void userCalculateTotalValueWithFieldsAnd(float nominal, float precio, String portafolio) {
		
		theActorInTheSpotlight().wasAbleTo(CalculatingTotalValue.withFields(nominal, precio, portafolio));

	}

	
	@Then("^user should see the total calculated is equals total field in the database$")
	public void userCanSeeTheTotalCalculatedIsEqualsTotalFieldInTheDatabase() {
		
		String totalconsultaDB=theActorInTheSpotlight().recall("totalSelect");
		
		theActorInTheSpotlight().should(seeThat(TheResult.ofTheQuery(), is(totalconsultaDB)));
	}


}
