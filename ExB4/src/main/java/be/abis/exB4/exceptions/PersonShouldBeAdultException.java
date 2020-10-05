package be.abis.exB4.exceptions;

public class PersonShouldBeAdultException extends Exception {
        public PersonShouldBeAdultException() {
            super() ;
        }
        public PersonShouldBeAdultException(String s) {
            super(s);
        }
}
