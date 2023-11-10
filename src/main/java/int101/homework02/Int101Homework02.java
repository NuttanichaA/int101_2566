package int101.homework02;

import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02 {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();

    }

    static void work01Utilitor() {
        /*
       1.1 Create a public utility class named "Utilitor" in package named "work01Utilitor".
       1.2 Create a public method named "testString" in "Utilitor" class.
           This method receives a parameter of type "String"
           named "value" and it returns the "value" if nothing is wrong.
           However, if the "value" is null, it throws NullPointerException.
           If the "value" is a blank string, it throws IllegalArgumentException.
       1.3 Create a public method named "testPositive" in "Utilitor" class.
           This method receives a parameter of type "double" named "value"
           and it returns the "value" if this "value" is a positive value.
           Otherwise, it throws IllegalArgumentException.
       1.4 Create a public method named "computeIsbn10" in "Utilitor" class.
           This method recieves a parameter of type "long" named "isbn10"
           and it returns the value of "isbn10" whose last digit is modified
           to make it a valid ISBN-10.
           See https://en.wikipedia.org/wiki/Check_digit for ISBN-10 calculation.
           ** You must use loop to calculate the ISBN-10 check-digit. **
       1.5 Show in this "work01Utilitor" method how to use 1.2-1.4 and
           check their correctness. */

        System.out.println("Test 1.2: " + Utilitor.testString("Hello world"));
        System.out.println("Test 1.3: " + Utilitor.testPositive(5.5));
        System.out.println("Test 1.4: check digit for 345 = " + Utilitor.computeIsbn10(345));
        System.out.println("Test 1.4: check digit for 108_109_873 = " + Utilitor.computeIsbn10(108_109_873));
        System.out.println(" test for 1.2,1.3 errors:");
        try {
            System.out.println(Utilitor.testString(" "));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            System.out.println(Utilitor.testPositive(0));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    static void work02Person() {
        /*
       2.1 Create a public class named "Person" in package named "work02Person".
           This class contains the following fields and methods.
       2.2 a private static field of type "int" named "nextId" initialized to 1.
       2.3 a private final field of type "int" named "id".
       2.4 a private field of type "String" named "firstname".
       2.5 a private field of type "String" named "lastname".
       2.6 a public constructor that receives "firstname" and "lastname"
           parameters to set the values of "firstname" and "lastname" fields.
           Check the correctness of the values of "firstname" and "lastname"
           parameters with "Utilitor.testString" method first.
           If nothing is wrong, set the value of "id" field to be the value
           of "nextId" field and increment the value of "nextId" by 1.
       2.7 @Override a public "toString" method that returns
           "Person(id,firstname,lastname)" where id, firstname, and lastname
           are the values of the coresponding fields of this "Person" object.
           Use "StringBuilder" to build the output string.
       2.8 public getters for "id", "firstname", and "lastname" fields.
       2.9 public setters for "firstname" and "lastname" fields.
           Use the "Utilitor.testString" method to check the correctness
           of the parameters first.
       2.10 @Override a public "equals" method that returns true
            if this object is the same as the object in the parameter
            (i.e., the same reference). Otherwise, it returns false.
       2.11 Show in this "work02Person" method how to use 2.6-2.10
            and check their correctness. */

        try {
            Person p1 = new Person("Aaa", "Bbb");
            System.out.println("p1's inforrmation: " + p1.toString());
            p1.setFirstname("Sawaddee");
            System.out.println("New first name for p1 = " + p1.getFirstname());
            Person p2 = new Person("Ccc", "Ddd");
            System.out.println("p1 is the same person as p2?  " + p1.equals(p2));
            System.out.println("Test Error:");
            Person p4 = new Person("Ijkl", " ");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    static void work03Account() {
        /*
       3.1 Create a public class named "Account" in package named "work03Account".
           This class contains the following fields and methods.
       3.2 a private static field of type "long" named "nextNo"
           initialized to 1_000_000_000.
       3.3 a private final "no" field of type "long".
       3.4 a private "owner" field of type "Person".
       3.5 a private "balance" field of type "double".
       3.6 a public constructor that receives an "owner" parameter of
           type "Person" to set the "owner" field. This method throws
           NullPointerException if the "owner" parameter is null.
           This method sets the value of "no" field to be the result from
           sending the "nextId" field to "Utilitor.computeIsbn10" method;
           and then increments the value of "nextId" by 10.
           This method sets the value of "balance" to 0.0.
       3.7 public getters for "no", "owner", and "balance".
       3.8 a public method named "deposit" that receives a "double" parameter
           named "amount". This method throws IllegalArgumentException
           if "amount" cannot pass "Utilitor.testPositive" method.
           Otherwise, the method adds the "amount" to "balance"
           and then returns the new "balance".
       3.9 a public method named "withdraw" that receives a "double" parameter
           named "amount". This method throws IllegalArgumentException
           if "amount" does not pass "Utilitor.testPositive" method.
           Otherwise, the method subtracts the "amount" from "balance"
           and then returns the new "balance".  However, this method will not
           do so if the new "balance" cannot pass "Utilitor.testPositive" method.
       3.10 a public method named "transfer" that recieves a "double" parameter
            named "amount" and an "Account" parameter named "account".
            This method throws IllegalArgumentException if "account" is null
            or it cannot "withdraw" the "amount" from this object. Otherwise,
            this method "withdraw" the "amount" from this object and "deposit"
            the "amount" to the "account" object.  This method returns nothing.
       3.11 @Override a public "toString" method that returns
            "Account(no,balance)" where "no" and "balance" are
            the "no" and "balance" fields of this object.
       3.12 @Override a public "equals" method that returns true
            if this object is the same as the object in the parameter
            (i.e., the same reference). Otherwise, it returns false.
       3.13 Show in this "work03Account" method how to use 3.6-3.12
            and check their correctness. */
        Person p11 = new Person("Ggg", "Hhh");
        Person p12 = new Person("Iii", "Jjj");

        Account a1 = new Account(p11);
        Account a2 = new Account(p12);

        System.out.println("p11's account: " + a1.toString());
        System.out.println("p12's account: " + a2.toString());

        a2.deposit(2000.25);
        System.out.println("Balance of p12's account after deposit(2000.25) = " + a2.getBalance());
        a2.withdraw(1000.00);
        System.out.println("New balance of p12's account after withdraw(1000.00) = " + a2.getBalance());
        System.out.println(" test error:");
        try {
            a2.withdraw(3000);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        a2.transfer(550, a1);
        System.out.println("New balance of p12's account after transfer money(550) to p11 = " + a2.getBalance());
        System.out.println("New balance of p11's account after receive money(550) from p12 = " + a1.getBalance());

        System.out.println("Is a1 the same account as a 2? " + a1.equals(a2));
    }
}
