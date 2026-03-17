/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class Chaplain extends Character{
    Chaplain(Weapon a, Armor art){
        super(a, art, 40);
       classe = "Chaplain";
        atributoClasseFireGun = 0; 
        atributoClasseMelee = 0;
    }
}
