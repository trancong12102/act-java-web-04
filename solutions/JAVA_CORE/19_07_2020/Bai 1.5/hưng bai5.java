/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;
import java.util.Scanner;


public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a1,a2,a3,b1,b2,b3;
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap vao cac he so:");
        a1=nhap.nextInt();
        a2=nhap.nextInt();
        a3=nhap.nextInt();
        b1=nhap.nextInt();
        b2=nhap.nextInt();
        b3=nhap.nextInt();
        System.out.printf("(a=(%d,%d,%d)",a1,a2,a3);
        System.out.printf("b=(%d,%d,%d)",b1,b2,b3);
       System.out.printf("Tong cua hai vecto la:(%d,%d,%d)",a1+b1,a2+b2,a3+b3);
       System.out.printf("Tich vo huong cua 2 vecto la:%d",a1*b1+a2*b2+a3*b3);
    }
    
}


