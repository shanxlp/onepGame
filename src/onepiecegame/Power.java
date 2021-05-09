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
public class Power extends Player{

    private Sprite gomuCatling;
    private Sprite gomu3gun;
    private Window screen;
    private Keyboard key;
    Sprite player;
    
    private static Sprite pow;

    public Power(int x, int y,Window screen,Sprite player) {
        super(x, y);
        this.key = screen.getKeyboard();        
        this.player = player;
        this.pow = new Sprite("image/sprites/luffy/power/pow1.png",17);
        key.setBehavior(Keyboard.SPACE_KEY, Keyboard.DETECT_INITIAL_PRESS_ONLY);
    
       
    }
    
    public static void power1(Sprite player){

            //player.hide();
            pow.unhide();
            pow.setInitialFrame(0);
            pow.setFinalFrame(17);
            pow.setTotalDuration(3000);
            pow.update();

    }
    
}
