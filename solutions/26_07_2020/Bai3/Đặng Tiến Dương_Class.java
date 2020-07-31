/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HocBong {
    private String HocHDSE;
    private double DiemTong;
    private String Noiquy;
    private String Kothilai;
public HocBong(){
}

    public HocBong(String HocHDSE, double DiemTong, String Noiquy, String Kothilai) {
        this.HocHDSE = HocHDSE;
        this.DiemTong = DiemTong;
        this.Noiquy = Noiquy;
        this.Kothilai = Kothilai;
    }

    public String getHocHDSE() {
        return HocHDSE;
    }

    public void setHocHDSE(String HocHDSE) {
        this.HocHDSE = HocHDSE;
    }

    public double getDiemTong() {
        return DiemTong;
    }

    public void setDiemTong(double DiemTong) {
        this.DiemTong = DiemTong;
    }

    public String getNoiquy() {
        return Noiquy;
    }

    public void setNoiquy(String Noiquy) {
        this.Noiquy = Noiquy;
    }

    public String getKothilai() {
        return Kothilai;
    }

    public void setKothilai(String Kothilai) {
        this.Kothilai = Kothilai;
    }
 public void inputInfo(){
     Scanner sc = new Scanner(System.in);
        System.out.println("Bạn có đăng kí khóa học HDSE không (yes/no)");
        HocHDSE=sc.nextLine();
   
        System.out.println("Điểm tổng kết của bạn bao nhiêu %");
        DiemTong=Integer.parseInt(sc.nextLine());
        
        System.out.println("Bạn có vi phạm nội quy của trung tâm không (yes/no)");
        Noiquy=sc.nextLine();
  
        System.out.println("Bạn có bị thi lại không (yes/no)");
        Kothilai=sc.nextLine();
 }
   
 
    public boolean kt() {
        if (this.HocHDSE.equals("yes")&& this.DiemTong>=75 && this.Noiquy.equals("no") &&this.Kothilai.equals("no")){
            return true;
        }
        else {
            return false;
        }
}
}