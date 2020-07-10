/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg6;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap 2 so a va b:");
        System.out.println("Nhap a : ");
        int a= sc.nextInt();
        System.out.println("Nhap b : ");
        int b=sc.nextInt();
        System.out.println("Tim boi chung nho nhat cua a va b:");
        int boiChung=0;
        int uocChung;
        System.out.println("Tim uoc chung lon nhat cua a va b:");
        if(a>=b){
            for(int i=a;i>0;i--)
            {
                if(a%i==0 && b%i==0)
                {
                    uocChung=i;
                    System.out.printf("Uoc chung lon nhat cua %d va %d la : UCLN(a,b)= %d\n",a,b,uocChung);
                    boiChung= a * b / uocChung;
                    break;
                }
            }
        }else{
            for(int i=b;i>0;i--)
            {
                if(a%i==0 && b%i==0)
                {
                    uocChung=i;
                    System.out.printf("Uoc chung lon nhat cua %d va %d la : UCLN(a,b)= %d\n",a,b,uocChung);
                    boiChung= a * b / uocChung;
                    break;
                }
            }
        }
        System.out.printf("Boi so chung lon nhat cua %d va %d la : BCNN(a,b) = %d\n",a,b,boiChung);
    }
    
}
