/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap10;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap10 {

   public static void main(String[] args) {
        int sosau = 0;
        System.out.println("nhap so:");
        int n=new Scanner(System.in).nextInt();
        int sobandau=n;
        while(n>0){
            int sd=n%10;
            sosau=10*sosau+sd;
            n/=10;
       }
       if(sosau==sobandau)
            System.out.println("la so da nguoc");
       else System.out.println("khong phai so dao nguoc");
}
}
    

