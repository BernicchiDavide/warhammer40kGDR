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
    FileManager fm;
    
    
    void setGiocatore(Character g){
        player= g;
    }
    void setNpc(Character n){
        npc = n;
    }
    
    void getEvent(Event ev){
        switch(ev.getTypeEvento()){
            case TypeEvent.EnemyEncounter:
                spawnEnemy();
            case TypeEvent.FoundItem:
                GiveItem();
            case TypeEvent.WeaponUpgrade:
                upGradeWeapon();
        }
    }
    
    void spawnEnemy(){
        setNpc(fm.getNpc(1));
    }
    void GiveItem(){
        //player.addItem(Item i);
    }
    void upGradeWeapon(){
        player.upGradeWeapon();
    }
    void NpcEncounter(){
        /*if(d.roll() > 3){
                
        }*/
        int rndCounter=0;
        boolean fine=true;
        while(fine == true){
            rndCounter++;
            System.out.print("\n<<Round " + rndCounter + ">>");
            System.out.print("\n-- attacca: " +player + ">>");
            System.out.print("\n<<Round " + rndCounter + ">>");
            
            
            
            fine = player.getStatus();
            fine = npc.getStatus();

        }
    }
}
