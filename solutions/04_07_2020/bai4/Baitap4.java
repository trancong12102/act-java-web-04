/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int n;
        do{
            System.out.println("nhap n");
                    n = sc.nextInt();
                    if(n>max){
                        max = n;
                    }
                        

        }while(n!=0);
        System.out.println("so lon nhat la "+max);
        
    }
    
}
