/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class BoltGun extends Weapon{
    BoltGun(int g){
        super(g, "FireGun");
    }
    
    @Override
    int SF(){
        return getDanno()+getDanno()+getDanno();
    }
}
