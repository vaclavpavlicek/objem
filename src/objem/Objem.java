/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objem;

/**
 *
 * @author Venda
 */
public class Objem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double zeme = 12800;
        double slunce = 1462000;
        
        zeme = (4.0 / 3) * Math.PI * Math.pow(zeme /2, 3);
        slunce = (4.0 / 3) * Math.PI * Math.pow(slunce /2, 3);
 
        System.out.println("Objem Země " + zeme);
        System.out.println("Objem Slunce " + slunce);
        
    }
    
}