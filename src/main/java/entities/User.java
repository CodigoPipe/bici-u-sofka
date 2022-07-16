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

    //sets a DNI for a professor
    public void setDNIProfessor(String DNI) {
        this.DNI = "P-" + DNI;
    }

    //set a Dni for a student
    public void setDNIStudent(String DNI) {
        this.DNI = "S-" + DNI;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
