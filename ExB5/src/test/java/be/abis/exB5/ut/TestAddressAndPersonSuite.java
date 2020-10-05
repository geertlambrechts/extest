package be.abis.exB5.ut;

import be.abis.exB5.ut.TestAddress;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        be.abis.exB4.ut.TestPerson.class,
        TestAddress.class})
public class TestAddressAndPersonSuite {
}

