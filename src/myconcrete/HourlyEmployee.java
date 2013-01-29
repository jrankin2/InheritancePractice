/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Joe
 */
public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double payRate;

    public HourlyEmployee(double hoursWorked, double payRate, String lastName, String firstName, int id, String department) {
        super(lastName, firstName, id, department);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
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
