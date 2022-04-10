package com.qa.certification.makerstest.questions;

import com.qa.certification.makerstest.interactions.SendInformationDB;
import com.qa.certification.makerstest.models.Total;

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
