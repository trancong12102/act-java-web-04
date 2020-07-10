/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg5;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        int n= sc.nextInt();
        float Tong=0;
        float x=1;
        System.out.printf("Tong cua S= 1 / 1  + ... + 1/n voi n = %d S = ",n);
        for(int i=1;i<=n;i++)
        {
            x= 1 / (float)i;
            Tong+=x;
        }
        System.out.printf(" %g\n",Tong);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n = sc.nextInt();
        System.out.printf("Tong cua S= 1 + 2 + .... +n voi n = %d  ",n);
        Tong=0;
        for(int i=0;i<=n;i++)
        {
            Tong+=(float)i;
        }
        System.out.printf(" S = %g\n",Tong);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n= sc.nextInt();
        System.out.printf("Tong cua S= 1^2 + 2^2 + .... +n^2 voi n = %d  ",n);
        double y=1;
        double Tong1=0;
        for(int i=0;i<=n;i++)
        {
            y = Math.pow((double)i, (double)2);
            Tong1+=y;
        }
        System.out.printf("S = %g\n",Tong1);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n= sc.nextInt();
        System.out.printf("Tong cua S= 1/2 + 1/4 + ... + 1/2n voi n = %d  ",n);
        Tong=0;
        for(int i=1;i<=n;i++)
        {
            x=1/(float)(i * 2 );
            Tong+=x;
        }
        System.out.printf(" S = %g\n",Tong);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n= sc.nextInt();
        System.out.printf("Tong cua S= 1/1 + 1/3 + ... + 1/(2n+1) voi n = %d  ",n);
        Tong=0;
        for(int i=0;i<=n;i++)
        {
            x= 1 / (float)(2*i + 1);
            Tong+=x;
        }
        System.out.printf(" S = %g\n",Tong);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n= sc.nextInt();
        System.out.printf("Tong cua S= 1/(1*2) + 1/(2*3) + ... + 1/(n*(n+1)) voi n = %d  ",n);
        Tong1=0;
        for(int i=1;i<=n;i++)
        {
            y= 1 / (float)(i*(i+1));
            Tong1+=(double)y;
        }
        System.out.printf(" S = %g\n",Tong);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n= sc.nextInt();
        System.out.printf("Tong cua S= 1 + 1.2 + ... + 1.2...n voi n = %d  ",n);
        long z=1;
        long tongLuyThua=0;
        for(int i=1;i<=n;i++)
        {
            z *= i;
            tongLuyThua+=z;
        }
        System.out.printf(" S = %d\n",tongLuyThua);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n= sc.nextInt();
        System.out.println("Nhap bien x vao tu ban phim: ");
        int x1=sc.nextInt();
        System.out.printf("Tong cua S= x + x^2 + ... + x^n voi n = %d va x = %d  ", n , x1);
        double soMu=1;
        Tong1=0;
        for(int i = 1 ;i <= n;i++)
        {
            soMu=Math.pow((double)x1,(double)i);
            Tong1+=soMu;
        }
        System.out.printf("S = %g\n", Tong1);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n = sc.nextInt();
        System.out.println("Nhap bien x vao tu ban phim: ");
        x1=sc.nextInt();
        System.out.printf("Tong cua S= x^2 + x^4 + ... + x^2n voi n = %d va x = %d  ", n , x1);
        Tong1=0;
        for(int i=1;i<=n;i++)
        {
            soMu = Math.pow((double)x1, (double)(2*i));
            Tong1+=soMu;
        }
        System.out.printf("S = %g\n", Tong1);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n= sc.nextInt();
        System.out.println("Nhap bien x vao tu ban phim: ");
        x1=sc.nextInt();
        System.out.printf("Tong cua S= x + x^3 + x^5 + ... + x^(2n+1) voi n = %d va x = %d  ", n , x1);
        Tong1=0;
        for(int i=0;i<=n;i++)
        {
            soMu = Math.pow((double)x1, (double)(2*i + 1));
            Tong1+=soMu;
        }
        System.out.printf("S = %g\n", Tong1);
        System.out.println("Nhap so n nguyen duong vao tu ban phim: ");
        n= sc.nextInt();
        System.out.printf("Tong cua S= 1 + 1/(1+2) + ... + 1 /(1+2+...+n) voi n = %d ", n );
        Tong1=0;
        x=0;
        for(int i=1;i<=n;i++)
        {
            x += (float)i;
            Tong1+= 1 / x;
        }
        System.out.printf("S = %g\n", Tong1);
    }
    
}
