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
        FileManager fm = new FileManager();

        GestoreGioco gg = new GestoreGioco();
        
        
        Schermata s = new Schermata();
        s.setGG(gg);
        s.setVisible(true);
        s.setExtendedState(s.MAXIMIZED_BOTH);
        
        //fm.getEvento(0);
        /*b.attivaSF();
        System.out.print(b.attacca());
        
        /*System.out.print(t.outPut());
        System.out.print("\n" + t.attacca());*/
        
        /*
        System.out.print(fm.getNpc(1));
        System.out.print(fm.getNpc(1));
        System.out.print(fm.getNpc(1));
        System.out.print(fm.getNpc(2));
        System.out.print(fm.getNpc(2));
        System.out.print(fm.getNpc(2));
        System.out.print(fm.getNpc(3));
        System.out.print(fm.getNpc(3));
        System.out.print(fm.getNpc(3));*/
        
      /*  GestoreGioco gg = new GestoreGioco();
        gg.setNpc(fm.getNpc(1));
        gg.setGiocatore(t);

        gg.NpcEncounter();*/
                
        /*System.out.print(t.getWeaponDEF());
        System.out.print(c.getWeaponDEF());
        System.out.print(a.getWeaponDEF());
        System.out.print(b.getWeaponDEF());*/
        

    }
    
}
