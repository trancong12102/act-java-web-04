/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author oOOo
 */
public class bai4 {  
    public static void  main(String[] args) {
        int i,max=10000;
        int a[]=new int [max];
        int maxd=a[0],mind=a[0];
        for(i=0;i<max;i++){
        System.out.println("nhap so:");
        a[i] = new Scanner(System.in).nextInt();
        if(a[i]==0) break;
        }
       
        for(i=0;i<max;i++){
            if(a[i]>maxd)
                maxd=a[i];
        }
        for(i=0;i<max;i++){
            if(a[i]<mind)
                mind=a[i];
        }
                
        System.out.println(maxd);
        System.out.println(mind);
}
}
