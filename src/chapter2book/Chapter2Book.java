/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2book;

/**
 *
 * @author Willenak Family
 */
public class Chapter2Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        
        
        System.out.println("\nFido has gone outside");
        System.out.println("\nFido's all done...");
        
        try{
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e){}
        
        System.out.println("\nbut he's stuck outside!");
        System.out.println("\nFido starts barking!");
        System.out.println("\nso Gina grabs the remote control.");
        remote.pressButton();
       
        
        System.out.println("\nFido's back inside...");
      //  remote.pressButton();
    }
    
}
