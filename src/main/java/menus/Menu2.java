package menus;


import entities.Bicycle;
import entities.Ticket;
import entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu2 {

    public static void menu2(ArrayList<User> users, ArrayList<Ticket> tickets, ArrayList<Bicycle> bicycles){

        Scanner menu2sc = new Scanner(System.in);

        System.out.println("Enter your ID");
        String currentId = menu2sc.nextLine();

        //AQUI QUEDASTE, TENES QUE CREAR LOS GETTERS  SETTERS THE TICKET PARA SEGUIR
        for(int i = 0; i<tickets.size();i++){
            if(currentId.equalsIgnoreCase(tickets.get(i).getUserTicket().getDNI())){
                System.out.println("you have a pending debt, please pay before borrowing a bicycle");
                MenuMaster.principal(users, tickets, bicycles);
            }
        }

        System.out.println("Choose a type of bike, MOUNTAIN or ROAD... enter M or R");
        String bikeType = menu2sc.nextLine();









    }
}
