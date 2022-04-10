package com.qa.certificacion.pruebamakers.task;

import java.util.List;
import java.util.Map;

import com.qa.certificacion.pruebamakers.models.Mensaje;
import com.qa.certificacion.pruebamakers.models.Totales;
import com.qa.certificacion.pruebamakers.questions.CapturaCelular;
import com.qa.certificacion.pruebamakers.userinterfaces.ElementosMakerWeb;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarInformacion implements Task {
	
	private Mensaje mensaje;
//	private Map<String, String> infomensaje;
//	
//	public IngresarInformacion(List<Map<String, String>> list) {
//		infomensaje = list.get(0);
//	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
	String x =actor.recall("celular");
		
		actor.attemptsTo(Click.on(ElementosMakerWeb.TXTNOMBRE),
				         Enter.theValue(mensaje.getNombre()).into(ElementosMakerWeb.TXTNOMBRE),
				         Click.on(ElementosMakerWeb.TXTAPELLIDO),
				         Enter.theValue(mensaje.getApellido()).into(ElementosMakerWeb.TXTAPELLIDO),
				         Click.on(ElementosMakerWeb.TXTEMAIL),
				         Enter.theValue(mensaje.getEmail()).into(ElementosMakerWeb.TXTEMAIL),
				         Click.on(ElementosMakerWeb.TXTTELEFONO),
				         Enter.theValue(mensaje.getTelefono()).into(ElementosMakerWeb.TXTTELEFONO),
				         Click.on(ElementosMakerWeb.TXTCELULAR),
				         Enter.theValue(actor.recall("celular")).into(ElementosMakerWeb.TXTTELEFONO),
				         Click.on(ElementosMakerWeb.BTNENVIARMENSAJE));
		
	}
	
	
	
	public static IngresarInformacion enDejanosUnMensaje(Mensaje mensaje) {
		return Tasks.instrumented(IngresarInformacion.class, mensaje);
	}
	
	public IngresarInformacion (Mensaje mensaje) {
		this.mensaje= mensaje;
	}
	
	

}
