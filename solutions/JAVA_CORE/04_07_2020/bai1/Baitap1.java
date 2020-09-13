package baitap1;
import java.util.Scanner;
public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        //System.out.println(a);
        float b = sc.nextFloat();
        //System.out.println(b);
        float c = sc.nextFloat();
        if(a==0){
            System.out.println("nhap lai a");
        }
        else{
            float denta = b*b-4*a*c;
            if(denta<0){
                System.out.println("phuong trinh vo nghiem");}
            else if(denta==0){
                System.out.println("phuong trinh co  nghiem kep"+(-b/2*a));
            }
            else{
                System.out.printf("\nphuong trinh co nghiem x1 = %f",(-b+Math.sqrt(denta))/2*a);
                System.out.printf("\nphuong trinh co nghiem x2 = %f",(-b-Math.sqrt(denta))/2*a);
            }
                
        }
        
        
    }
    
}
