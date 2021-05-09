/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onepiecegame;

import java.awt.event.KeyEvent;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;

import jplay.*;

/**
 *
 * @author Coffee
 */
public class Main {


    public static void main (String[]  args) {
        
      
        
        
      int play = 50;
      Window screen = new Window(1366,768);        
      GameImage backgroundMenu = new GameImage("image/menu/menu.jpg");      
      Keyboard keyboard = screen.getKeyboard();
      keyboard.setBehavior(Keyboard.ENTER_KEY, Keyboard.DETECT_EVERY_PRESS);
      Mouse mouse = screen.getMouse();
      mouse.setBehavior(Mouse.BUTTON_LEFT, Mouse.DETECT_EVERY_PRESS);
      keyboard.addKey(KeyEvent.VK_Z);
        Animation newGame = new Animation("image/menu/newgame.png");
        Animation loadGame = new Animation ("image/menu/loadgame.png");
        Animation exit = new Animation ("image/menu/exit.png");
        newGame.y = 250;      
        loadGame.y = 330; 
        loadGame.x = 25;
        exit.y = 400;
        exit.x = 20;    





      
    while(play!=0 ){   
       
        backgroundMenu.draw();        
        newGame.draw();
        loadGame.draw();
        exit.draw();           
        screen.update();        
        
        //ativa o click nas opções do menu 
        if (mouse.isLeftButtonPressed() && mouse.isOverObject(newGame)){
            play = 1;           
        }else if (mouse.isLeftButtonPressed() && mouse.isOverObject(loadGame)){
            play = 2;
        }else if ((mouse.isLeftButtonPressed() && mouse.isOverObject(exit)) || keyboard.keyDown(Keyboard.ESCAPE_KEY) ){
            play = 0;
        }
     
        
        
        
        if (play == 1 ){
           
            Fase fase = new Fase(screen);
            play = fase.getPlay();
           
        }     
        
        

    }
    screen.exit();

       
    }
    


    

    
}
