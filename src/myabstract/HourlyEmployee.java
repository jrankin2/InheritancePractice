/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 * @author Joe
 */
public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double payRate;

    public HourlyEmployee(double hoursWorked, double payRate, String firstName, String lastName, String id, String department) {
        super(firstName, lastName, id, department);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    
    @Override
    public void pay() {
        System.out.println("HourlyEmployee paid: " + (getHoursWorked() * getPayRate()));
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
}
