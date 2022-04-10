package com.qa.certification.makerstest.task;

import com.qa.certification.makerstest.interactions.ConsultInformationDB;
import com.qa.certification.makerstest.models.Total;

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
