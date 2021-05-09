/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onepiecegame;

import java.awt.event.KeyEvent;
import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;

/**
 *
 * @author Dirceu
 */
public class Player extends Sprite {
    private float velocidade = (float) 0.5;
    protected int direcao = 0;
    private boolean movendo = false;
    private Keyboard key;
 
    Window screen;

    public Player(int x,int y) {
        super("image/sprites/luffy/run.png",18);
  
        this.x = x;
        this.y = y;
        
        
    }
    
    public void mover(Window screen,Sprite pow) {
        this.screen = screen;

       
       
        if (movendo == false ){
            key = screen.getKeyboard();
   
        }
        
        if (key.keyDown(Keyboard.LEFT_KEY)){
            
            if (this.x >0 ) {
                
                this.x -= velocidade;
                if (direcao != 1) {
                    setTotalDuration(2000);
                    setSequence(9, 16);
                    direcao = 1;
                }
              
            }
            movendo = true;
            
            
        }else if (key.keyDown(Keyboard.RIGHT_KEY)){
            if(this.x < screen.getWidth() - 60) {
                this.x += velocidade;
                if (direcao != 2) {
                    setTotalDuration(2000);
                    setSequence(1, 8);
                    direcao = 2;
                }
           
            }
            movendo = true;
        }else if (key.keyDown(Keyboard.DOWN_KEY)){
            this.hide();
            pow.x = this.x;
            pow.y = this.y;
            pow.unhide();
            pow.setInitialFrame(0);
            pow.setFinalFrame(16);
            pow.setTotalDuration(2000);
            pow.update();
            
           
        }else{
            pow.x = 1;
            pow.y = 1;
            //this.loadImage("image/sprites/luffy/run.png",18);
            setCurrFrame(0);
            this.unhide();
            
        }   
        if (movendo) {
            update();
           
            movendo = false;
        }
      

    }
    
}
