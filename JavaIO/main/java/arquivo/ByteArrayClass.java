/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivo;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Usuario
 */
public class ByteArrayClass {
    
    public static byte[] toBites() throws FileNotFoundException, IOException{
        
        FileInputStream fistream = new FileInputStream("D:\\java-pratica\\filadebytes.txt"); 
        ByteArrayOutputStream os = new ByteArrayOutputStream(1024); 
        byte[] toBites = new byte[1024];
        int read;
        
        while ((read = fistream.read(toBites)) != -1){
                os.write(toBites, 0, read);
        }
        return os.toByteArray();
    }
    
    public void criaFile() throws IOException{
        Path path = Paths.get("C:\\filadebytes.txt");    
        if (!Files.exists(path)){
                Files.createFile(path);
        }
    }
    
}
