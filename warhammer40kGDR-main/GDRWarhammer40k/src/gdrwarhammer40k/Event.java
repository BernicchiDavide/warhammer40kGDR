/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class Event {
    TypeEvent tipoEvento;
    int grado=0;
    
    
    Event(TypeEvent tE, int grd){
        tipoEvento = tE;
        grado = grd;
    }
    
    TypeEvent getTypeEvento(){
        return tipoEvento;
    }
    

}
