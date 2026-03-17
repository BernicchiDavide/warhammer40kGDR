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
    int atributoClasseFireGun;
    int atributoClasseMelee;
    int atributoClasse;
    
    Character(Weapon arm, Armor armt, int vit){
        vita = vit;
        addArma(arm);
        addArmatura(armt);
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
        
    }
    
    String outPut(){
        return "la classe: " + classe + " ha un: " + arma + "+" +  atributoClasse;
    }
    
    String attacca(){
        return "Danni: " + (arma.getDanno() +atributoClasse);
    }
}
