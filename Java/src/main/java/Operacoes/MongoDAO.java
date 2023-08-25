/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operacoes;

import com.mongodb.MongoException;
import com.mongodb.bulk.BulkWriteResult;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.DeleteOneModel;
import com.mongodb.client.model.InsertManyOptions;
import com.mongodb.client.model.InsertOneModel;
import com.mongodb.client.model.ReplaceOneModel;
import com.mongodb.client.model.UpdateOneModel;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.InsertManyResult;
import com.mongodb.internal.operation.InsertOperation;
import java.util.Arrays;
import java.util.stream.Stream;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class MongoDAO {
    Document document;
    MongoDatabase bancoRecebido;
    
    public  MongoDAO(MongoDatabase bancoRecebido) {
        document = new Document();
        this.bancoRecebido = bancoRecebido;      
        
    }
    
    public void commit(){
        document.append("id", 1); 
        document.append("nome", "Fabricio"); 
        document.append("setor", "TI"); 
        document.append("funcao", "Analista de Sistemas"); 
        
        this.bancoRecebido.getCollection("funcionarios").insertOne(document);
               
    }
    
    public void commitBulk(){
        MongoCollection<Document> collection = this.bancoRecebido.getCollection("funcionarios");
        
         try {  InsertManyResult resultMany; // implamentar depois
                BulkWriteResult result = collection.bulkWrite(
                        Arrays.asList( 
                                new InsertOneModel<>(new Document().append("id", 2)
                                .append("nome", "Isaias").append("setor", "TI")
                                .append("funcao", "Analista de Sistemas")),
                                new InsertOneModel<>(new Document().append("id", 3)
                                .append("nome", "Breno").append("setor", "DID")
                                .append("funcao", "Gestor")),                               
                                new UpdateOneModel<>(new Document("funcao", "Gestor"),
                                        new Document("$set", new Document("funcao", "Secretario")),
                                        new UpdateOptions().upsert(true))      // uso update pra inserir          
                                ));
                System.out.println("Result statistics:" +
                        "\ninserted: " + result.getInsertedCount() +
                        "\nupdated: " + result.getModifiedCount() +
                        "\ndeleted: " + result.getDeletedCount());
            } catch (MongoException me) {
                System.err.println("The bulk write operation failed due to an error: " + me);
            }
        
    }
    // printa o contador de registros
    public void debug(){
        System.out.println("Numero de funcionarios: ");
        System.out.println(this.bancoRecebido.getCollection("funcionarios").countDocuments());
    }
    
}
