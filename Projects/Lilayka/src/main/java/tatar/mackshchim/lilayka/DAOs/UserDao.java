package tatar.mackshchim.lilayka.DAOs;

import tatar.mackshchim.lilayka.models.User;

public interface UserDao {

    void addUser(User user);

    User getUserById(long id);

}
