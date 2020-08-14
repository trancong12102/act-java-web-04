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
public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap name: ");
        name = sc.nextLine();
        System.out.println("Nhap price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap quantity: ");
        quantity = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
}
