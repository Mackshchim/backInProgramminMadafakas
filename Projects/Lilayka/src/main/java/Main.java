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


        UserDao userDao = context.getBean("userDao", UserDao.class);


        System.out.println(userDao.getUserById(1).getUserName());
        System.out.println(userDao.getUserById(2).getAboutUser());
        System.out.println(userDao.getUserById(3).getAboutUser());
        System.out.println(userDao.getUserById(4).getAboutUser());
    }
}
