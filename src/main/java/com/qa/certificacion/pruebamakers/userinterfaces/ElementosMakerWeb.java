package com.qa.certificacion.pruebamakers.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ElementosMakerWeb {
	
	public static final Target BTNCONTACTO=Target.the("contacto").locatedBy("//ul[@id='menu-principal']//a[@href='https://somosmakers.co/contacto/']");
	public static final Target TXTCELULAR=Target.the("celular").locatedBy("//div[@class='et_pb_blurb_description']/p/span[3]");
	public static final Target TXTNOMBRE=Target.the("nombre").locatedBy("//input[@id='et_pb_contact_first_0']");
	public static final Target TXTAPELLIDO =Target.the("apellido").locatedBy("//input[@id='et_pb_contact_last_0']");
	public static final Target TXTEMAIL =Target.the("email").locatedBy("//input[@id='et_pb_contact_email_0']");
	public static final Target TXTTELEFONO =Target.the("telefono").locatedBy("//input[@id='et_pb_contact_phone_0']");
	public static final Target TXTMENSAJE =Target.the("telefono").locatedBy("//textarea[@id='et_pb_contact_message_0']");
	public static final Target BTNENVIARMENSAJE =Target.the("telefono").locatedBy("//button[@class='et_pb_contact_submit et_pb_button']");
	
}
