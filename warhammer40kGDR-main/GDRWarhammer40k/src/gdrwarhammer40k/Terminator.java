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
    int dmg =0;
    
    Terminator(Weapon a, Armor art){
        super(a,art,100);
        classe = "Terminator";
        atributoClasseFireGun = 3; 
        atributoClasseMelee = 0;
    }
    @Override
    int attivaSF(){
        System.out.print("\nTerminator carica il Plasma Supa Melta");
        int output =0;
        if(d.roll() > 1){
            System.out.print("\nTerminator ha colpito");
            dmg++;
            output += attacca();
        }
        else{
            System.out.print("\nPlasma Supa Melta si e surriscaldato: Terminator riceve " + dmg*5 + " Danni mortali");
            riceviDanni(dmg*5);
            dmg =0;
        }
        return output;
    }
}
