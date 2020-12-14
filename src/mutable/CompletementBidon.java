/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutable;

import java.util.Scanner;

/**
 *
 * @author cyril.bouyer
 */
public class CompletementBidon {
    private static int[] tableDes737;
    
    static{//bloc d initialisation static
      tableDes737= new int [100];
       for (int i=0;i<tableDes737.length;i++)
       {
           tableDes737[i]=i*737;
       } 
    }
    
    public static void printSimplifie (String message, int...li) { //int ...li : liste variable d entiers
    Scanner s = new Scanner(message).useDelimiter("\\s*%\\s*");
            for (int i=0;i<li.length;i++)
               System.out.print(s.next() + " " + li[i]+ " ");//pas a la ligne
            if (s.hasNext())
                System.out.println(s.next()); //a la ligne
            
                
       }
}
