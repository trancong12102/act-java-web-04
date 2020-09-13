/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
public class DogClass {
    private String Ten;    
    private String MauLong;
    private int Tuoi;

    public DogClass() {
    }

    public DogClass(String Ten, String MauLong, int Tuoi) {
        this.Ten = Ten;
        this.MauLong = MauLong;
        this.Tuoi = Tuoi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMauLong() {
        return MauLong;
    }

    public void setMauLong(String MauLong) {
        this.MauLong = MauLong;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    
    
    
}
