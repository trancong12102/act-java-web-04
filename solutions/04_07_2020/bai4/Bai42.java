/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.pkg2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=0;
        int a;
        int b;
        a = sc.nextInt();
        while(a!=0){
            a = sc.nextInt();
            b=a;
            
              if(b<min)
            {
                min=b; 
            }   
            
            
        }
        System.out.println("so nho nhat la "+min);
    }
    
}
