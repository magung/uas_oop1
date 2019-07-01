/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoteknusantara;

/**
 *
 * @author PLJC-PC
 */
public class ApotekNusantara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        MenuUtama m= new MenuUtama();
        m.setExtendedState(MenuUtama.MAXIMIZED_BOTH);
        m.setVisible(true);
        m.setTitle("Apotek Nusantara");
        
    }
    
}
