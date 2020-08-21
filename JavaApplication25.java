/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author philipfynn
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int values[][] = new int[8][7];
        for (int[] value : values) {
            for (int j = 0; j < value.length; j++) {
                value[j] = ((int) (Math.random() * 5));
                System.out.print(value[j]);
            }
            
            System.out.println("");
        }
    System.out.println("Done");
}
}
    

