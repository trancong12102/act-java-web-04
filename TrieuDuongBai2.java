package trieuduong.bai2;
import java.util.Scanner;
/**
 *
 * @author Trieu
 */
public class TrieuDuongBai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----BAI 2-----");
                System.out.println("Xin moi nhap n :");
                int giaiThua = 1;
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                if(n<0){
                    System.out.println("So nhap vao khong dung");
                    System.out.println("Xin moi nhap lai");
                }
                if ( n==1 || n==0){
                    System.out.println("Giai thua cua "+n+" la "+giaiThua);
                }else{   
                for(int i = 1; i<=n ;i++)
                    giaiThua *= i;
                }
               System.out.printf("Giai thua cua %d! la %d\n",n, giaiThua);
    
}
