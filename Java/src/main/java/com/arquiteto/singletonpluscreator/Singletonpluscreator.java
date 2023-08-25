/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.arquiteto.singletonpluscreator;

import Operacoes.CriaCollection;
import Operacoes.MongoDAO;
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
        /* Agora eu tenho 2 conexões de bancos diferentes */      
        MysqlFactory bf1 = MysqlFactory.getInstance();        
        System.out.println("Carreguei a instancia: "+ bf1.hashCode());       
        Connection connection1 = bf1.getDatabaseObject("jdbc:mysql://localhost/hibernate?user=fabricio&password=.lne/oPzGtQiME9_");
        System.out.println("Agora eu tenho a conexao: "+ connection1.hashCode());      
        bf1 = MysqlFactory.getInstance();
        System.out.println("Carreguei a instancia: "+ bf1.hashCode() + " = mesma instancia");
        bf1.close();
        
        MongoFactory mg1 = MongoFactory.getInstance();
        System.out.println("Carreguei a instancia: "+ mg1.hashCode());   
        MongoClient mongodb1 = mg1.getDatabaseObject("mongodb://admin:mongosrv@localhost:27017");
        System.out.println("conectei na instancia mongodb: "+ mongodb1.getClusterDescription());      
        
        // trabalhando no mongo
        CriaCollection criador = new CriaCollection(mongodb1) ;
        criador.criaDefault();
        MongoDAO fazerInsercao = new MongoDAO(criador.getBanco());
        fazerInsercao.commit();
        fazerInsercao.debug();
        
        mg1.close();
        
       
        // Agora eu fecho as 2 conexoes usando métodos específicos da classe
        
        
        
        
        
    }
}
