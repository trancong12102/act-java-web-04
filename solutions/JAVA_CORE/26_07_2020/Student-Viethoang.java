/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.math.BigDecimal;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author vieth
 */
public class Student {
    private String id;
    private int tuoi;
    private String lop;
    private double diemTB;

    public Student() {
    }

    
    public Student(String id, int tuoi, String lop, double diemTB) {
        this.id = id;
        this.tuoi = tuoi;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getId() {
        return id;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }

    public double getDiemTB() {
        return diemTB;
    }
    public boolean kt() {
        if (this.diemTB>=8) {
            return true;
        }
        else {
            return false;
        }
    }
}
