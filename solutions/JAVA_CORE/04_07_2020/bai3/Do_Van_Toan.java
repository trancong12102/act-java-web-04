package test;
import java.util.Scanner;

/**
 *
 * @author JinSu
 */
public class test {
    public static void main(String args[])
    {
        int n;
        boolean flag = true;
        int snt =3;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap n: " );
        n = scanner.nextInt();
        if (n >= 1)
        {
            System.out.println(n+" Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=n ; )
        {
            for ( int j = 2 ; j <= Math.sqrt(snt) ; j++ )
            {
                if ( snt%j == 0 )
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                System.out.println(snt);
                i++;
            }
            flag = true;
            snt++;
        }
    }  
}
