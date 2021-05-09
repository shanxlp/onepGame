/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onepiecegame;

import java.awt.event.KeyEvent;
import jplay.Animation;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Mouse;
import jplay.Window;

/**
 *
 * @author Dirceu
 */
public class Fase {
    private int play = 1;
    private int fase;    
    private Animation fase1 = new Animation("image/menu/fases/1morgan.png");  
    private GameImage backgroundFase = new GameImage("image/menu/fases/fases.jpg");
    private Window screen;
    private Mouse mouse;
    private Keyboard key;
    
    
    public Fase(Window window ) {
        
       this.screen = window;
       this.mouse = screen.getMouse();
       key = screen.getKeyboard();
       key.addKey(KeyEvent.VK_Z);
       run();
    }
    private void startGame() {

 
    }
    
    
    
    public void run(){        
        fase1.x = 50;
        fase1.y = 100;        
        
        
        while (this.play!=0) {
            
    
            backgroundFase.loadImage("image/menu/fases/fases.jpg");
            backgroundFase.draw();
            fase1.draw();
            
            screen.update();
                  
            if(key.keyDown(Keyboard.ESCAPE_KEY)){
                break;
            }else if (mouse.isLeftButtonPressed() && mouse.isOverObject(fase1) ){
                this.play = 10;
                backgroundFase.loadImage("image/fases/fase4.png");
              
                Cenario scene = new Cenario(screen,this.play,backgroundFase);
                scene.getPlay();
            }
        }

    }

    public int getPlay() {
        return this.play;
    }
    
    
    
}
