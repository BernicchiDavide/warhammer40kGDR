/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class BulWark extends SpaceMarine{
    int charge=1;
    
    BulWark(Weapon a, Armor art){
        super(a, art, 95);
        classe = "BulWark";
        atributoClasseFireGun = -5; 
        atributoClasseMelee = 3;
    }
        void reSetCharge(){
        charge=1;
    }
    
    void addCharge(){
        charge+=3;
    }
    
    @Override
    int attacca(){
        int output=0;
        for (int i =0; i< charge; i++){
            output += arma.getDanno() + atributoClasse;
        }
        return output;
    }
    @Override
    int attivaSF(){       
        addCharge();
        System.out.print("\nBulWark ha caricato il martello: + " + charge + "D6");
        return 0;
    }
}
