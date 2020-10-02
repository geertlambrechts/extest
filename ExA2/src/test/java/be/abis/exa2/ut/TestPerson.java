package be.abis.exa2.ut;

import be.abis.exa2.model.Person;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TestPerson {
    @Test
    public void add_shouldReturnTheSum_ofTwoNumbers () {
        //arrange
        Person person = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
        Integer expected = 53;

        //act
        Integer result = person.calculateAge();

        // assert
        assertEquals(expected,result);
    }
}

