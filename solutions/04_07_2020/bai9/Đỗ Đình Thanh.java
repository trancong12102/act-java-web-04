package demo;
import java.util.Scanner;
public class bai9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bai 9: Tinh COS(x)");
        System.out.print("Nhap X (do): ");
        int xDo = input.nextInt();        
        float S =0 ;
        float x =(float)(xDo*Math.PI/180);
        for(int i=0;i<=10;i++)           // chon N == 10
        {   
            int   a=   (int)    Math.pow(-1,i);
            float b= (float)    Math.pow(x,2*i);
            int c=1;
            for(int j=1;j<=(2*i);j++ )
            {
                c*=j;
            }
            S+= (float) a*b/c;
        }
         System.out.printf("Cos(%d)=  Cos(Pi/%.0f)=  %f\n",xDo,(float)180/xDo,S);
    }
}
