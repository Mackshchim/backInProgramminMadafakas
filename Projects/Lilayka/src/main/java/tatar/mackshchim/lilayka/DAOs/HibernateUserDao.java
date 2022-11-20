package tatar.mackshchim.lilayka.DAOs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tatar.mackshchim.lilayka.models.User;

@Repository
public class HibernateUserDao implements UserDao{
    private SessionFactory sessionFactory;

    public HibernateUserDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(User user) {
        currentSession().save(user);
    }

    @Override
    public User getUserById(int id) {
        return (User) currentSession().get(User.class, id);
    }
}
