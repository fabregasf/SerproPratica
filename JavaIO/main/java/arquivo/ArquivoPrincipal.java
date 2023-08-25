/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivo;

import fabricio.com.javaio.JavaIO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ArquivoPrincipal {
    
    FileInputStream fi;
        
    public ArquivoPrincipal() {
           
    }
    
    public void leArquivo(){
        try {          
            // Posso 'picar' o caminho usando esse método  
            // Geralmente se usa endereços fixos (c:, /mnt)
            Path path = Paths.get("C:\\filadebytes.txt");
            
            if (!Files.exists(path)){
                Files.createFile(path);
            }
            
            BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            
            var line = reader.readLine();
            
            System.out.println("Vamos ler o conteudo do arquivo: "+ path.getFileName());
            while (line!=null){
                    System.out.println(line);
                    line= reader.readLine();
            }
            reader.close();
            
        } catch (IOException ex) {
            Logger.getLogger(JavaIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
