
package demo;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bai 7: day fibonaci < n");
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int a= 1, b=1;
         while(a<=n)
         {
             System.out.printf("\t%d",a);
             a=b;
             b=a+b;
         }
         System.out.println("\n");
    }
}
