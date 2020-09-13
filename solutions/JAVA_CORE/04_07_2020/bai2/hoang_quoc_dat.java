/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg2;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n :");
        int n=sc.nextInt();
        if(n<0)
            System.out.printf   ("So %d khong phai so nguyen duong\n.",n);
        else
        {
            int Tich=1;
            for(int i=1;i<=n;i++)
            {
                Tich*=i;
            }
            System.out.println("n! = " + Tich);
        }
    }
    
}
