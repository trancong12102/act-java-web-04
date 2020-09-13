/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aptech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong hoc vien: ");
        int n = Integer.parseInt(sc.nextLine());
        XetHocBong[] xhb = new XetHocBong[n];
        for (int i = 0; i < n; i++) {
            xhb[i] = new XetHocBong();
            xhb[i].Nhap();
            xhb[i].xetHB();
        }
    }
    
}
