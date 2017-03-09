/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Husni
 */
public class Square extends Shape {
    public int sisi;
    public Square(String n){
        Apa=n;
    }
    public String getName(){
        return Apa;
    }
    public void setArea(int s){
        sisi=s;
        Itu=sisi*sisi;
    }
    public double getArea(){
        return Itu;
    }

    public static void main(String []args){
        Square x = new Square("Square one");
        x.setArea(7);
        System.out.println("Nama : "+x.getName());
        System.out.println("Luas : "+x.getArea());
    }
}
