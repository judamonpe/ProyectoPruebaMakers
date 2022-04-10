package com.qa.certificacion.pruebamakers.interactions;

import java.sql.ResultSet;

import com.qa.certificacion.pruebamakers.models.Totales;
import com.qa.certificacion.pruebamakers.task.SendingInformationDB;
import com.qa.certificacion.pruebamakers.utils.conexionbd.ConnectionDB;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class SendInformationDB implements Interaction{
	
	private Totales totales;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			
			ConnectionDB.executeInsert("INSERT INTO `totales`(`id`, `fecha`, `portafolio`, `nominal`, `precio`, `total`) "
															 + "	VALUES ('0', '"
															 +totales.getFecha()+"', '"
															 +totales.getPortafolio()+"', '"
															 +totales.getNominal()+"', '"
					   				 					     +totales.getPrecio()+"', '"
					   				 					     +totales.getTotal()+"')");
			
			
			actor.remember("total",totales.getTotal());
			   
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		
	}
	
	public static SendInformationDB forTable(Totales totales) {
		return Tasks.instrumented(SendInformationDB.class, totales);
	}
	
	public SendInformationDB (Totales totales) {
		this.totales= totales;
	}

}
