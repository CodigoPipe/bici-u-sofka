package menus;

import entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu1 {

    public static void menu1(ArrayList<User> users) {

        Scanner menu1sc = new Scanner(System.in);

        System.out.println("Please introduce your name");
        String name = menu1sc.nextLine();

        System.out.println("Please introduce your surname");
        String surname = menu1sc.nextLine();

        int age;
        do {
            System.out.println("Please introduce your age");
            age = menu1sc.nextInt();
        } while (age < 18);

        menu1sc.nextLine();

        System.out.println("Please introduce your DNI");
        String dni = menu1sc.nextLine();

        User currentUser = new User(name,surname,dni,age);

        System.out.println("Are you an student or a profesor... enter S for student or P for Professor");
        String studentOrProfe = menu1sc.nextLine();

        if(studentOrProfe.equalsIgnoreCase("p")){
            currentUser.setDNIProfessor(dni);
        }
        if(studentOrProfe.equalsIgnoreCase("s")){
            currentUser.setDNIStudent(dni);
        }


        System.out.println("Register completad!!");
        System.out.println("");
        System.out.println("ID: " + currentUser.getDNI());
        System.out.println("Name: " + currentUser.getName() + " " + currentUser.getSurname());
        System.out.println("Age: " + currentUser.getAge());
        System.out.println("");
        System.out.println("Remember your ID if you want to borrow a bicycle");




        users.add(currentUser);

        //System.out.println(users.get(0).getName());


        MenuMaster.principal(users);


    }
}
