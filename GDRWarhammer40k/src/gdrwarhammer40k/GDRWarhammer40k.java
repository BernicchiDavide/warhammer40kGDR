/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gdrwarhammer40k;



/**
 *
 * @author bernicchi.davide
 */
public class GDRWarhammer40k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character t = new Terminator(new Weapon(3, "FireGun"), new Armor());
        System.out.print(t.outPut());
        System.out.print("\n" + t.attacca());
        

        
       
    }
    
}
