/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Joe
 */
public interface Employee {
    String getFirstName();
    void setFirstName(String firstName);
    String getLastName();
    void setLastName(String lastName);
    int getId();
    void setId(int id);
    String getDepartment();
    void setDepartment(String department);
    
    void pay();
}
