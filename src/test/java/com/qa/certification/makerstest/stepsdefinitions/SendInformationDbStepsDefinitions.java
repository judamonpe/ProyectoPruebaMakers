package com.qa.certification.makerstest.stepsdefinitions;

import java.util.List;

import com.qa.certification.makerstest.interactions.CalculateTotalValue;
import com.qa.certification.makerstest.models.Total;
import com.qa.certification.makerstest.questions.TheResult;
import com.qa.certification.makerstest.task.CalculatingTotalValue;
import com.qa.certification.makerstest.task.ConsultingInformationDB;
import com.qa.certification.makerstest.task.SendingInformationDB;
import com.qa.certification.makerstest.utils.conexionbd.ConnectionDB;

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
	
	private Total totales;
	
	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
		ConnectionDB.createConnection();
		theActorCalled("Juan");
	}


	@When("^user send customer information$")
	public void userSendCustomerInformation(List<Total> totales)  {

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
