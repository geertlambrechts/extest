package be.abis.exC2.ut;

import be.abis.exC2.exceptions.SalaryTooLowException;
import be.abis.exC2.model.AbisPaymentService;
import be.abis.exC2.model.PaymentService;
import be.abis.exC2.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestPaymentService {
    @Mock
    Person person;

    @Test(expected= SalaryTooLowException.class)
    public void testSalaryTooLowException_in_method_paySalary() throws SalaryTooLowException {
           when(person.calculateNetSalary())
                .thenThrow(SalaryTooLowException.class);;
        //act
        PaymentService paymentService = new AbisPaymentService();
        paymentService.paySalary(person);
    }
}
