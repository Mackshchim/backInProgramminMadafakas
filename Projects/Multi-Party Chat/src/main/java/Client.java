import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class Client {
    private static final int PORT = 4004;
    private static final String HOST = "localhost";


    private static Socket client;

    private static BufferedReader reader;

    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {


    }

}
