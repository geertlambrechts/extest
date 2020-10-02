package be.abis.exA7.exceptions;

public class PersonShouldBeAdultException extends Exception {
        public PersonShouldBeAdultException() {
            super() ;
        }
        public PersonShouldBeAdultException(String s) {
            super(s);
        }
}
