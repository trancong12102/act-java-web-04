package bai5;
import java.util.Scanner;
/**
 *
 * @author Trieu
 */
public class mainBai5 {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Triangle tr = new Triangle();
        tr.input();
        tr.kiemTra();
        tr.tinhChuViDienTich();

    }
}
