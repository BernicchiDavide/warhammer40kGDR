/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class PlasmaSuperMelta extends Weapon{
    int ovHeatDmg=0;
    
    PlasmaSuperMelta(int g){
        super(g, "FireGun");
    }
    
    void reSetovHeatDmg(int x){
        ovHeatDmg=0;
    }
    
    @Override
    int SF() {
        boolean surriscaldamento=false;
        if(d.roll() > 1){
            ovHeatDmg++;
            return getDanno();
        }
        else{
            return -ovHeatDmg*5;
        }
    }

    
}
