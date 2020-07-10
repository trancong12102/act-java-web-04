/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author oOOo
 */
public class bai3 {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int i=2;
        int dem=0;
        while(dem<n){
        if(snt(i)){
            System.out.println(i+" ");
            dem++;        
        }
        i++;
        }
    }
    public static boolean snt(int n){
     
        if(n<2) return false;
        for(int i=2;i<=sqrt(n);i++){
            if(n%i==0) return false;
            
        }    
        return true;
    }
}
