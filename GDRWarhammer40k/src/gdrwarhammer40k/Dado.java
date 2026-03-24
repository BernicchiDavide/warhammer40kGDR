/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

import java.util.Random;

/**
 *
 * @author bernicchi.davide
 */
public class Dado {
    int roll(){
        Random ran = new Random();
        int output=ran.nextInt(1,6);
        System.out.print("\nD6-"+output+"\n");
        return output ;
    }
}
