/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg3;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n can kiem tra:");
        int n = sc.nextInt();
        boolean ketQua=true;
        if(n<=1)
           System.out.printf("%d khong phai la so nguyen to :\n",n);
        else
        {
            for(int i=2;i<=n;i++)
            {
                if(n%i==0 && i != 1 && i!=n)
                {
                    ketQua=false;
                    break;
                }
            }
            if(!ketQua)
                System.out.printf("So %d khong phai la so nguyen to.\n",n);
            else
                System.out.printf("So %d la so nguyen to.\n",n);
        }
        System.out.print("Nhap so m :");
        int m = sc.nextInt();
        ketQua=true;
        int i=2;
        int k=0;
        System.out.printf("%d  so nguyen to dau tien la : \n ",m );
        while(k!=m)
        {
             ketQua=true;
             for(int j=2;j<i;j++)
             {
                 if(i%j==0)
                 {
                     ketQua=false;
                     break;
                 }
             }
             if(ketQua){
                 System.out.printf(" %d ", i);
                 k++;
             }
             i++;
        }

    }
    
    
}
