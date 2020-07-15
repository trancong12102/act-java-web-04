/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4b;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Bai4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int min=0;
        int n;
        do{
            System.out.println("nhap n");
                    n = sc.nextInt();
                    if(n<min){
                        min = n;
                    }
                        

        }while(n!=0);
        System.out.println("so lon nhat la "+min);
        
    }
    }
    
