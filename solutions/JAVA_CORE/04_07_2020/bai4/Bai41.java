/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        int a;
        int b;
        do{
            a = sc.nextInt();
            b=a;
            if(b>max)
            {
                max=b; 
            } 
        }while(a!=0);
        System.out.println("so lon nhat la "+max);
    }
    
}
