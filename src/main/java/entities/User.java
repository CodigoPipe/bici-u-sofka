package entities;

public class User {

    private String name;

    private String surname;

    private String DNI;

    private int age;


    public User(String name, String surname, String DNI, int age) {
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
