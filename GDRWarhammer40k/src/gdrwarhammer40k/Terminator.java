/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class Terminator extends Character{
    Terminator(Weapon a, Armor art){
        super(a,art,100);
        classe = "Terminator";
        atributoClasseFireGun = 3; 
        atributoClasseMelee = 0;
    }
}
