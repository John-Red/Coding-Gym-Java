package model;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return this.getFirstName();
    }
//    public String toString() {
//        return "First name: " + this.firstName + "\n "
//                + "Last name: " + this.lastName + "\n "
//                + "Age: " + this.age;
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }
}
