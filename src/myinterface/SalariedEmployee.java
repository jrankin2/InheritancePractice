/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Joe
 */
public class SalariedEmployee implements Employee{
    private String firstName;
    private String lastName;
    private int id;
    private String department;
    private double salaryRate;
    private double daysSick;
    private double daysVacation;

    public SalariedEmployee(String firstName, String lastName, int id, String department, double salaryRate, double daysSick, double daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.salaryRate = salaryRate;
        this.daysSick = daysSick;
        this.daysVacation = daysVacation;
    }
    
    @Override
    public void pay(){
        System.out.println("Salaried Employee paid: " + getSalaryRate());
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }
    
    //http://qkme.me/3srqfh
    @Override
    public String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFirstName(String firstName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getLastName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLastName(String lastName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDepartment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setDepartment(String department) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
