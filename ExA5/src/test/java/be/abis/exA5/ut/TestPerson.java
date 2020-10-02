package be.abis.exA5.ut;

import be.abis.exa5.model.Person;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.*;
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
        MatcherAssert.assertThat(result, CoreMatchers.is(CoreMatchers.equalTo(expected)));
    }

    @Test
    public void toStringSentenceStartsWithPerson () {
        //arrange
        Person person = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
        String expected = "Person";

        //act

        String result = person.toString();

        // assert
        assertThat(result, startsWith(expected));
    }

}

