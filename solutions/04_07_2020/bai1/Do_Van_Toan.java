package homework1;

import java.util.Scanner;

/**
 *
 * @author JinSu
 */
public class HomeWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap a = ");
        int a = input.nextInt();
        
        System.out.println("Nhap b = ");
        int b = input.nextInt();
        
        System.out.println("Nhap c = ");
        int c = input.nextInt();
        
        if ( a == 0){
            if ( b == 0) {
                System.out.println("Phuong trinh vo nghiem!!!");
            } else {
                 System.out.println("Phuong trinh co mot nghiem :"  + "x = " + (-c/b));
            }
        }
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            if (delta > 0) { 
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
            } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}    
