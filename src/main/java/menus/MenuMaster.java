package menus;

import entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMaster {

    public static void principal(ArrayList<User> users){

        System.out.println("\nWelcome to the Bici-U System, Please choose an option: \n" +
                " \n" +
                "1. Register user \n2. Borrow Bicycle \n3. Return Bicycle \n4. Pay Tickets \n5. Tickets History \n6. Exit");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        switch (answer){

            case 1:
                Menu1.menu1(users);
                break;
            /*case 2:
                Menu2.menu2();
                break;
            case 3:
                Menu3.menu3();
                break;
            case 4:
                Menu4.menu4();
                break;
            case 5:
                Menu5.menu5();
                break;
            case 6:
                break;*/
        }

        sc.close();


    }

}
