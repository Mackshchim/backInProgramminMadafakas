import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tatar.mackshchim.lilayka.DAOs.HibernateUserDao;
import tatar.mackshchim.lilayka.DAOs.JdbcUserDao;
import tatar.mackshchim.lilayka.DAOs.JpaUserDao;
import tatar.mackshchim.lilayka.DAOs.UserDao;
import tatar.mackshchim.lilayka.models.User;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("DBConfiguration.xml");


        UserDao userDao = context.getBean("jpaUserDao", UserDao.class);
        User u = new User(1,"lilayka","postgres");
        u.setAboutUser("I love you!");
        userDao.addUser(u);


        System.out.println(userDao.getUserById(6).getAboutUser());
    }
}
