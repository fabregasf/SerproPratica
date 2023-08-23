/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto.banco;

import com.arquiteto.MetodosBanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author Usuario
 */
public class MysqlFactory implements MetodosBanco{
    
    public static MysqlFactory factory = null;	
    private Connection conn;    
    
    // Cria a instancia in memory, evitando a recriação de outra instância 
    // para diferentes variáveis
    public static MysqlFactory getInstance() { 
	if (factory == null) 
            factory = new MysqlFactory();            
        return factory; 
    }
    
    private MysqlFactory(){ 
    	conn = null;
    }   

    @Override
    public Connection getDatabaseObject(String uri) {
        try{        
//            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(uri);
        }
        catch (SQLException e) { 
			System.out.println("SQLException: " + e.getMessage());
                        System.out.println("SQLState: " + e.getSQLState());
                        System.out.println("VendorError: " + e.getErrorCode());
	}       
        
        return  this.conn;	
    }
    
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            minhaSqlEsception(ex);
        }
    }
    
    /* SQL error custom */
    public static void minhaSqlEsception(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        
        }
    
    }
    
}
