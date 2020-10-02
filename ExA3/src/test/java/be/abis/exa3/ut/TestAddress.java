package be.abis.exa3.ut;

import be.abis.exa3.model.Address;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAddress {
    @Test
    public void belgianZipCodeShouldBeNumeric () {
        //arrange
        Address address = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgie","BE");

        //act
    //    Integer result = person.calculateAge();
        boolean isNumeric = address.belgiumZipCodeShouldBeNumeric();

        // assert
        assertTrue(isNumeric);
    }
}
