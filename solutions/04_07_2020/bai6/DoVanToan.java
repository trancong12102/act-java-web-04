package homework1;

import java.util.Scanner;

/**
 *
 * @author JinSu
 */
public class HomeWork1 {
  
   public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Nhap a: " ); 
    int a = scanner.nextInt();
    
    System.out.printf("Nhap b: " ); 
    int b = scanner.nextInt();
    
       while (a*b != 0) {           
           if (a >b) {
               a %= b;   
           } else {
               b %= a;
           }
       }
       System.out.println("UCLN la" + (a+b));
    }
}
