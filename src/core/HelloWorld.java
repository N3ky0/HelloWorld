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
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name="bunny, bunny, bunny, bunny, bunny, bunny, bunny!";
        int num=7;
        for (int i=0; i<7;i++){
            
            System.out.println("Yes bunnies!, bunnies!, bunnies!, bunnies!, bunnies!, "+name);
        }
        
        kittyMath usagi=new kittyMath("red");
        kittyMath bunny=new kittyMath(60,"white");
        
        usagi.movePacman("Up");
        bunny.movePacman("Left");
        
        System.out.println("Usagi says " + usagi.sqaureNumber(10));
        System.out.println("but bunny says " + bunny.sqaureNumber(25));
        
    } 

    
}
