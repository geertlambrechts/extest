package be.abis.exC2.exceptions;

public class PersonShouldBeAdultException extends Exception {
        public PersonShouldBeAdultException() {
            super() ;
        }
        public PersonShouldBeAdultException(String s) {
            super(s);
        }
}
