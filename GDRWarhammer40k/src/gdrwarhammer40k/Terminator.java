/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class Terminator extends SpaceMarine{
    
    
    Terminator(Weapon a, Armor art){
        super(a,art,100);
        classe = "Terminator";
        atributoClasseFireGun = 3; 
        atributoClasseMelee = 0;
    }
    
    void attivaSF(){
        boolean surriscaldamento=false;
        int dmg =0;
        if(d.roll() > 1){
            attacca();
            dmg++;
        }
        else{
            riceviDanni(dmg*5);
        }
        
        /*if(SF == true){
            while(surriscaldamento == false){
                if(d.roll() > 1){
                    attacca();
                    dmg++;
                }
                else{
                    riceviDanni(dmg*5);
                }
            }
        }*/
    }
}
