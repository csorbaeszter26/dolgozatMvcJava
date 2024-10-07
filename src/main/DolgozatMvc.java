
package main;

import modell.AutokModell;
import nezet.FelugroNezet;
import vezerlo.FelugroVezerlo;


public class DolgozatMvc {

  
    public static void main(String[] args) {
        
        
        AutokModell modell = new AutokModell();
        FelugroNezet nezet = new FelugroNezet();
        
        new FelugroVezerlo(modell, nezet);
    }
    
}
