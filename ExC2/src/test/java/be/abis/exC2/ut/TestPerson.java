package be.abis.exC2.ut;

import be.abis.exC2.exceptions.PersonShouldBeAdultException;
import be.abis.exC2.exceptions.SalaryTooLowException;
import be.abis.exC2.model.Company;
import be.abis.exC2.model.Person;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestPerson {

    Person p;

    @Mock
    Company company;

    @Before
    public void setUp(){
        p = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
    }

    @Test
    public void testCalculateAge() throws PersonShouldBeAdultException {
        assertThat(p.calculateAge(), CoreMatchers.is (equalTo(53)));
    }

    @Test
    public void toStringSentenceStartsWithPerson(){
        String sentence = p.toString();
        assertThat(sentence, startsWith("Person"));
    }

    @Test(expected= PersonShouldBeAdultException.class)
    public void calculateAgeShouldThrowExceptionWhenPersonNotAdult() throws PersonShouldBeAdultException {
        Person p2 = new Person(2,"Jane","Smith",LocalDate.of(2007, 8, 10));
        p2.calculateAge();
    }


    @Test
    public void calculateNetSalaryOfBelgianPersonUsingMockCompany() throws SalaryTooLowException {
        //arrange
        // Address address = new Address("Wetstraat", "5", "1000", "Brussels", "Belgium", "BE");
        // Company company = new Company("BNP",address);
        Person p2 = new Person(2,"John","Doe", LocalDate.of(1967, 8, 10), company, 4000.0);

        when(company.calculateTaxToPay())
                .thenReturn(51.0);
        //act
        p2.calculateNetSalary();

        // assert
        verify(company).calculateTaxToPay();
    }

    @Test(expected= SalaryTooLowException.class)
    public void testSalaryTooLowException_in_method_calculateNetSalary() throws SalaryTooLowException {
        //arrange
        Person p2 = new Person(2,"John","Doe", LocalDate.of(1967, 8, 10), company, 3000.0);

        when(company.calculateTaxToPay())
                .thenReturn(51.0);
        //act
        p2.calculateNetSalary();
    }
}

