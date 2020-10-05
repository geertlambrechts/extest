package be.abis.exC2.model;

import be.abis.exC2.exceptions.SalaryTooLowException;

public class AbisPaymentService implements PaymentService{

    @Override
    public void paySalary(Person person) throws SalaryTooLowException {
            System.out.println("Paying " + person.calculateNetSalary() + " to " + person.getFirstName());
    }
}
