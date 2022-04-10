package com.qa.certification.makerstest.task;

import java.util.List;

import com.qa.certification.makerstest.interactions.SendInformationDB;
import com.qa.certification.makerstest.models.Total;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SendingInformationDB implements Task{

	private Total totales; 



	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(SendInformationDB.forTable(totales)); 

	}

	public static SendingInformationDB forTable(Total totales) {
		return Tasks.instrumented(SendingInformationDB.class, totales);
	}
	
	public SendingInformationDB (Total totales) {
		this.totales= totales;
	}


}
