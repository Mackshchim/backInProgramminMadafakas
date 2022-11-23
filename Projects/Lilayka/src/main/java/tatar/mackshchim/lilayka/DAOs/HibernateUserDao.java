package tatar.mackshchim.lilayka.DAOs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tatar.mackshchim.lilayka.models.User;

@Deprecated
@Repository("hibernateUserDao")
@Transactional(propagation = Propagation.SUPPORTS,
                readOnly = true)
public class HibernateUserDao implements UserDao{
    private SessionFactory sessionFactory;

    @Autowired
    public HibernateUserDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional(propagation = Propagation.REQUIRED,
    readOnly = false)
    @Override
    public void addUser(User user) {
        currentSession().save(user);
    }

    @Override
    public User getUserById(long id) {
        return (User) currentSession().get(User.class, id);
    }
}
