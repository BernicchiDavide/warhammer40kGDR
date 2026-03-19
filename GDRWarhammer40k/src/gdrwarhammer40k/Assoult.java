/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class Assoult extends SpaceMarine{
    Assoult(Weapon a, Armor art){
        super(a,art,75);
        classe = "Assoult";
        atributoClasseFireGun = 5; 
        atributoClasseMelee = -2;
    }
}
