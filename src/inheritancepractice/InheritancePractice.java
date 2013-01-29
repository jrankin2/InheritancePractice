package inheritancepractice;

import myconcrete.*;
import myabstract.*;
import myinterface.*;


/**
 *
 * @author Joe
 */
public class InheritancePractice {
    public static void main(String[] args) {
        //concrete demonstration
        System.out.println("CONCRETE");
        myconcrete.HourlyEmployee first = new myconcrete.HourlyEmployee(30, 10.00, "Rankin", "Joe", 1, "Retail");
        myconcrete.SalariedEmployee second = new myconcrete.SalariedEmployee(3000, 2, 4, "Smith", "George", 1, "Retail");
        myconcrete.SalaryPlusBonusEmployee third = new myconcrete.SalaryPlusBonusEmployee(1000, 3000, 3, 7, "Smith", "George", 1, "Retail");
        
        first.pay();
        second.pay();
        third.pay();
        
        
        //abstract demonstration (interface the same in this instance)
        System.out.println("\nABSTRACT/INTERFACE");
        myabstract.Employee employees[] = {
            new myabstract.HourlyEmployee(30.0, 10.00, "Rankin", "Joe", 1, "Retail"),
            new myabstract.SalariedEmployee(3000, 2, 4, "Smith", "George", 1, "Retail"),
            new myabstract.SalaryPlusBonusEmployee(1000, 3000, 3, 7, "Smith", "George", 1, "Retail")
        };
        
        for(myabstract.Employee e: employees){
            e.pay();
        }
        
        
    }
}
