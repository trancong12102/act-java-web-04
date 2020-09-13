/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = input.nextInt();       
        System.out.print("Nhap b: ");
        int b = input.nextInt();
        System.out.print("Nhap c: ");
        int c = input.nextInt();
        System.out.println("---- Giai phuong tỉnh bac 2 ---- ");
        if (a == 0) {
        System.out.println(" Gia tri a nhap vao khong hop le ! ");
        } 
        else {
            double delta = (double)(b*b - 4*a*c);
            if (delta >0){
                System.out.println(" Phuong trinh co 2 nghiem phan biet ! ");
                double x1 = (- (double)b + Math.sqrt(delta))/(double)(2*a);
                double x2 = (- (double)b - Math.sqrt(delta))/(double)(2*a);
                System.out.println(" Nghiem cua phuong trinh la ");
                System.out.printf(" x1 = %g ", x1);
                System.out.printf(" x2 = %g ", x2);
            } else if (delta == 0) {
                System.out.println(" Phuong trinh co nghiem kep ! ");
                double x =( -(double)b/((double)(2*a)));
                System.out.println(" Nghiem cua phuong trinh la ");
                System.out.printf(" x = %g " ,x);
            } else {
                System.out.println(" Phuong trinh vo nghiem ! ");
            }
        }
    }
    
}
