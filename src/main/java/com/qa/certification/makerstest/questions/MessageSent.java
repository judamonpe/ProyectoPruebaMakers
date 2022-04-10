package com.qa.certification.makerstest.questions;

import com.qa.certification.makerstest.userinterfaces.MakerWebElements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MessageSent implements Question<String> {

	
	@Override
	public String answeredBy(Actor actor) {
		
		
		return Text.of(MakerWebElements.TXTSENDMESSAGE).viewedBy(actor).asString();
	}
	
	public static MessageSent aMakers() {
		return new MessageSent();
	}



}
