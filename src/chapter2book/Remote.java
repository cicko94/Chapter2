/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2book;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Willenak Family
 */
public class Remote {
    
    private DogDoor door;
    
    public Remote(DogDoor door){
        this.door = door;
    }
    
    public void pressButton(){
        System.out.println("Pressing the remote control button...");
        if(door.isOpen()){
            door.close();
        }else{
            door.open();
            
            final Timer timer = new Timer();
            timer.schedule(new TimerTask(){
            public void run(){
                door.close();
                timer.cancel();
            }
            }, 5000);
        }
    }
}
