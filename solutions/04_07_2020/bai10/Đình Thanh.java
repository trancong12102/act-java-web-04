package demo;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args)
    {
        System.out.println("Bai 10: kiem tra so doi xung");
        Scanner input= new Scanner(System.in);
         System.out.print("Nhap So: ");
         int a = input.nextInt();
         int aDao = 0, aTrc = a;
         while(a>0)
         {   
             aDao= aDao*10 +a%10;
             a/=10;
         }
         if(aTrc==aDao)
             System.out.println(aTrc +" la So doi xung");
         else
             System.out.println(aTrc + " khong la So doi xung");
    }
}
