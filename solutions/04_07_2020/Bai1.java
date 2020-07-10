
package javaapplication1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = input.nextInt();
        System.out.print("Nhap b: ");
        double b = input.nextInt();
        System.out.print("Nhap c: ");
        double c = input.nextInt();
        if(a==0) {
            if(b==0) {
                if(c==0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                }
                else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else {
                System.out.println("Phuong trinh co nghiem duy nhat la: " + (-c/b));
            }
        }
        else {
            double d = b*b - 4*a*c;
            if (d<0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if (d==0) {
                System.out.println("Phuong trinh co nghiem kep la: " + (-b/(2*a)));
            }
            else {
                System.out.println("Phuong trinh co 2 nghiem phan biet la:");
                System.out.println("x1 = " +((-b+ Math.sqrt(d))/(2*a)));
                System.out.println("x2 = " +((-b- Math.sqrt(d))/(2*a)));
            }
        }
    }
}
