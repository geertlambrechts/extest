package be.abis.exA6.ut;

import be.abis.exA6.model.Person;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestPerson {
    Person person;

    @Test
    public void testCalculateAge() {
        //arrange

        Integer expected = 53;

        //act
        Integer result = person.calculateAge();

        // assert
        MatcherAssert.assertThat(result, CoreMatchers.is(CoreMatchers.equalTo(expected)));
    }

    @Test
    public void toStringSentenceStartsWithPerson() {
        //arrange
        String expected = "Person";

        //act

        String result = person.toString();

        // assert
        MatcherAssert.assertThat(result, CoreMatchers.startsWith(expected));
    }

    @Before
    public void setUp() {
        person = new Person(2, "John", "Doe", LocalDate.of(1967, 8, 10));
        System.out.println("person created in setUp");
    }

}

