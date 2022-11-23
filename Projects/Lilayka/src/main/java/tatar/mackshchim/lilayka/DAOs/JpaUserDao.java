package tatar.mackshchim.lilayka.DAOs;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tatar.mackshchim.lilayka.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("jpaUserDao")
@Transactional(propagation = Propagation.SUPPORTS,
            readOnly = true)
public class JpaUserDao implements UserDao {



    @PersistenceContext
    private EntityManager em;

    @Transactional(propagation = Propagation.REQUIRED,
                readOnly = false)
    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public User getUserById(long id) {
        return em.find(User.class, id);
    }
}
