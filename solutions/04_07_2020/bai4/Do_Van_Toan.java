package homework1;

import java.util.Scanner;

/**
 *
 * @author JinSu
 */
public class HomeWork1 {
  
   public static void main(String[] args) { 
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap so: ");
       int n = input.nextInt();
       int max = n;
       while ( n!= 0) {  
           if ( n > max) {
               max = n;  
           }
       }
       System.out.println("So lon nhat la " + max);   
    }
}
