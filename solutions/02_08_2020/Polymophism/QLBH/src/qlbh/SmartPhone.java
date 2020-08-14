/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    
    @Override
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap camera (true of false): ");
        hasCamera = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhap sim: ");
        sim = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "SmartPhone{" + "hasCamera=" + hasCamera + ", sim=" + sim + '}';
    }
    
}
