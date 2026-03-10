/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bernicchi.davide
 */
public class Weapon {
    int grado;
    String tipoArma;
    ArrayList<Dado> dadi = new ArrayList<Dado>();
    ArrayList<Integer> rollDadi = new ArrayList<Integer>();
    
    
    Weapon(int g, String tA){
        grado = g;
        tipoArma= tA;
        fillDadiFeritaList(getDadiFerita(g));
    }
    
    private int getDadiFerita(int grade){
        Random ran = new Random();
        
        switch(grade){
            case 1:
                return 2 ;
            case 2:
                return 4;
            case 3:
                return ran.nextInt(5,6);
            default:
                return 0;    
        }
    }
    
    private void fillDadiFeritaList(int n){
        for (int i = 0; i<n; i++){
            dadi.add(new Dado());
        }
    }
    
    
    String getTipoArma(){
        return tipoArma;
    }
    
    int getDanno(){
        int i=0;
        int tot=0;
        for(Dado d: dadi){
            rollDadi.add(d.roll());
            tot+= rollDadi.get(i);
            i++;
        }
        return tot;
    }
    
  @Override
    public String toString() {
        return tipoArma +" " + dadi.size() +"D6";
    }
}
