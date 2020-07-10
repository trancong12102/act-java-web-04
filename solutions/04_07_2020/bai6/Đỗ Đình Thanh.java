
package demo;
 import java.util.Scanner;

public class bai6 {
     public static void main(String[]  args)
     {
         Scanner nhap = new Scanner(System.in);
         System.out.println("Bai 6: tim UCLN, BCNN ");
         System.out.print("Nhap A: ");
         int a = nhap.nextInt();
         System.out.print("Nhap B: ");
         int b = nhap.nextInt();
         int m =a, n =b;
         while(true)
         { if( a==b)
          {
           System.out.println("UCLN : "+ a);
           System.out.println("BCNN : "+ m*n/a);
           break;
          }
          else if(a>b ) a= a-b;
          else b=b-a;
         }
         
     }
}
