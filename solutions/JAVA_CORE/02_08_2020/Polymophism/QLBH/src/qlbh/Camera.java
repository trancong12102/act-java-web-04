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
public class Camera extends Product{
    private boolean hasWifi;

    public Camera() {
    }

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    @Override
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Co wifi hay khong: ");
        hasWifi = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "Camera{" + "hasWifi=" + hasWifi + '}';
    }
    
    
}
