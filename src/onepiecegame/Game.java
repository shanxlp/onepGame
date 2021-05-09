///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package onepiecegame;
//
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//import jplay.Animation;
//import jplay.GameImage;
//import jplay.GameObject;
//import jplay.Keyboard;
//import jplay.Mouse;
//import jplay.Sprite;
//import jplay.Window;
//
///*
// *
// * @author Dirceu
// */
//public class Game {
//    
//    protected String background;
//    GameImage bg ;
//    Fase phase = new Fase(screen);
//    int play = 1; 
//    protected Sprite player;
//    protected Window screen = new Window(1366,768);
//    Keyboard keyboard = screen.getKeyboard();
//
//    
//    GameImage menu = new GameImage("image/fundo/menu.jpg");      
//    Animation nGame = new Animation("image/menu/newgame.png");
//    Animation lGame = new Animation("image/menu/loadgame.png"); 
//    Animation eGame = new Animation("image/menu/exit.png");     
//    
//    Mouse mouse = screen.getMouse();
//
//    public Game(){
////        mouse.setBehavior(Mouse.BUTTON_LEFT, Mouse.DETECT_INITIAL_PRESS_ONLY);
////        mouse.setBehavior(Mouse.BUTTON_MIDDLE, Mouse.DETECT_INITIAL_PRESS_ONLY);
////        mouse.setBehavior(Mouse.BUTTON_RIGHT, Mouse.DETECT_INITIAL_PRESS_ONLY);
//       
//        
//       
//    }
//   public void menuGame(){
//       startMenu();
//     
//       screen.update();
//       draw();
//
//     if(this.play == 2 ){         
//           
//           System.out.println(play);
//           closeMenu();
//           this.menu = new GameImage("image/fundo/fases.jpg");           
//           phase.selectFase(screen,mouse);
//           screen.update();
//           this.play = phase.getNumb();
//           
//      }else if (this.play == 3 ){
//          System.out.println("salkdjalksjdsad");
//          
//      }else if (this.play == 10) {
//          this.screen.exit();
//          phase.startGame();
//          
//      }
//      
//    screen.update();
//   }
//   
//   
//   public int getMenu(){
//       return this.play;
//   }
//
//    
//    public void startMenu() {      
//
//        
//        if (mouse.isLeftButtonPressed() && mouse.isOverObject(nGame) ){
//            this.play = 2;
//        }else if (mouse.isLeftButtonPressed() && mouse.isOverObject(eGame) || keyboard.keyDown(Keyboard.ESCAPE_KEY)){
//            this.play = 3;
//        }
//    }    
//   public void draw(){
//        nGame.y = 250;      
//        lGame.y = 330; 
//        lGame.x = 25;
//        eGame.y = 400;
//        eGame.x = 20;
//        menu.draw();
//        nGame.draw();
//        lGame.draw();
//        eGame.draw();
//        screen.update();
//   }
//   public void closeMenu(){
//       this.nGame.stop();
//       this.nGame.hide();
//       this.lGame.stop();
//       this.lGame.hide();
//       this.eGame.stop();
//       this.eGame.hide();
//       screen.update();
//      
//   }
//    
// 
//
//    
//}
