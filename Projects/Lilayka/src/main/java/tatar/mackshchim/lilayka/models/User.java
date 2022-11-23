package tatar.mackshchim.lilayka.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "public.\"user\"")
public class User {
    @Id
    private long userId;
    private String username;
    private String password;
    private String aboutUser;


    public User() {}

    public User(long userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.aboutUser = "";
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.aboutUser = "";
    }



    public long getUserId() {
        return userId;
    }

    public void setUserId(long id) {
        this.userId = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getAboutUser() {
        return aboutUser;
    }

    public void setAboutUser(String aboutUser) {
        this.aboutUser = aboutUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
