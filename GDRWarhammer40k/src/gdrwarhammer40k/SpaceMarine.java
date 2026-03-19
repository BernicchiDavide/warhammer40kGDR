/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class SpaceMarine extends Character {
    Dado d = new Dado();
    boolean SF=true;
    SpaceMarine(Weapon a, Armor art, int v){
        super(a,art,v);
    }
    
    void weaponSF(){
        
    }
}
