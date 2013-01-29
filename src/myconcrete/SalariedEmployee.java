/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Joe
 */
public class SalariedEmployee extends Employee{
    private double salaryWage;
    private double daysVacation;
    private double daysSick;

    public SalariedEmployee(double salaryWage, double daysVacation, double daysSick, String lastName, String firstName, int id, String department) {
        super(lastName, firstName, id, department);
        this.salaryWage = salaryWage;
        this.daysVacation = daysVacation;
        this.daysSick = daysSick;
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
