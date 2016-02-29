/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourown;

import java.util.Scanner;

/**
 *
 * @author rlloyd
 */
public class ChooseYourOwn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Question start = new Question("Start", "You are lying in the clearing of a forest");
        start.addOption("Keep lying down", "A bear comes and eats you!", "End");
        start.addOption("Get up!", "You get up slowly...", "Camp");
        
        Question camp = new Question("Camp", "You see your camp under the light of the moon");
        camp.addOption("Go back to sleep", "You lie back down again...", "Start");
        camp.addOption("Go for a walk", "You set off into the forest...", "Forest");
                
        Question next = start ;
        while(next != null) {
            // TODO code application logic here
            next = next.getNextQuestion() ;
        }
        System.out.println("Game Over :-(");
        
    }
    
}
