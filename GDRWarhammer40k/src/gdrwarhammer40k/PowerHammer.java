/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class PowerHammer extends Weapon{
    int charge=0;
    boolean ready = false;
        
    PowerHammer(int g){
        super(g, "Melee");

    }
        
    void reSetCharge(){
        charge=0;
    }
    
    void addCharge(){
        charge+=3;
    }
    
    @Override
    int SF(){
        addCharge();
        return 0;
    }
    
    int powerHit(){
        int output=0;
        ready = false;
        for(int i =0; i<charge; i++){
            output += getDanno();
        }
        return output;
    }
}
