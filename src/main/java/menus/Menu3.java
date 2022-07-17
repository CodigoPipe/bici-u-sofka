package menus;

import entities.Bicycle;
import entities.Ticket;
import entities.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu3 {

 public static void menu3(ArrayList<User> users, ArrayList<Ticket> tickets, ArrayList<Bicycle> bicycles){

     Scanner ans = new Scanner(System.in);

     System.out.println("Thanks for returning the bicycle, please answer\n");

     System.out.println("Introduce your ticket number");
     String currentTicket = ans.nextLine();

     for(int i = 0;i<tickets.size();i++){

         if(currentTicket.equalsIgnoreCase(tickets.get(i).getIdTicket())){
             System.out.println("With helmet .. enter Y for yes or N for NO");
             String withHelmet = ans.nextLine();

             if (withHelmet.equalsIgnoreCase("n")){
                 tickets.get(i).setWithHelmet();
             }

             System.out.println("in good condition? .. enter Y for yes or N for NO");
             String goodCondition = ans.nextLine();

             if (goodCondition.equalsIgnoreCase("n")){
                 tickets.get(i).setGood();
             }

             tickets.get(i).setHowMuchPaid();
             LocalDateTime time = LocalDateTime.now();

             System.out.println("Code: "+ tickets.get(i).getIdTicket());
             System.out.println("User: "+ tickets.get(i).getIdUserTicket());
             System.out.println("Date: "+ tickets.get(i).getDate());
             System.out.println("Start time: "+ tickets.get(i).getStartHour());
             System.out.println("End time: " + time);
             System.out.println("Have helmet: "+ tickets.get(i).getWithHelmet());
             System.out.println("Good condition: "+ tickets.get(i).getGood());
             System.out.println("Status: "+ tickets.get(i).getStatus());
             System.out.println("Amount: "+ tickets.get(i).getMustPay());

             System.out.println("\nDo you wish to pay this ticket? enter Y for yes and N for No");
             String pay = ans.nextLine();

             if(pay.equalsIgnoreCase("y")){
                 tickets.remove(i);
             }

             if(pay.equalsIgnoreCase("n")){
                 System.out.println("Choose another option for the principal menu");
             }

         }
     }

     MenuMaster.principal(users, tickets, bicycles);



 }


}
