package be.abis.exA7.ut;

import be.abis.exA7.exceptions.PersonShouldBeAdultException;
import be.abis.exA7.model.Person;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class TestPerson {
    Person person;

    @Before
    public void setUp() {
        person = new Person(2, "John", "Doe", LocalDate.of(2010, 8, 10));
        System.out.println("person created in setUp");
    }

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

    @Test(expected = PersonShouldBeAdultException.class)
    public void testPersonShouldBeAdultException () throws PersonShouldBeAdultException {
        //act
        person.calculateAge();
    }

}

