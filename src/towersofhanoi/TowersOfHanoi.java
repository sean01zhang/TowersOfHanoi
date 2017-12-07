/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towersofhanoi;

import java.util.Scanner;

/**
 *
 * @author seanzhang
 */
public class TowersOfHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = Math.abs(input.nextInt());
        
        hanoi(x,3,1,2);
    }
    
    
    public static void hanoi(int level, int to, int from, int placeholder) {
        //base case: if the tower only has one disc, move it from its current position to the position in interest.
        if(level <= 1) {
            //prompt user
            System.out.println("Move " + from + " to " + to);
        } else {
            //move the disks above the lowest disk to the temporary placeholder stack
            hanoi((level-1),placeholder,from,to);
            System.out.println("Move " + from + " to " + to);
            //move the disks from the temporary placeholder stack to the end stack
            hanoi(level-1, to, placeholder, from);

        }
    }
    
}
