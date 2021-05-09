/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onepiecegame;

import java.util.Random;
import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;
import jplay.Collision;
/**
 *
 * @author Dirceu
 */
public class Enemy extends Sprite{
    private float velocidade = (float) 0.2;
    private int direcao = 0;
    private boolean movendo = false;
    private int life;
    private Sprite pow ;

    public Enemy(int x,int y,Sprite pow) {
        super("image/sprites/enemy/marine/sailor.png",17);
        this.x = x;
        this.y = y;
        this.pow = pow;
        this.life = 1000;
        

        
    }
    
    public void action (Window screen,Player luffy,Sprite blood){

      if(this.life> -11){
                         
        
             
            
            if (this.x > luffy.x + 80 ) {
                
                this.x -= velocidade;
                if (direcao != 1) {
                    
                    setTotalDuration(4500);
                    setSequence(1, 4);
                    direcao = 1;
                }
              update();
            }    
            
            
            else if (this.collided(luffy) && this.x > luffy.x + 2) {
                this.x -= velocidade-0.1;
                
              
                if (direcao != 3) {
                    
                    setTotalDuration(4500);
                    setSequence(15, 18);
                    direcao = 3;
                }
              update();           
        
           }else {
                setCurrFrame(0);
            }
            
            if (this.collided(pow)){
               
                this.life -= 1;
                blood.x = this.x;
                blood.y = this.y;
                blood.unhide();
                blood.setTotalDuration(300);
                blood.setSequence(0, 5);
                if (this.life <= 0) {
                    this.hide();

                }

            update();
        
        }
        }else {
              this.hide();
            }
    
        }
    public  Sprite getT(){
        return this;
    }
 }

