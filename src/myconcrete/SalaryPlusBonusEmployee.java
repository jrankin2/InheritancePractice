/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Joe
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonusAmount;

    public SalaryPlusBonusEmployee(double bonusAmount, double salaryWage, double daysVacation, double daysSick, String lastName, String firstName, int id, String department) {
        super(salaryWage, daysVacation, daysSick, lastName, firstName, id, department);
        this.bonusAmount = bonusAmount;
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
}
