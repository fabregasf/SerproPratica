/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fabricio.com.javaio;

import arquivo.ArquivoPrincipal;
import arquivo.BufferString;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class JavaIO {

    public static void main(String[] args) {
        
        ArquivoPrincipal testeLeituraFile; // pego o inicio da stream VINDO DE UM ARQUIVO	
	FileOutputStream fo;
	BufferedOutputStream boutstream; 
	ByteArrayInputStream byteoutstream; // cada posição com 8 bits
        
        testeLeituraFile = new ArquivoPrincipal();
        testeLeituraFile.leArquivo();
        
        BufferString bstring = new BufferString();
        bstring.leBuffer();
        
        
        
        
        
        
        
    }
}
