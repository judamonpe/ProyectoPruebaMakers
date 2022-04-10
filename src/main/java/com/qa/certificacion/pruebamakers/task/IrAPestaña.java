package com.qa.certificacion.pruebamakers.task;



import com.qa.certificacion.pruebamakers.userinterfaces.ElementosMakerWeb;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrAPestaña implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ElementosMakerWeb.BTNCONTACTO));
		
	}
	
    public static IrAPestaña contacto() {
		
		return Tasks.instrumented(IrAPestaña.class);
		
	}

}
