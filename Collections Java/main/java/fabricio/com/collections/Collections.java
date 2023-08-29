/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fabricio.com.collections;

import entidades.Dog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Usuario
 */
public class Collections {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Dog doguin = new Dog();
        doguin.raca = "caramelo";
        doguin.nome = "heroizin";
        doguin.peso = 0f;
        Dog doguin2 = new Dog();
        doguin2.raca = "caramelao";
        doguin2.nome = "heroizin da silva";
        doguin2.peso = 2.5f;

        Set<Dog> conjuntoFixo = new HashSet<>();        
        conjuntoFixo.add(doguin);
        conjuntoFixo.add(doguin2);
        
        if (doguin.equals(doguin2) == false) System.out.println("Os objetos no Set são "
                + "imutaveis e unicos");
            
        for (Dog cachorinhofdp : conjuntoFixo){
            
            if (cachorinhofdp.peso == 0) {
                System.out.println("Peso não pode ser zero");
                
                // Dará erro por ser imutavel
//                if (scanner.nextInt() == 0){
//                    System.out.println("Voce entrou com 0. Será excluido do Iterable.");
//                    conjuntoFixo.remove(cachorinhofdp);
//                }
               
            }            
            
            System.out.println("Meu nome: " + cachorinhofdp.nome);
            System.out.println("Minha raça: " + cachorinhofdp.raca);
            System.out.println("Meu Peso: " + cachorinhofdp.peso);
        }
        // Loop com Iterator
        Iterator<Dog> iteraConjunto = conjuntoFixo.iterator();
        while (iteraConjunto.hasNext())
        {   // estou iterando sobre um objeto, então preciso dos stributos
            System.out.println(iteraConjunto.next().nome);
        }
        
        // caiu na prova 
        List<String> listaDogs = new ArrayList<String>();
        listaDogs.add("BRANCO");
        listaDogs.add("AMARELO");
        listaDogs.add("VERDe"); 
        
        java.util.Collections.sort(listaDogs);
        System.out.print("\nLista apos ordenacao: "+listaDogs);
        
        // aqui ja pega ordenado
        Iterator<String> iter = listaDogs.iterator(); 
        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");
        }
        
        
        
    }
}
