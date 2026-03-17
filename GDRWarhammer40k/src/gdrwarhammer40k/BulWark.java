/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class BulWark extends Character{
    BulWark(Weapon a, Armor art){
        super(a, art, 95);
        classe = "BulWark";
        atributoClasseFireGun = -5; 
        atributoClasseMelee = 3;
    }
}
