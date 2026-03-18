/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class Character {
    String classe;
    Weapon arma;
    Armor armatura;
    int vita;
    boolean status=true;
    int atributoClasseFireGun;
    int atributoClasseMelee;
    int atributoClasse;
    
    Character(Weapon arm, Armor armt, int vit){
        vita = vit;
        addArma(arm);
        addArmatura(armt);
    }
    
    boolean getStatus(){
        return status;
    }
    
    void addArma(Weapon w){
        arma = w;
        if (w.getTipoArma() == "Melee"){
        atributoClasse = atributoClasseMelee;
        }
        else {
        atributoClasse = atributoClasseFireGun;
        }
    }
    void addArmatura(Armor a){
        armatura=a;
    }
    
    void rollFNP(int d){
        int output=0;
        for(int i =0; i<d; i++){
            if (!armatura.rollFNP()){
                output += 1;
            }
        }
        riceviDanni(output);
    }
    
    void riceviDanni(int d){
        vita -= d;
        if(vita <= 0){
            status = false;
        }
        System.out.print("\nclasse: " + classe + " ha ricevuto: " + d + "danni; ha" + vita + "hp");
    }
    
    int attacca(){
        return arma.getDanno() + atributoClasse;
    }
}
