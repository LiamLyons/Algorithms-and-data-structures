/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 40326973
 */
public class EulerProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for (int i=0;i<1000;i++) {
            
            if (i%3==0 || i%5==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
