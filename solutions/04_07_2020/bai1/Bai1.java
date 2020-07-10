/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    //Giải phương trình bậc 2

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập hệ số a: ");
        float a= sc.nextInt();
        System.out.println("Nhập hệ số b: ");
        float b=sc.nextInt();
        System.out.println("Nhập hệ số c: ");
        float c=sc.nextInt();
        if (a==0){
            if(b==0){
                System.out.println("Phương trình vô nghiệm");
            }else{
                System.out.println("Phương trình có nghiệm là: "+(-c)/b);
            }
        }
        double delta=b*b -4*a*c;
        double x1;
        double x2;
        if (delta>0){
            System.out.println("Phương trình có 2 nghiệm phân biệt là:");
            System.out.println("x1="+(double)((-b)+Math.sqrt(delta))/2*a);
            System.out.println("x2="+(double)((-b)-Math.sqrt(delta))/2*a);
        } else if(delta==0){
            System.out.println("Phương trình có nghiệm kép");
            System.out.println("x1=x2= " +(-b)/(2*a));
        } else{
            System.out.println("Phương trình vô nghiệm");
        }
        
            
    }
    
}
