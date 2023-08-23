/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.arquiteto.singletonpluscreator;

import com.arquiteto.MetodosBanco;
import com.arquiteto.banco.MongoFactory;
import com.arquiteto.banco.MysqlFactory;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Singletonpluscreator {

    public static void main(String[] args) throws ClassNotFoundException {
               
        MysqlFactory bf1 = MysqlFactory.getInstance();        
        System.out.println("Carreguei a instancia: "+ bf1.hashCode());       
        Connection connection1 = bf1.getDatabaseObject("jdbc:mysql://localhost/hibernate?user=fabricio&password=.lne/oPzGtQiME9_");
        System.out.println("Agora eu tenho a conexao: "+ connection1.hashCode());      
        bf1 = MysqlFactory.getInstance();
        System.out.println("Carreguei a instancia: "+ bf1.hashCode() + " = mesma instancia");
        
        
        MongoFactory mg1 = MongoFactory.getInstance();
        System.out.println("Carreguei a instancia: "+ mg1.hashCode());   
        MongoDatabase mongodb1 = mg1.getDatabaseObject("mongodb://localhost:27017/?empresa=empresa");
        System.out.println("Agora eu tenho a conexao: "+ mongodb1.hashCode());      
             
        /* Agora eu tenho 2 conexões de bancos diferentes */
       
        
        
        
        
        
    }
}
