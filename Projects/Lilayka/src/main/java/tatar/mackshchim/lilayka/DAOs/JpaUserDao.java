package tatar.mackshchim.lilayka.DAOs;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tatar.mackshchim.lilayka.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("userDao")
@Transactional
public class JpaUserDao implements UserDao {



    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
