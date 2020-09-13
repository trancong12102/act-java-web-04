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
       int min = n;
       while ( n!= 0) {  
           if ( min > n)
           {
               min = n;
           }
       }
       System.out.println("So be nhat la " + min);   
    }
}
