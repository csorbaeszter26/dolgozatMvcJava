
package modell;


public class AutokModell {
    private Auto[] autok;
    private String valasz;
    
    public AutokModell(){
        
        autok = new Auto[4];
        autok[0] = new Auto("JGK223", "piros");
        autok[1] = new Auto("SDB456", "szürke");
        autok[2] = new Auto("PPK897", "kék", true);
        autok[3] = new Auto("OOP294", "fekete");
        
    }
    
    public String kezdes(){
        String k = "A garázsban a következő autók találhatóak: \n\n";
        int i = 1;
        for (Auto auto : autok) {
            String r = auto.getRendszam();
            String s = auto.getSzin();
            k += i++ + ". Autó rendszáma: " + r + ", " + "színe: " + s + "\n";
        }
        return k;   
        
    }
    
    public String getValasz() {
        return valasz;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
    }
    
//    public String ellenorzes(){
//        String s = "Ehhez az autóhoz már tartoznak extrák.";
//        s = autok[valasztas].isExtrak() ? s : "Hozzáadtuk az extrát";
//        
//       
//        return s;
//    }        
    
    public String ellenorzes(){
        String s = "Át szeretnéd festeni?";
        s = valasz == "igen" ? s : "Szuper!";
        //s = valasz == "nem" ? s : "Viszlát";
        
//        if (valasz == "igen"){
//            s = "Milyen színre?";
//        }else{
//            s = "Viszlát";
//        }
        return s;
    }
    
    
}
