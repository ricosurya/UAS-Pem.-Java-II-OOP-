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
abstract class Shape {
    public String Apa;
    public double Itu;

    public Shape(){

    }
    abstract public String getName();
    abstract public double getArea();
}
