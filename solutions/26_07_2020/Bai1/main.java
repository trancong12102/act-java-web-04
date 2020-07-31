/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhan.vien;

/**
 *
 * @author Administrator
 */
public class main {
    static public void main (String[] args){
       NhanVien nv = new NhanVien();
       nv.inputInfo();
       nv.tinhluong();
       nv.printInfo();
        System.out.println("-------------------------------------");
        System.out.println("ten nhan vien:=>"+nv.getName());
    }
}
