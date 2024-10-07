
package modell;


public class Auto {
    
    private String rendszam, szin;
    private boolean extrak;
    
    public Auto(String rendszam, String szin){
        this(rendszam, szin, false);
        
    }
    public Auto(String rendszam, String szin, boolean extrak){
        this.rendszam = rendszam;
        this.szin = szin;
        this.extrak = extrak;    
    }    

    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public boolean isExtrak() {
        return extrak;
    }
    
    public void vanExtra(){
        extrak = true;
    }
    public void nincsExtra(){
        extrak = false;
    }
}
