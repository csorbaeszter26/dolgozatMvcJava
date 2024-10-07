
package nezet;

import javax.swing.JOptionPane;

public class FelugroNezet {
    
    public String bekeres(){
        
        String v = JOptionPane.showInputDialog("Szeretnéd átfesteni? (igen/nem)\n");
        return String.valueOf(v);
    }
    public void megjelenit(String uzenet){
        JOptionPane.showMessageDialog(null,uzenet);
    }
}
