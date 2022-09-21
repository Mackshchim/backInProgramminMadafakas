package mackshchim.firstwebapp.models;

import java.util.Date;

public class User extends Cortege {

    private String username;
    private String password;
    private Date birthday;

    public User(String username, Date birthday, String password) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
    }
}
