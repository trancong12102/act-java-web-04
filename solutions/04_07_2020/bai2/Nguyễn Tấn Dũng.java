/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Moi ban nhap so nguyen duong n :");
        int n = input.nextInt();
        int sum=1;
        do{
            if(n<0)
            {
                System.out.println("Moi ban nhap lai so nguyen n (n>0):");
                int a=input.nextInt();
                n=a;
            }
            else
            {
                break;
            }
        }while(n<0);
      for(int i=2;i<=n;i++)
      {
          sum*=i;
      }
        System.out.println("Tong giai thua cua so nguyen duong la:"+sum);
    }
    
}
