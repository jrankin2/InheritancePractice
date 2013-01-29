/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 * @author Joe
 */
public class SalariedEmployee extends Employee {
    private double salaryWage;
    private double daysVacation;
    private double daysSick;

    public SalariedEmployee(double salaryWage, double daysVacation, double daysSick, String firstName, String lastName, String id, String department) {
        super(firstName, lastName, id, department);
        this.salaryWage = salaryWage;
        this.daysVacation = daysVacation;
        this.daysSick = daysSick;
    }

    @Override
    public void pay() {
        System.out.println("SalariedEmployee paid: " + getSalaryWage());
    }
    
    public double getSalaryWage() {
        return salaryWage;
    }

    public void setSalaryWage(double salaryWage) {
        this.salaryWage = salaryWage;
    }

    public double getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(double daysVacation) {
        this.daysVacation = daysVacation;
    }

    public double getDaysSick() {
        return daysSick;
    }

    public void setDaysSick(double daysSick) {
        this.daysSick = daysSick;
    }
    
    
}
