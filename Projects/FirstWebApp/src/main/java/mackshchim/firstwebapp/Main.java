package mackshchim.firstwebapp;

import mackshchim.firstwebapp.models.User;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static KindaDatabase db;
    public static User currentUser = null;
    public static void main(String[] args) throws IOException {
        db = new KindaDatabase();
        db.createNewTable("USERS");
    }
}
