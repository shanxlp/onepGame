/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onepiecegame;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Mouse;
import jplay.Sprite;
import jplay.Window;

/**
 *
 * @author Dirceu
 */
public class Cenario {
    private int play=10;
    private Window screen;
    private GameImage background;
    private GameImage nuvem;
    private GameImage status;
    private Sprite player;   
    private Mouse mouse;
    private Keyboard key;
    Player luffy;
    Enemy enemy;
     Sprite pow;
     Sprite blood;
 
    public Cenario(Window screen,int play,GameImage back) {
        this.nuvem = new GameImage("image/sprites/scene/cats.png");
        this.status = new GameImage("image/fases/statusbar.png");
        this.pow = new Sprite("image/sprites/luffy/power/pow1.png",17);
        this.blood = new Sprite ("image/sprites/blood.png",6);
        this.background = back;
        this.screen = screen;
        mouse = screen.getMouse();
        key = screen.getKeyboard();
        luffy = new Player(200,550);
        enemy = new Enemy(1200,565,this.pow);
        this.nuvem.x = 1;
        this.nuvem.y = -300;
        this.status.x = 30;
        this.status.y = 45;
        this.pow.x = 1;
        this.pow.y = 1;
        run();
    }


    private void run(){
        
        while(this.play == 10){
            background.draw();
            luffy.draw();
            enemy.draw();
            pow.draw();
            pow.hide();
            pow.x = luffy.x ;
            pow.y = luffy.y;
            luffy.mover(screen,this.pow);
            enemy.action(screen,luffy,this.blood);
            this.blood.draw();
            this.blood.hide();
            nuvem.draw();
            this.status.draw();
            
           
            this.nuvem.x = this.nuvem.x + 0.5;
            this.nuvem.y = this.nuvem.y + 2;
                
            if (this.nuvem.x > 10 && this.nuvem.y > 0) {
                this.nuvem.x = 1;
                this.nuvem.y = -100;
            }
            //pow.powerKey();
        
            screen.update();
            
            
            if(key.keyDown(Keyboard.ESCAPE_KEY)){
                this.play = 1;
            }
           
        }
    }

    public int getPlay() {
        return play;
    }
    
    
}
