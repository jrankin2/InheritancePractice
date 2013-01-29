/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 * @author Joe
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee implements Employee  {
    private double bonusAmount;

    public SalaryPlusBonusEmployee(double bonusAmount, String firstName, String lastName, int id, String department, double salaryRate, double daysSick, double daysVacation) {
        super(firstName, lastName, id, department, salaryRate, daysSick, daysVacation);
        this.bonusAmount = bonusAmount;
    }
    
    @Override
    public void pay() {
        super.pay();
        System.out.println("SalaryPlusBonusEmployee paid a bonus: " + getBonusAmount());
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
    
    //ideally these would be implemented... ideally
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
