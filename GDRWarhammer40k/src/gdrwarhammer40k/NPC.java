/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class NPC extends Character{
    TypeNpc nome;
    NPC(Weapon a, Armor at, TypeNpc y){
        super(a,at);
        nome = y;
    }
}
