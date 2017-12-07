/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towersofhanoi;

/**
 *
 * @author seanzhang
 */
public class TowersOfHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hanoi(2,3,1,2);
    }
    
    public static void hanoi(int level, int to, int from, int placeholder) {
        if(level < 1) {
            System.out.println("Move " + from + " to " + to);
        } else {
            hanoi(level-1,from,to,placeholder);
            System.out.println("Move " + from + " to " + to);
            hanoi(level-1, placeholder, from, to);

        }
    }
    
}
