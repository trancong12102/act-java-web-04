
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
public class bai6b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, gcd = 1, lcm;

        System.out.println("nhap vao hai so");
        a = Integer.parseInt(input.nextLine().trim());
        b = Integer.parseInt(input.nextLine().trim());
        for (int i = 1; i <= a && i <= b; i++) 
        {
            if (a % i == 0 && b % i == 0) 
            {
                gcd = i;
            }

        }
        lcm = (a * b) / gcd;
        System.out.printf("Bội chung nhỏ nhất của %d và %d: %d", a, b, lcm);
    }
}
