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

        //this loop looks for debts, if theres no debts, it continues de menu
        for(int i = 0; i<tickets.size();i++){
            if(currentId.equalsIgnoreCase(tickets.get(i).getIdUserTicket())){
                System.out.println("you have a pending debt, please pay before borrowing a bicycle");
                MenuMaster.principal(users, tickets, bicycles);
            }
        }


        System.out.println("Choose a type of bike, MOUNTAIN or ROAD... enter M or R");
        String bikeType = menu2sc.nextLine();

        //these loop looks for an available bike of the chosen type
        if(bikeType.equalsIgnoreCase("m")){
            for(int i = 0; i<bicycles.size();i++){
                if(bicycles.get(i).getType().equalsIgnoreCase("Mountain") && bicycles.get(i).getAvailable() == true){
                    bicycles.get(i).setAvailable(false);
                    System.out.println("bicycle chosen\ncode: " + bicycles.get(i).getCode());
                    System.out.println("Type: " + bicycles.get(i).getType());
                    System.out.println("Color: "+ bicycles.get(i).getColor() + "\n");

                    Ticket currentTicket = new Ticket(currentId);
                    currentTicket.setDate();
                    currentTicket.setDate();
                    tickets.add(currentTicket);

                    //ticket created
                    System.out.println("A ticket was created!\n");
                    System.out.println("Code: "+ currentTicket.getIdTicket());
                    System.out.println("Bicycle: "+ bicycles.get(i).getCode());
                    System.out.println("User: "+ currentId);
                    System.out.println("Date: "+ currentTicket.getDate());
                    System.out.println("Start time: "+ currentTicket.getStartHour() );
                    System.out.println("End time: -");
                    System.out.println("Have helmet: "+ currentTicket.getWithHelmet());
                    System.out.println("Good condition: "+ currentTicket.getGood());
                    System.out.println("Status: "+ currentTicket.getStatus());
                    System.out.println("Amount: "+ currentTicket.getMustPay());

                    MenuMaster.principal(users,tickets,bicycles);

                }
            }
        }

        if(bikeType.equalsIgnoreCase("r")){
            for(int i = 0; i<bicycles.size();i++){
                if(bicycles.get(i).getType().equalsIgnoreCase("Road") && bicycles.get(i).getAvailable() == true){
                    bicycles.get(i).setAvailable(false);
                    System.out.println("bicycle chosen\ncode: " + bicycles.get(i).getCode());
                    System.out.println("Type: " + bicycles.get(i).getType());
                    System.out.println("Color: "+ bicycles.get(i).getColor());

                    Ticket currentTicket = new Ticket(currentId);
                    currentTicket.setDate();
                    currentTicket.setStartHour();
                    tickets.add(currentTicket);

                    //ticket created
                    System.out.println("A ticket was created!\n");
                    System.out.println("Code: "+ currentTicket.getIdTicket());
                    System.out.println("Bicycle: "+ bicycles.get(i).getCode());
                    System.out.println("User: "+ currentId);
                    System.out.println("Date: "+ currentTicket.getDate());
                    System.out.println("Start time: "+ currentTicket.getStartHour() );
                    System.out.println("End time: -");
                    System.out.println("Have helmet: "+ currentTicket.getWithHelmet());
                    System.out.println("Good condition: "+ currentTicket.getGood());
                    System.out.println("Status: "+ currentTicket.getStatus());
                    System.out.println("Amount: "+ currentTicket.getMustPay());

                    MenuMaster.principal(users,tickets,bicycles);
                }
            }
        }






    }
}
