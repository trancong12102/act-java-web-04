package demo;
import java.util.Scanner;
public class bai2 {
    
    public static void main(String[] args){
         Scanner nhap = new Scanner(System.in);
         System.out.print("Bai 2: tinh Giai thua ");
         System.out.print("Nhap N: ");
          int n = nhap. nextInt();
          int giaiThua = n>1?n:1;
          while (n>1)
          { 
              n--;
              giaiThua*=n; 
          }
           System.out.println("N! = "+ giaiThua);
    }
}
