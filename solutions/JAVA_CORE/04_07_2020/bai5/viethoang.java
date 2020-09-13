/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class BT5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextInt();
        b52(n);
        b51(n);
        b53(n);
        b54(n);
        b55(n);
        b56(n);
        b57(n);
        b58(n);
    }

    public static void b52(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        System.out.println("Kq b52:" + s);
    }

    public static void b51(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (double) 1 / n;
        }
        System.out.printf("Kq b51:%08.3f\n", s);
    }

    public static void b53(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i*i;
        }
        System.out.printf("Kq b53:\n", s);
    }

    public static void b54(int n) 
    {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (double) 1 / (2 * n );
        }
        System.out.printf("Kq b54:%08.3f\n", s);
    }

    public static void b55(int n) 
    {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (double) 1 / (2*(n + 1));
        }
        System.out.printf("Kq b55:%08.3f\n", s);
    }
    public static void b56(int n) {
         double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (double) 1 / (n*(n + 1));
        }
        System.out.printf("Kq b56:%08.3f\n", s);
    }
    public static void b57(int n) {
        double s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + (double)(2*n+1)/(2*n + 2);
           
        }
        System.out.printf("Kq b57:%08.3f\n", s); 
    }
    public static void b58(int n) {
       int p=1,t=1;
       for(int i=2;i<=n;i++)
       {
           t=t*i;
           p=p+i;
       }
        System.out.println("Kq b58:"+p);
       
       
    }
    public static void b59(int x,int n) {
        int p=0,t=1;
        for(int i=1;i<=n;i++)
        {
            t=t*t;
            p=p+t;
        }
        System.out.println("Kq b59:"+p);
    }
   

}
