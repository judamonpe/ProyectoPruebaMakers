package com.qa.certificacion.pruebamakers.questions;

import com.qa.certificacion.pruebamakers.interactions.SendInformationDB;
import com.qa.certificacion.pruebamakers.models.Totales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class TheResult implements Question<String>{


	@Override
	public String answeredBy(Actor actor) {
		
		return actor.recall("totalCalculated");
	}
	
	public static TheResult ofTheQuery() {
		return new TheResult();
	}
	
	

}
