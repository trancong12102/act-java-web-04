/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession2;
import java.util.Scanner;

/**
 *
 * @author luuthanhcong
 */
public class B1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập a : ");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Nhap b : ");
        int b = Integer.parseInt(s.nextLine());
        System.out.println("Nhap c : ");
        int c = Integer.parseInt(s.nextLine());
        
        float delta = b*b - 4*a*c;
        float x1 = (float)((-b + Math.sqrt(delta))/(2*a));
        float x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
        float x3 = (float)(-b /(2*a));
        if(delta > 0){
            System.out.println("Pt co 2 nghiem pb : " + x1 + x2);
        }else if(delta == 0){
            System.out.println("Pt co nghiem kep : " + x3);
        } else {
            System.out.println("Vo nghiem");
        }
        
    }
            
}
