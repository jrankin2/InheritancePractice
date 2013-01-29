/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 * @author Joe
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonusAmount;

    public SalaryPlusBonusEmployee(double bonusAmount, double salaryWage, double daysVacation, double daysSick, String firstName, String lastName, String id, String department) {
        super(salaryWage, daysVacation, daysSick, firstName, lastName, id, department);
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
    
    
}
