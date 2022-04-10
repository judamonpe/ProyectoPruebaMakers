package com.qa.certificacion.pruebamakers.interactions;



import java.text.DecimalFormat;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class CalculateTotalValue implements Interaction{

	
	private String portafolio;
	private float precio,nominal;
	private int total;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
	
		
		actor.remember("totalCalculated",String.valueOf(calculate(nominal, precio, portafolio)));
		
	}
	
	public static CalculateTotalValue withfields(float nominal, float precio, String portafolio) {
		return Tasks.instrumented(CalculateTotalValue.class, nominal,precio,portafolio);
	}
	
	public CalculateTotalValue (float nominal, float precio, String portafolio) {
		this.nominal= nominal;
		this.precio= precio;
		this.portafolio= portafolio;
	}
	
	
	public static float calculate(float nominal, float precio, String portafolio) {

         int total;
         
     
     	
         
		if (portafolio.equals("OBL-RIESGO")) {
			
			total = (int)(nominal*precio)+2000;
			
		} else {
			
			total = (int)(nominal*precio);

		}
		return total;
		
		
	}

}
