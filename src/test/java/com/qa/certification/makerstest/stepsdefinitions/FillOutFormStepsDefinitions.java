package com.qa.certification.makerstest.stepsdefinitions;

import java.util.List;

import com.qa.certification.makerstest.interactions.CalculateTotalValue;
import com.qa.certification.makerstest.models.Message;
import com.qa.certification.makerstest.models.Total;
import com.qa.certification.makerstest.questions.CaptureCellPhone;
import com.qa.certification.makerstest.questions.MessageSent;
import com.qa.certification.makerstest.questions.TheResult;
import com.qa.certification.makerstest.task.CalculatingTotalValue;
import com.qa.certification.makerstest.task.ConsultingInformationDB;
import com.qa.certification.makerstest.task.FillOutInformation;
import com.qa.certification.makerstest.task.GoToTab;
import com.qa.certification.makerstest.task.SendingInformationDB;
import com.qa.certification.makerstest.utils.conexionbd.ConnectionDB;
import com.qa.certification.makerstest.utils.drivers.MyDriver;

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

public class FillOutFormStepsDefinitions {
	
	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Juan");
	}
	

	@Given("^user is in the webpage (.*)$")
	public void userIsInTheWebpage(String webPage) {
		
		
		theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriver.web().inTheWebPage(webPage))); 
	}

	@When("^user clic on tab (.*)$")
	public void userClicOnTab(String enlace)  {
		
		
		theActorInTheSpotlight().wasAbleTo(GoToTab.contact());
	}

	@Then("^user capture cell number (.*) of customer service$")
	public void userCaptureCellNumber(String cel)  {
		
		theActorInTheSpotlight().should(seeThat(CaptureCellPhone.ofcontact(),is(cel)));
	}

	
	@When("^user enter information in the leave us a message form$")
	public void userEnterInformationInTheLeaveUsAMessageForm(List<Message> message) {
		
		theActorInTheSpotlight().asksFor(CaptureCellPhone.ofcontact());
		theActorInTheSpotlight().wasAbleTo(FillOutInformation.inALeaveUsMessage(message.get(0)));
	}
	
	@Then("^user should see messsage is (.*)$")
	public void userShouldSeeMessageIs(String message) {
		
		theActorInTheSpotlight().should(seeThat(MessageSent.aMakers(),is(message)));
	}
	

}
