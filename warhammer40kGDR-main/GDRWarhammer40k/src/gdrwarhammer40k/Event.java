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
    String message;
    TypeEvent tipoEvento;
    int grado=0;
    
    
    Event(String msg, TypeEvent tE, int grd){
        message = msg;
        tipoEvento = tE;
        grado = grd;
    }
    
    TypeEvent getTypeEvento(){
        return tipoEvento;
    }
}
