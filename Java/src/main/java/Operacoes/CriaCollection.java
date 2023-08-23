/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operacoes;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.CreateCollectionOptions;
import org.bson.Document;

/**
 *  Vamos criar um documento inicial no MongoDB
 *  @author Fabricio
 */
public class CriaCollection {
    
    private CreateCollectionOptions options;    
    
    public CriaCollection(MongoDatabase instancia) {
        instancia.createCollection(
                "funcionarios" );
        Document document = new Document();        
        
        MongoClient cli = null;
        //cli.getDatabase("empresa").createCollection(string);
        
        
         
         
    }
    
    
    
}
