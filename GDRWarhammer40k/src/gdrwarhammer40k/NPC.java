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
    /*TypeNpc*/String nome;
    int gradoNemico;
    NPC(int gN, /*TypeNpc y*/String y, Weapon a, Armor at, int vit){
        super(a,at, vit);
        nome = y;
        gradoNemico = gN;
    }
    @Override
    public String toString(){
        return "type: " + nome + " grado: " + gradoNemico + " vita: " +vita;
    }
}
