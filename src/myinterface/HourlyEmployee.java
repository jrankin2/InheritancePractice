/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Joe
 */
public class HourlyEmployee implements Employee {
    private String firstName;
    private String lastName;
    private int id;
    private String department;
    private double hoursWorked;
    private double payRate;
    
    public HourlyEmployee(String firstName, String lastName, int id, String department, double hoursWorked, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    
    @Override
    public void pay(){
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
    
    
    //ideally these wouldn't throw exceptions - ideally...
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
