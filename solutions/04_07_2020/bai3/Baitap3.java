/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap3 {
    public static boolean snt(int n){
        if(n<2)return false;
        int i;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 0;
        int dem = 1;
        while(dem<=n){
            if(snt(i)){
                System.out.println(i+" ");
               dem++;
            }
            i++;
        }
       
    }
    
}
