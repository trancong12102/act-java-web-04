
package demo;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bai 8: Tinh Sin(x)");
        System.out.print("Nhap X (do): ");
        int xDo = input.nextInt();
        float Pi = (float)3.1415926 ;
        float S =0 ;
        float x =(float) xDo*Pi/180;
        for(int i=0;i<=10;i++)           // chon N == 10
        {   
            int   a=   (int)    Math.pow(-1,i);
            float b= (float)    Math.pow(x,2*i+1);
            int c=1;
            for(int j=1;j<=(2*i+1);j++ )
            {
                c*=j;
            }
            S+= (float) a*b/c;
        }
         System.out.printf("Sin(%d)=  Sin(Pi/%.0f)=  %f\n",xDo,(float)180/xDo,S);
    }
}
