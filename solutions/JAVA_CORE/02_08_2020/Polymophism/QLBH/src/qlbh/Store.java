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
public class Store {
    private Product[] products;
    private int index = 0;
    private static final int Max_index = 10;
    public Store() {
        this.products = new Product[Max_index];
    }
    
    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap san pham muon them (1.SmartPhone, 2.Camera): ");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon){
            case 1:                 
                products[index] = new SmartPhone();
                products[index].addNew();
                index++;
                break;
            case 2:
                products[index] = new Camera();               
                products[index].addNew();
                index++;
                break;
            default:
                System.out.println("Not valid");
                break;
        }
    }
    public void listProduct(){
        for (int i = 0; i < index; i++) {
            System.out.println(products[i].toString());
        }
    }
    
    public void search(String name){
        
    }
    
    public void SapXepTD(){
        Product[] p = new Product[1];
        for (int i = 0; i < index; i++) {
            for (int j = i+1; j < index; j++) {
                if(products[i].getPrice() > products[j].getPrice()){
                     p[0] = products[i];
                     products[i] = products[j];
                     products[j] = p[0];
                }
            }
        }
    }
    
    public void SapXepGD(){
        Product[] p = new Product[1];
        p[0] = products[0];
        for (int i = 0; i < index; i++) {
            for (int j = i+1; j < index; j++) {
                if(products[i].getPrice() < products[j].getPrice()){
                     p[0] = products[i];
                     products[i] = products[j];
                     products[j] = p[0];
                }
            }
        }
    }
}
