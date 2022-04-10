package com.qa.certification.makerstest.utils.conexionbd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDB {
	
	private static Connection conn;
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String USER="judamonpe";
	private static final String PASSWORD="Makers123456*";
	private static final String URL="jdbc:mysql://db4free.net:3306/makersprueba?autoReconnect=true&useSSL=false";
	
	public static ConnectionDB createConnection() {
		conn = null;
		try {
			Class.forName(DRIVER);
			conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (ClassNotFoundException |SQLException e) {
			
			System.out.println("Failed to connect"+" "+e);
			
		}
		return new ConnectionDB();
	}
	
	//Este metodo nos retorna la conexion
	public Connection getConnection(){
		return conn;
	}
	
	
	public static void closeConexion() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ResultSet executeSelect(String query) {

		try {

			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			return rs;
			
		} catch (Exception e) {
			return null;
		}

	}
	
	public static boolean executeInsert(String query) {

		try {

			PreparedStatement ps = conn.prepareStatement(query);
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
