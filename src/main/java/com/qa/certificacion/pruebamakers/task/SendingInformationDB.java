package com.qa.certificacion.pruebamakers.task;

import java.util.List;

import com.qa.certificacion.pruebamakers.interactions.SendInformationDB;
import com.qa.certificacion.pruebamakers.models.Totales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SendingInformationDB implements Task{

	private Totales totales; 



	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(SendInformationDB.forTable(totales)); 

	}

	public static SendingInformationDB forTable(Totales totales) {
		return Tasks.instrumented(SendingInformationDB.class, totales);
	}
	
	public SendingInformationDB (Totales totales) {
		this.totales= totales;
	}


}
