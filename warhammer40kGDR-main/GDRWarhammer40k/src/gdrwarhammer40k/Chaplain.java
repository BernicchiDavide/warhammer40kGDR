/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class Chaplain extends SpaceMarine{
    Chaplain(Weapon a, Armor art){
        super(a, art, 40);
       classe = "Chaplain";
        atributoClasseFireGun = 0; 
        atributoClasseMelee = 0;
    }
    
    @Override
    int attivaSF(){
        System.out.print("\nChaplain richiede aiuto divino:\n");
        int successo= d.roll();
        if (successo > 3){
            System.out.print("-Chaplain +D6 tutte le abilita");
            atributoClasse+=d.roll();
        }
        else{
            System.out.print("-Chaplain ha fallito");
            this.riceviDanni(10);
        }
        return 0;
    }
}
