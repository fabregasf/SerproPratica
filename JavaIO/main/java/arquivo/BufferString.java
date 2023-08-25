/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Le uma String passada
 * @author Usuario
 */
public class BufferString {
    
    int linhas=0;
    
    public BufferString() {
    }
    
    
    
    public void leBuffer(){
             String s ="ABCDE \nFGHIJ";
             StringReader sr = null;
             BufferedReader br = null;
             
             try{

                sr = new StringReader(s);
                br = new BufferedReader(sr);

                // leio chars
                System.out.println((char)br.read()); 
                System.out.println((char)br.read());
                
                // Leio linhas de chars, todo o arquivo
//                var line = br.readLine();               
//                while (line != null){
//                    System.out.println(line);
//                    linhas = linhas + line.length();
//                    line= br.readLine();
//                }
                // Depois daqui eu não terei mais nada pra ler... 
                // Terei que reposicionar no inicio
                System.out.println((char)br.read());
                
                // marco este ponto, e o contador de bytes não anda
                br.mark(0);
                System.out.println((char)br.read());
                br.reset();
                System.out.println((char)br.read());
                System.out.println((char)br.read());
                

             } catch (Exception e) {

                // exception occurred.
                e.printStackTrace();
             }finally{

                // releases any system resources associated with the stream
                if(sr!=null)
                   sr.close();
                if(br!=null)
                           try {
                                  br.close();
                           } catch (IOException e) {
                                  // TODO Auto-generated catch block
                                  e.printStackTrace();
                           }
             }
          }
        
    }
        

