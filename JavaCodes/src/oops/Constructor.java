package oops;

class Person {
    String name;
    public Person(String name) {
        this.name = name;
        System.out.println("Parent constructor");
    }
}

class Doctor extends Person{

    int empId;
    public Doctor(int empId) {
        //use of super is mandatory when child constructor is parameterized
        super("Doctor");
        this.empId = empId;
        System.out.println("Child constructor");
    }
}

public class Constructor{
    public static void main(String[] args) {

        Doctor doctor = new Doctor(101);

    }
}