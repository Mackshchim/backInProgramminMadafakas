package tatar.mackshchim.lilayka.models;

public class User {
    private int id;
    private String userName;
    private String password;
    private String aboutUser;


    public User(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.aboutUser = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
