package demo;
import java.util.Scanner;

public class bai4{ 
    
   public static void main(String[] args){
        Scanner nhap =new Scanner(System.in);
        System.out.println("Bai 4: nhap so nguyen -> 0, in ra max min");
        System.out.print("Nhap N: ");
         int n= nhap.nextInt();
         int  max= n,min =n;
         while(n!=0)
         {
             System.out.print("Nhap tiep N: ");
              n= nhap.nextInt();
             if(max <n)
                 max=n;
             if(min > n&& n!=0)
                 min =n ;
         }
         System.out.println("\nMax = "+ max);
         System.out.println("Min = "+ min);
   }  
}

