package be.abis.ExC1.ut;

import be.abis.exC1.model.Address;
import be.abis.exC1.model.Company;
import be.abis.exC1.model.Person;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestCompany {

    @Mock
    Company company;

    @Test
    public void taxToPayBelgiumCompanyTest() {
        //arrange
        Address address = new Address("Wetstraat", "5", "1000", "Brussels", "Belgium", "BE");
        Company company = new Company("BNP",address);
        double expected = 51;

        //act
        double result = company.calculateTaxToPay();

        // assert
        assertEquals (expected, result,0.01d);
    }
    @Test
    public void calculateNetSalaryOfBelgianPersonUsingMockCompany() {
        //arrange
     //   Address address = new Address("Wetstraat", "5", "1000", "Brussels", "Belgium", "BE");
     //   Company company = new Company("BNP",address);
        Person p2 = new Person(2,"John","Doe", LocalDate.of(1967, 8, 10), company, 3000);

        when(company.calculateTaxToPay())
                .thenReturn(51.0);
        //act
        p2.calculateNetSalary();

        // assert
        verify(company).calculateTaxToPay();
    }
}
