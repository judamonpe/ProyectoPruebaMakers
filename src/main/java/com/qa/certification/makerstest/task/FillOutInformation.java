package com.qa.certification.makerstest.task;

import com.qa.certification.makerstest.models.Message;
import com.qa.certification.makerstest.userinterfaces.MakerWebElements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOutInformation implements Task {
	
	private Message message;


	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(MakerWebElements.TXTNAME),
				         Enter.theValue(message.getName()).into(MakerWebElements.TXTNAME),
				         Click.on(MakerWebElements.TXTSURNAME),
				         Enter.theValue(message.getSurname()).into(MakerWebElements.TXTSURNAME),
				         Click.on(MakerWebElements.TXTEMAIL),
				         Enter.theValue(message.getEmail()).into(MakerWebElements.TXTEMAIL),
				         Click.on(MakerWebElements.TXTPHONE),
				         Enter.theValue(message.getPhone()).into(MakerWebElements.TXTPHONE),
				         Click.on(MakerWebElements.TXTMESSAGE),
				         Enter.theValue(actor.recall("cel")).into(MakerWebElements.TXTMESSAGE),
				         Click.on(MakerWebElements.BTNSENDMESSAGE));
		
	}
	
	
	
	public static FillOutInformation inALeaveUsMessage(Message message) {
		return Tasks.instrumented(FillOutInformation.class, message);
	}
	
	public FillOutInformation (Message message) {
		this.message= message;
	}
	
	

}
