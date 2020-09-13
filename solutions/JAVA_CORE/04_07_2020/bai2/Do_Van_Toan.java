package homework1;

import java.util.Scanner;

/**
 *
 * @author JinSu
 */
public class HomeWork1 {
  
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Nhap vao so nguyen duong n =");
       int n = input.nextInt();
       
       int giaithua =1;
       for (int i = 1; i <= n; i++) {
           giaithua = giaithua*i;    
       }
       System.out.printf("Gia tri %d giai thua la %d :",n,giaithua);
   }
}
