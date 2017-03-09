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
public class Circle extends Shape {
    public int jarijari;
    public Circle(String n){
        Apa=n;
    }
    public String getName(){
        return Apa;
    }
    public void setArea(int y){
        jarijari=y;
        Itu=(3.14*jarijari*jarijari);
    }
    public double getArea(){
        return Itu;
    }

    public static void main(String []args){
        Circle z = new Circle("Circle one");
        z.setArea(10);
        System.out.println("Nama : "+z.getName());
        System.out.println("Luas : "+z.getArea());
    }
}
