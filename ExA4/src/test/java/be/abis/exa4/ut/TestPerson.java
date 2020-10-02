package be.abis.exa4.ut;

import be.abis.exa4.model.Person;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestPerson {
    @Test
    public void testCalculateAge () {
        //arrange
        Person person = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
        Integer expected = 53;

        //act
        Integer result = person.calculateAge();

        // assert
        assertThat(result, is(equalTo(expected)));
    }
}

