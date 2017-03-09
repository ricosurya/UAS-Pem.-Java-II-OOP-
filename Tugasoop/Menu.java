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
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Atasan boss = new Atasan("nama boss : Hayckal", "Cimahi", 1000000);
        boss.setBonus(800000);
        
        Employee[] Em = new Employee[3];
        Em[0] = boss;
        Em[1] = new Karyawan("nama staff 1 : Yadi", "Bandung", 400000);
        Em[2] = new Karyawan("nama staff 2 : Sanan", "Cimareme", 600000);
        
        for (int i = 0; i < Em.length; i++) {
            System.out.println(Em[i].getName() + "\t\t"+Em[i].getSalary());
        }
    }
    
}