package Main;

import entities.User;
import menus.MenuMaster;

import java.util.ArrayList;

public class Main {

    //collections
    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {

        MenuMaster.principal(users);
    }
}
