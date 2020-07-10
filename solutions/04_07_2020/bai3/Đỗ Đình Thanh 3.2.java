package demo;
import java.util.Scanner;
public class bai3b {
     
    public static void main(String[] args){
        Scanner nhap =new Scanner(System.in);
        System.out.println("Bai 3: in ra so nguyen to < n");
        System.out.print("Nhap N: ");
        int n = nhap.nextInt();
        for(int  a=2;a<=n;a++)
        {
            if (a<4){
                System.out.printf("%d\t",a);
                continue;
            }
            for( int i=2 ;i<Math.sqrt(a);i++ )
            {
                if (a%i==0)
                  break;
                if (i== (int)Math.sqrt(a))
                     System.out.printf("%d\t",a);
            } 
           
            
        }
        
        
    }
}
