/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln_bcnn;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class UCLN_BCNN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,x,y;
        System.out.println("Nhap a,b:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();b=sc.nextInt();
        x=UCLN(a,b);
        System.out.println("Uoc chung lon nhat la:"+x);
        System.out.println("Boi chung nho nhat la:"+((a/x)*b));
    }
    public static int UCLN(int a,int b)
    {
        int r=1;
        while (r!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        return a  ;
    }
    
}
