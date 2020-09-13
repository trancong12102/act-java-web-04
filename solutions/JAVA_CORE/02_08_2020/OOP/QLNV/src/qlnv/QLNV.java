/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv;

import com.sun.org.apache.xml.internal.utils.NSInfo;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLNV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap so luong nhan vien: ");
        Scanner sc = new Scanner(System.in);
        int SL = Integer.parseInt(sc.nextLine());
        NhanVien[] nv = new NhanVien[SL];
        for (int i = 0; i < SL; i++) {
            System.out.println("Nhap nhan vien thu: " +(i+1));
            nv[i] = new NhanVien();
            nv[i].inputInfo();
        }
        System.out.println("Ten\tTuoi\tDia chi\tTong luong\tSo GL");
        for (int i = 0; i < SL; i++) {
            nv[i].printInfo();
        }
        for (int i = 0; i < SL; i++) {
            System.out.println("So tien thuong NV: "+nv[i].getName());
            System.out.println(""+nv[i].tinhThuong());

        }
    }
    
}
