/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bernicchi.davide
 */
public class Armor {
    int gradeArmor;
    int FNP;
    Dado d = new Dado();
    
    
    Armor(int ga){
        gradeArmor =ga;
        FNP = 6-(ga-1);//getDadiFNP(ga);
    }
    
    boolean rollFNP(){

        if(d.roll() >= FNP){
                    System.out.print("--feel no pain");
            System.out.print(" << successo");
            return true;
        }            
                System.out.print("--feel no pain");
        System.out.print(" << fallimento");
        return false;
    }
    
    /*private int getDadiFNP(int grd){
        switch(grd){
            case 1:
                return 6;                
            case 2:
                return 5;                
            case 3:
                return 4;                
            default:
                return 0;
        }
    }*/
}
