package demo;
import java.util.Scanner;
public class bai2 {
    
    public static void main(String[] args){
         Scanner nhap = new Scanner(System.in);
         System.out.println("Bai 2: mang + max + min + phan tu chia het cho 3");
         System.out. println("Nhap mang 5 phan tu: ");
        int[]  a = new   int[5];
        int max, min;
        for(int i=0;i < a.length; i++){
            System.out.printf("a[%d] = ",i);
            a[i]= nhap.nextInt();
        }
        max= a[0];
        min= a[0];
        System.out.println("Phan tu chia het cho 3: ");
        for (int i=0 ;  i<a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]%3==0){
                System.out.printf("a[%d] = %d",i,a[i]);
            }    
        }
        System.out.println("\nPhan tu lon nhat : "+ max);
        System.out.println("Phan tu nho nhat : "+ min);
    }
}