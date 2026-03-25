/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdrwarhammer40k;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author bernicchi.davide
 */
public class FileManager {
    Dado d = new Dado();
    String fileNe = "FileNemici.csv";
    String fileEv = "FileEventi.csv";
    
    
    Character getNpc(int lvl){
        try (BufferedReader br = new BufferedReader(new FileReader(fileNe))) {
            String linea;
            Random ran = new Random();

            int ciclo = ran.nextInt((lvl-1)*10, lvl*10);
            for(int i = 0; i< ciclo+1; i++){
                br.readLine();
            }
            linea = br.readLine();
            String[] stats = linea.split(",");

            int gradoNemico =  Integer.parseInt(stats[0]);
            TypeNpc tipoNpc = TypeNpc.valueOf(stats[1]);
            Weapon arma = new Weapon(Integer.valueOf(stats[2]), "Enemy Weapon");
            Armor armatura = new Armor( Integer.valueOf(stats[3]));
            int vita = Integer.parseInt(stats[4]);
            return new NPC(gradoNemico,TypeNpc.valueOf(stats[1]), arma, armatura, vita);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    void getEvento(int lvl){
        int rollEv = d.roll();
        
        if(rollEv > 3){
            System.out.print("nemico e apparso");
        }
        else{
            int RollWeapon=d.roll();
            if(RollWeapon == 1){
                System.out.print("Weapon Upgrade");
            }
            else{
                int RollItem=d.roll();
                if(RollItem > 3){
                System.out.print("Found item");
                }
                else{
                System.out.print("ricevuto danno");
                }
            }
        }
    }
}
