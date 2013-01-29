/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author Joe
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String id;
    private String department;

    public Employee(String firstName, String lastName, String id, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
    }
    
    public abstract void pay();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
}
