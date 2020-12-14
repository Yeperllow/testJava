/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutable;

/**
 *
 * @author cyril.bouyer
 */

//Mettre en evidence le ramasse miette
public class PourVoirLeRM {
    private static int nbobjets =0;
    private int id;
    
    public PourVoirLeRM() {
        nbobjets++;
        id = nbobjets;
    }
    
   @Override
   protected void finalize() throws Throwable {
       System.out.println("Destruction de l objet numero : " +id);  //sout puis tab
       System.exit(id); //mettre fin a l application
   }
}
