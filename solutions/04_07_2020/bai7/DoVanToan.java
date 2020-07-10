package homework1;

import java.util.Scanner;

/**
 *
 * @author JinSu
 */
public class HomeWork1 {
  
   public static void main(String[] args) { 
       int f0, f1, f2, n;
        f0 = 1;
        f1 = 1;
         
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = sc.nextInt();
        }while(n <= 0);
         
        // print out the Fibonacci: 1 1 2 3 5 8 13 21...
        System.out.format("%d\t%d", f0, f1);
        f2 = f0 + f1;
        while(f2 <= n){
            System.out.format("\t%d", f2);
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
   
    }
}
