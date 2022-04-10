package com.qa.certification.makerstest.interactions;

import java.sql.ResultSet;

import com.qa.certification.makerstest.models.Total;
import com.qa.certification.makerstest.task.SendingInformationDB;
import com.qa.certification.makerstest.utils.conexionbd.ConnectionDB;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class SendInformationDB implements Interaction{
	
	private Total totales;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			
			ConnectionDB.executeInsert("INSERT INTO `totales`(`id`, `fecha`, `portafolio`, `nominal`, `precio`, `total`) "
															 + "	VALUES ('0', '"
															 +totales.getDate()+"', '"
															 +totales.getPortafolio()+"', '"
															 +totales.getNominal()+"', '"
					   				 					     +totales.getPrice()+"', '"
					   				 					     +totales.getTotal()+"')");
			
			
			actor.remember("total",totales.getTotal());
			   
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		
	}
	
	public static SendInformationDB forTable(Total totales) {
		return Tasks.instrumented(SendInformationDB.class, totales);
	}
	
	public SendInformationDB (Total totales) {
		this.totales= totales;
	}

}
