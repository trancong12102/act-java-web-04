/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai6 {
    public static int ucln(int a, int b)
    {
        if(a==0||b==0)
        {
            return a+b;
        }
        while(a!=b)
        {
            if(a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap so nguyen a:");
        int a= input.nextInt();
        System.out.println("Nhap so nguyen b:");
        int b= input.nextInt();
        int c = ucln(a,b);
        int d=(a*b)/c;
        System.out.println("Uoc chung lon nhat cua hai so a,b:"+c);
        System.out.println("Boi chung nho nhat hai so a,b:"+d);
    }
    
}
