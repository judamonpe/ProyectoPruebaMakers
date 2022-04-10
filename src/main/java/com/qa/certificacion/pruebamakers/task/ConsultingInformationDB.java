package com.qa.certificacion.pruebamakers.task;

import com.qa.certificacion.pruebamakers.interactions.ConsultInformationDB;
import com.qa.certificacion.pruebamakers.models.Totales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConsultingInformationDB implements Task{

	private String total;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(ConsultInformationDB.forField(total));
		
	}
	
	public static ConsultingInformationDB forfield(String total) {
		return Tasks.instrumented(ConsultingInformationDB.class, total);
	}
	
	public ConsultingInformationDB (String total) {
		this.total= total;
	}

}
