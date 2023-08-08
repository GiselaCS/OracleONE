package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private DataSource dataSource;
	
	public ConnectionFactory() {
		// instancia del poole
		var pooledDataSource = new ComboPooledDataSource();
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_stock?useTimezone=true&serverTimezone=UTC");
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("gisela1234");
		
		//control de conexiones maximas
		pooledDataSource.setMaxPoolSize(10);
		
		
		this.dataSource = pooledDataSource;
		
	}

	public Connection recuperaConexion() {
		// abrimos conexion a la BD
				try {
		            return this.dataSource.getConnection();
		        } catch (SQLException e) {
		            throw new RuntimeException(e);
		        }
				
	}
}