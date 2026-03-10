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
    
    Armor(int ga){
        gradeArmor =ga;
        FNP = getDadiFNP(ga);
    }
    
    private int getDadiFNP(int grd){
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
    }
}
