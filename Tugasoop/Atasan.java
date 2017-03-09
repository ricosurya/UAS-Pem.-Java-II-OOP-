/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Husni
 */
public class Atasan extends Employee{
    
    int bonus;
    
    public Atasan(String name, String address, int salary) {
        super(name, address, salary);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public int getSalary(){
        return bonus + salary;
    }
    
}