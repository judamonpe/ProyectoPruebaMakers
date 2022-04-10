package com.qa.certificacion.pruebamakers.questions;

import com.qa.certificacion.pruebamakers.userinterfaces.ElementosMakerWeb;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CapturaCelular implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		actor.remember("celular",Text.of(ElementosMakerWeb.TXTCELULAR).viewedBy(actor).asString());
		return Text.of(ElementosMakerWeb.TXTCELULAR).viewedBy(actor).asString();
	}
	
	public static CapturaCelular deContacto() {
		return new CapturaCelular();
	}

}
