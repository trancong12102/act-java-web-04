/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Bai3 {
    public static void main(String[] args) { 
    HocVien hocVien= new HocVien();
        inputInfo(hocVien);
        if (hocVien.kt()) {
            System.out.println("Đạt học bổng");
        }
        else {
            System.out.println("Không đạt");
        }
    }
    public static void inputInfo(HocVien hv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Học viên có tham gia khóa học HDSE hay không");
        System.out.println("Nhập yes nếu có, no nếu không:");
        hv.setKhoaHoc(sc.nextLine());
        System.out.println("Nhập điểm tổng kết:");
        hv.setDiemTongKet(sc.nextDouble());
        System.out.println("Có vi phạm nội quy ko");
        System.out.println("Nhập yes nếu có nhập no nếu ko:");
        sc.nextLine();
        hv.setNoiQuy(sc.nextLine());
        System.out.println("Có bị thi lại không");
        System.out.println("Có nhập yes không nhập no:");
        hv.setThiLai(sc.nextLine());
    }
    
    
}
