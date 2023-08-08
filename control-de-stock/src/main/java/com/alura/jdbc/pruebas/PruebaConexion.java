package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaConexion {

	public static void main(String[] args) throws SQLException {
		//creamos la conexion con la base de datos
		//tres parametros
		//url de la conexion(incluye nombre de la BD, luego el usuario de la DB (root), luego nuestra contraseña de root.
		
		Connection con = new ConnectionFactory().recuperaConexion();
		
		System.out.println("cerramos conexion");
		//cerramos la conexion
		con.close();
	}
}
