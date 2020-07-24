package demo;
import java.util.Scanner;
public class Demo {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bai 1 : mang + tong_ptu + tong_le +tong_chan");
        System.out. println("Nhap mang 5 phan tu: ");
        int[]  a = new   int[5];
        int tong = 0;
        int tong_chan = 0;
        int tong_le = 0;
        for(int i=0;i < a.length; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i]= input.nextInt();
            tong += a[i];
            if(a[i]%2==0){
                tong_chan += a[i];
             }
            else{
                tong_le += a[i];
             }
        }
        System.out.println("Mang vua nhap:");
        for(int i=0;i < a.length; i++)
        {
            System.out.printf("a[%d] = %d\t",i,a[i]); 
        }
        
         System.out.println(" +Tong phan tu trong mang = "+ tong);
         System.out.println(" +Tong phan tu chan trong mang = "+ tong_chan);
         System.out.println(" +Tong phan tu le trong mang = "+ tong_le);
         }
   }
    

