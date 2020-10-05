package be.abis.exB1.ut;

import be.abis.exB1.exceptions.PersonShouldBeAdultException;
import be.abis.exB1.model.Person;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

public class TestPerson {
    Person person;

    @BeforeEach
    public void setUp() {
        person = new Person(2, "John", "Doe", LocalDate.of(1960, 8, 10));

        System.out.println("person created in setUp");
    }

    @Test
    public void testCalculateAge() throws PersonShouldBeAdultException {
        //arrange

        Integer expected = 60;

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

    @Test
    public void testPersonShouldBeAdultException ()  {
        //arrange
        Person person2 = new Person(2, "Peter", "HetKind", LocalDate.of(1910, 8, 10));
        System.out.println ("person2="+ person2);
        //act
        Assertions.assertThrows(PersonShouldBeAdultException.class, () -> person2.calculateAge());
    }
}

