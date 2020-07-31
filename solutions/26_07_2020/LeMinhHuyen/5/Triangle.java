
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DaiPhongPC
 */
public class Triangle {

    public int a;
    public int b;
    public int c;

    // Hàm nhập vào ba cạnh của tam giác 
    public void nhapabc() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhap a,b,c:");
            a = Integer.parseInt(input.nextLine());
            b = Integer.parseInt(input.nextLine());
            c = Integer.parseInt(input.nextLine());
        } while (a + b < c || a + c < b || b + c < a);

    }

    public void xacdinhkieutamgiac() {
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("Day la tam giac vuong");
        } 
        else if ((a == b) && (b == c) && (c == a)) {
            System.out.println("Day la tam giac deu");
        } 
        else if (a == b || a == c || b == c) {
            System.out.println("Day la tam giac can");
        } 
        else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
            System.out.println("Day la tam giac tu");
        } 
        else {
            System.out.println("Day la tam giac nhon ");
        }
    }

    public int chuvi(){ 
        return a+b+c; 
    }
    public float dientich(){
        float p=(float)(a+b+c)/2; 
        float S; 
        S = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
        return S; 
    }
    
}
