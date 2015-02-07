/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Samantha
 */
public class kittyMath {
    private int speed=50;
    public String colour="Yellow";
    
    public kittyMath(int speed,String colour){
        this.speed=speed;
        this.colour=colour;
    }
    
    public kittyMath(String col){
        colour=col;
    }
    
    public int sqaureNumber(int num){
        return num*num;
    }
    
    public void movePacman(String direction){
       System.out.println("Moving "+ direction);
       System.out.println("My colour is "+colour);
    }
}
