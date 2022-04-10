package com.qa.certification.makerstest.questions;

import com.qa.certification.makerstest.userinterfaces.MakerWebElements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CaptureCellPhone implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		actor.remember("cel",Text.of(MakerWebElements.TXTCEL).viewedBy(actor).asString());
		return Text.of(MakerWebElements.TXTCEL).viewedBy(actor).asString();
	}
	
	public static CaptureCellPhone ofcontact() {
		return new CaptureCellPhone();
	}

}
