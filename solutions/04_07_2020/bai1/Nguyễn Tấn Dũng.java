/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giai He Phuong Trinh Bac 2 ax^2+bx+c=0");
        System.out.println("Nhap he so a,b,c:");
        float a = input.nextFloat();
        float b= input.nextFloat();
        float c= input.nextFloat();
        float delta = b*b-4*a*c;
        for (int i=0;i<10;i++)
        {
        if(a==0)
        {
            System.out.println("Phuong trinh co nghiem x1 ="+(float)(-c/b));
            break;
        }
        if (a+b+c==0)
        {
            System.out.println("Phuong trinh co nghiem x1= 1");
            System.out.println("Phuong trinh co nghiem x2="+(float)(c/a));
            break;
        }
        if(a-b+c==0)
        {
            System.out.println("Phuong trinh co nghiem x1=-1");
            System.out.println("Phuong trinh co nghiem x2="+(float)(-c/a));
            break;
        }
        if(delta==0)
        {
            System.out.println("Phuong trinh co nghiem kep x1=x2="+(-b/2*a));
            break;
        }
        else if(delta>0)
        {
            System.out.println("He phuong trinh co 2 nghiem phan biet:");
            float x1=(float)((-b+Math.sqrt(delta))/2*a);
            float x2=(float)((-b-Math.sqrt(delta))/2*a);
            System.out.println("Nghiem x1="+x1);
            System.out.println("Nghiem x2="+x2);
            break;
        }
        else
        {
            System.out.println("Phuong trinh vo nghiem");
            break;
        }
        }
    }
