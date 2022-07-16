package menus;

import entities.User;

import java.util.Scanner;

public class Menu1 {

    public static void menu1() {

        Scanner menu1sc = new Scanner(System.in);

        System.out.println("Please introduce your name");
        String name = menu1sc.nextLine();

        System.out.println("Please introduce your surname");
        String surname = menu1sc.nextLine();

        int age;
        do {
            System.out.println("Please introduce your age");
            age = menu1sc.nextInt();
            menu1sc.nextLine();
        } while (age < 18);


        System.out.println("Please introduce your DNI");
        String dni = menu1sc.nextLine();

        User currentUser = new User(name,surname,dni,age);



        MenuMaster.principal();


    }
}
