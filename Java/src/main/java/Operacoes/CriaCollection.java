/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operacoes;

import com.mongodb.MongoException;
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
    private MongoDatabase banco;
    
    public CriaCollection(MongoClient instancia) {
        
        banco = instancia.getDatabase("empresa");      
        Document document = new Document();    
         
    }
    
    public void criaDefault(){
        try {
            // adicionando dados            
            getBanco().createCollection("funcionarios" );                       
        }
        catch(MongoException ex){        
            ex.printStackTrace(System.err);            
        }  
    }

    /**
     * @return the options
     */
    public CreateCollectionOptions getOptions() {
        return options;
    }

    /**
     * @param options the options to set
     */
    public void setOptions(CreateCollectionOptions options) {
        this.options = options;
    }

    /**
     * @return the banco
     */
    public MongoDatabase getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(MongoDatabase banco) {
        this.banco = banco;
    }
    
}
