/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

/**
 *
 * @author bernicchi.davide
 */
public class GestoreGioco {
    Character player;
    Character npc;
    Dado d;
    
    void setGiocatore(Character g){
        player= g;
    }
    void setNpc(Character n){
        npc = n;
    }
    
    void gioco(){
        /*if(d.roll() > 3){
                
        }*/
        boolean fine=true;
        while(fine == true){
            player.rollFNP(npc.attacca());
            npc.rollFNP(player.attacca());
            fine = player.getStatus();
            fine = npc.getStatus();

        }
    }
}
