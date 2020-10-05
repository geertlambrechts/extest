package be.abis.exC2.model;

import be.abis.exC2.exceptions.SalaryTooLowException;

public interface PaymentService {
    void paySalary(Person person) throws SalaryTooLowException;
}
