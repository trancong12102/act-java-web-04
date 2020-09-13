/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author vieth
 */
public class HocVien {
    private String khoaHoc;
    private double diemTongKet;
    private String noiQuy;
    private String thiLai;

    public HocVien() {
    }

    public HocVien(String khoaHoc, double diemTongKet, String noiQuy, String thiLai) {
        this.khoaHoc = khoaHoc;
        this.diemTongKet = diemTongKet;
        this.noiQuy = noiQuy;
        this.thiLai = thiLai;
    }
    

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    public void setNoiQuy(String noiQuy) {
        this.noiQuy = noiQuy;
    }

    public void setThiLai(String thiLai) {
        this.thiLai = thiLai;
    }
    
    public boolean kt() {
        if (this.khoaHoc.equals("yes")&&this.noiQuy.equals("no")&&this.diemTongKet>=0.75&&this.thiLai.equals("no")){
            return true;
        }
        else {
            return false;
        }
    }
}
