/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap6a;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap6a {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       int b = sc.nextInt();
       int UCLN = 0;
       int tich;
       tich=a*b;
       for(int i = 1;i<=a && i <=b;i++){
           UCLN = i;
       }
        System.out.println("uoc chung lon nhat "+UCLN);
        System.out.println("boi chung nho nhat "+(tich/UCLN));
       
       
        
        
    }
    
}
