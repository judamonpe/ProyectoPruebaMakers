package com.qa.certification.makerstest.task;



import com.qa.certification.makerstest.userinterfaces.MakerWebElements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToTab implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MakerWebElements.BTNCONTACT));
		
	}
	
    public static GoToTab contact() {
		
		return Tasks.instrumented(GoToTab.class);
		
	}

}
