package tatar.mackshchim.spring0;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        VideoPlayer player = context.getBean("videoPlayerBean",VideoPlayer.class);
        player.play();
        context.close();
    }

}
