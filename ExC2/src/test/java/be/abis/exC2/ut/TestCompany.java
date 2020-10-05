package be.abis.exC2.ut;

import be.abis.exC2.model.Address;
import be.abis.exC2.model.Company;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCompany {
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

}
