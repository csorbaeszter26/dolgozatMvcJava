
package vezerlo;

import modell.AutokModell;
import nezet.FelugroNezet;

public class FelugroVezerlo {

    private AutokModell modell;
    private FelugroNezet nezet;
    
    public FelugroVezerlo(AutokModell modell, FelugroNezet nezet){
        
        this.modell = modell;
        this.nezet = nezet;
        start();
        
    }
    public void start(){
        nezet.megjelenit(modell.kezdes());
        modell.setValasz(nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());
        
    }
   
    
}
