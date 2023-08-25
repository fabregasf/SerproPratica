/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto.banco;

import com.arquiteto.MetodosBanco;
import static com.arquiteto.banco.MysqlFactory.factory;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientException;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.MongoServerException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class MongoFactory implements MetodosBanco{
    
    public static MongoFactory factory = null;	
    private MongoDatabase mongodb; 
    private MongoClient mongoClient;
    
    public static MongoFactory getInstance() { 
	if (factory == null) 
            factory = new MongoFactory();            
        return factory; 
    }
    
    private MongoFactory(){
        mongodb = null;
    }        
    
    @Override
    public MongoClient getDatabaseObject(String uri) {              
        
        // Construct a ServerApi instance using the ServerApi.builder() method
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(uri))
                .serverApi(serverApi)
                .build();
        mongoClient = MongoClients.create(settings);               
        return mongoClient;
    }  

    @Override
    public void close() {
        this.mongoClient.close();
    }  
    
}
