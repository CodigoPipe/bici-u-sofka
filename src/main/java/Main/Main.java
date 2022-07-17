package Main;

import entities.Bicycle;
import entities.Ticket;
import entities.User;
import menus.MenuMaster;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    //collections
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Ticket> tickets = new ArrayList<>();

    static ArrayList<Bicycle> bicycles = new ArrayList<>();

    public static void main(String[] args) {

        //this for intanciate all the bicicles and add them into te arraylist bicycles)
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/bicycles.txt"));
            String read;
            while((read = br.readLine()) != null){

                String[] arr = read.split(";");
                String code = arr[0];
                String type = arr[1];
                String color = arr[2];
                boolean available = Boolean.parseBoolean(arr[3]);
                bicycles.add(new Bicycle(code,type,color,available));
            }

        }catch(IOException e){
            System.out.println("there is nothing in txt file");
        }


        MenuMaster.principal(users,tickets,bicycles);
    }
}



/*Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-02","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-03","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-04","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-05","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-06","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-07","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-08","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);

        Bicycle bic1 = new Bicycle("BIC-01","Mountain","Red",true);
        bicycles.add(bic1);*/