import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server {
    public static final int PORT = 4004;
    public static final String HOST = "localhost";
    private static LinkedList<Thread> clientList = new LinkedList<>();


//    private static ApplicationContext context;
    private static ServerSocket serverSocket;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) throws IOException {

        serverSocket = new ServerSocket(PORT);
         

    }
}
