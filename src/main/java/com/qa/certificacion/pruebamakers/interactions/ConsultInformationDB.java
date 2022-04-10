package com.qa.certificacion.pruebamakers.interactions;

import java.sql.ResultSet;

import com.qa.certificacion.pruebamakers.models.Totales;
import com.qa.certificacion.pruebamakers.utils.conexionbd.ConnectionDB;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class ConsultInformationDB implements Interaction{
	
	
	private String total;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			ResultSet rs= ConnectionDB.executeSelect("Select total from totales where total='"+total+"'"); 
	
			rs.next();

			actor.remember("totalSelect",rs.getString("total"));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static ConsultInformationDB forField(String total) {
		return Tasks.instrumented(ConsultInformationDB.class, total);
	}
	
	public ConsultInformationDB (String total) {
		this.total= total;
	}

}
