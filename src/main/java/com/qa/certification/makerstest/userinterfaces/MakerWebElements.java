package com.qa.certification.makerstest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MakerWebElements {
	
	public static final Target BTNCONTACT=Target.the("contact").locatedBy("//ul[@id='menu-principal']//a[@href='https://somosmakers.co/contacto/']");
	public static final Target TXTCEL=Target.the("cel").locatedBy("//div[@class='et_pb_blurb_description']/p/span[3]");
	public static final Target TXTNAME=Target.the("name").locatedBy("//input[@id='et_pb_contact_first_0']");
	public static final Target TXTSURNAME =Target.the("surmane").locatedBy("//input[@id='et_pb_contact_last_0']");
	public static final Target TXTEMAIL =Target.the("email").locatedBy("//input[@id='et_pb_contact_email_0']");
	public static final Target TXTPHONE =Target.the("phone").locatedBy("//input[@id='et_pb_contact_phone_0']");
	public static final Target TXTMESSAGE =Target.the("message").locatedBy("//textarea[@id='et_pb_contact_message_0']");
	public static final Target BTNSENDMESSAGE =Target.the("btnsendmessage").locatedBy("//button[@class='et_pb_contact_submit et_pb_button']");
	public static final Target TXTSENDMESSAGE =Target.the("txtsendmessage").locatedBy("//div[@class='et-pb-contact-message']/p");
	
}
