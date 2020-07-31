/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Dell
 */
public class Thongtin {
    private String hocvien;
    private int diem;
    private int vipham;
    private int solanthi;
    public Thongtin(){
        
    }
    public Thongtin(String hocvien, int diem, int vipham, int solanthi) {
        this.hocvien = hocvien;
        this.diem = diem;
        this.vipham = vipham;
        this.solanthi = solanthi;
    }

    public String getHocvien() {
        return hocvien;
    }

    public int getDiem() {
        return diem;
    }

    public int getVipham() {
        return vipham;
    }

    public int getSolanthi() {
        return solanthi;
    }

    public void setHocvien(String hocvien) {
        this.hocvien = hocvien;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public void setVipham(int vipham) {
        this.vipham = vipham;
    }

    public void setSolanthi(int solanthi) {
        this.solanthi = solanthi;
    }
    
}
