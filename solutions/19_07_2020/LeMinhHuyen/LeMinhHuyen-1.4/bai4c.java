
import java.util.Random;
import java.util.Scanner;


public class bai4c {
    public static void main(String[] args) {
         // Nhập số phần tử của mảng
        System.out.println("Nhập số phần tử của mảng: ");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine().trim());

        // Random các thành phần trong mảng 
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt();
        }
        // In ra mảng 
        for (int i = 0; i < n; i++) 
        {
            System.out.print("  " + arr[i]);
        }
        // Đếm xem trong mảng có bao nhiêu số lẻ
        int countodd=0; 
        int counteven=0;
        for (int i = 0; i< n;i++) 
        {
            if (arr[i]%2 ==0)
            {
                counteven++; 
            }
            else
            {
                countodd++; 
            }
        }
        //In ra so so le va so so chan 
        System.out.println(""); 
        System.out.println("Số số lẻ là " + countodd);
        System.out.println("Số số chẵn là " + counteven);
    }
   
}
