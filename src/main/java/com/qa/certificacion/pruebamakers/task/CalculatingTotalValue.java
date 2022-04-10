package com.qa.certificacion.pruebamakers.task;

import com.qa.certificacion.pruebamakers.interactions.CalculateTotalValue;
import com.qa.certificacion.pruebamakers.models.Totales;

import ch.lambdaj.function.aggregate.Concat;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CalculatingTotalValue implements Task{

	
	private String portafolio;
	private float precio, nominal;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(CalculateTotalValue.withfields(nominal, precio, portafolio));
		
	}

	public static CalculatingTotalValue withFields(float nominal, float precio, String portafolio) {
	
		return Tasks.instrumented(CalculatingTotalValue.class, nominal, precio, portafolio);
	}
	
	public CalculatingTotalValue (float nominal, float precio, String portafolio) {
		this.nominal= nominal;
		this.precio= precio;
		this.portafolio= portafolio;
	}
}
