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
public class mang1chieu1 {
    public static void main(String[] args) {
        int tong=0,tongle=0,tongchan=0;
        int a[]=new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap phan tu:");
            a[i]=new Scanner(System.in).nextInt();          
        }
        for (int i = 0; i < a.length; i++) {
            tong+=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==1)
                tongle+=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                tongchan+=a[i];
            }
        }
        System.out.println("tong cac phan tu="+tong);
        System.out.println("tong cac so le?="+tongle);
        System.out.println("tong cac so chan?="+tongchan);
    }
}
