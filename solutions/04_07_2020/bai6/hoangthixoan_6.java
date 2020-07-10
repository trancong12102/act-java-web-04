/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.demo.java04;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class newjava6 {
     public static  int UCLN(int a,int b){
    
       while(a!=b) { 
             if (a>b){
                 a=a-b;
             }else {
                 b=b-a;
             }
         
     }  return(a); 
    }
     public static int main(String[] args) {
         Scanner UCLN = new Scanner(System.in);
         System.out.print("Nhap a >>");
         int a = UCLN.nextInt();
         System.out.print("Nhap b >>");
         int b = UCLN.nextInt();
        
      System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b)); 
      System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
        return 0;
  }
}

