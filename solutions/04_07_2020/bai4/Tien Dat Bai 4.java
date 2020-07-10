/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int [] n = new int [10000000];
        int i = 0;
        
        for(i = 0; i < 10000000; i++){
            System.out.print("Nhap n: ");
            n[i] = input.nextInt();
            if (n[i] == 0){
                break;
            }
        }
                
        int max = n[0];
        for(int x = 1; x <= i; x++){
            if (n[x] > max){
                max = n[x];
            }
        }
        System.out.println("So lon nhat trong cac so vua nhap la " + max);
        
        int min = n[0];        
        for(int x = 1; x <= i; x++){
            if (n[x] < min){
                max = n[x];
            }
        }
        System.out.println("So nho nhat trong cac so vua nhap la " + min);    
    }
    
}
