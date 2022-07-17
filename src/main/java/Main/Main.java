package Main;

import entities.Bicycle;
import entities.Ticket;
import entities.User;
import menus.MenuMaster;

import java.util.ArrayList;

public class Main {

    //collections
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Ticket> tickets = new ArrayList<>();

    static ArrayList<Bicycle> bicycles = new ArrayList<>();

    public static void main(String[] args) {

        //this for intanciate all the bicicles and add them into te arraylist bicycles)


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