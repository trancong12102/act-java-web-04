/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg4;
import java.util.Scanner;
/**
 *
 * @author HL94NVT
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        int i=0;
        int max;
        System.out.println("Nhap cac so de xac dinh so lon nhat trong do:");

          Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so: ");
            n= sc.nextInt();
            max=n;
        while (n!=0) {
            System.out.print("Nhap so: ");
            n= sc.nextInt();
            if(n>=max)
                max=n;
        }
        System.out.println("So lon nhat ma ban vua nhap la:" + max);
        n=0;
        System.out.println("Nhap cac so de xac dinh so nho nhat trong do:");
        int min;
        System.out.print("Nhap so: ");
        n= sc.nextInt();
            min=n;
        while (n!=0) {
            System.out.print("Nhap so: ");
            n= sc.nextInt();
            if(n<=min)
                min=n;
        }
        System.out.println("So nho nhat ma ban vua nhap la:" + min);

    }
    
}
