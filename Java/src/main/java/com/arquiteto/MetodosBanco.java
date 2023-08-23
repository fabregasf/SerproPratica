/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.arquiteto;

import com.arquiteto.banco.MysqlFactory;
import java.sql.Connection;

/**
 *
 * @author Usuario
 * Implemantando método abstrato para buscar uma coleção
*/

public interface MetodosBanco<T> {
    public T getDatabaseObject(String uri);
    
}
