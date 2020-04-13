package at.ta.Bank;

import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String adress;
    private String password;

    public Person(String name, int age, String adress, String password) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }


    public void customerData() {
        System.out.println("---KundenDaten---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Adress: " + getAdress());
        System.out.println("---KundenDatenEnde---");
    }


    public void passwordQuery() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give your Password: ");
        String passwordCheck = input.next();
        int i = 1;

        while (this.password.equals(passwordCheck) == false && i < 3) {
            System.out.println("Passwort false. Try again");
            passwordCheck = input.next();
            i++;
        }
        if (this.password.equals(passwordCheck) == true) {
            System.out.println("Welcome: " + getName());
        } else {
            System.out.println("Password you give 3 times the false password, please contact your Bank.");
            System.exit(0);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }

}
