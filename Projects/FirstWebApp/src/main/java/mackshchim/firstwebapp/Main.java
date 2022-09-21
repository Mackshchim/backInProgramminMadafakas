package mackshchim.firstwebapp;

public class Main {

    public static KindaDatabase db;

    public static void main(String[] args) {
        db = new KindaDatabase();
        db.createNewTable("users");
    }
}
