import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tatar.mackshchim.lilayka.DAOs.JdbcUserDao;
import tatar.mackshchim.lilayka.DAOs.UserDao;
import tatar.mackshchim.lilayka.models.User;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("DBConfiguration.xml");

        User user1 = new User(1,"lilayka","postgres");
        User user2 = new User(2,"malayka","postgres");
        user2.setAboutUser("I hate you");

        UserDao userDao = context.getBean("userDao", JdbcUserDao.class);
        System.out.println(userDao.getUserById(1).getUserName());
        System.out.println(userDao.getUserById(2).getAboutUser());
    }
}
