/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gdrwarhammer40k;

import java.util.Random;



/**
 *
 * @author bernicchi.davide
 */
public class GDRWarhammer40k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Character t = new Terminator(new Weapon(3, "FireGun"), new Armor(3));
        System.out.print(t.outPut());
        System.out.print("\n" + t.attacca());*/
        
        FileManager fm = new FileManager();
        System.out.print(fm.getNpc(1));
        System.out.print(fm.getNpc(1));
        System.out.print(fm.getNpc(1));
        System.out.print(fm.getNpc(2));
        System.out.print(fm.getNpc(2));
        System.out.print(fm.getNpc(2));
        System.out.print(fm.getNpc(3));
        System.out.print(fm.getNpc(3));
        System.out.print(fm.getNpc(3));
        
        

    }
    
}
