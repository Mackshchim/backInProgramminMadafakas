import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static ApplicationContext context;
    private static ServerSocket server;
    private static Socket client;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        try {
            try {

                server = context.getBean(ServerSocket.class);
                System.out.println("Server is running");

                client = server.accept();

                try {

                    in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

                    String message = in.readLine();
                    System.out.println("Client: " + message);

                    out.write("The message \"" + message +"\" is accepted");
                    out.flush();

                } finally {
                    client.close();
                    in.close();
                    out.close();
                }
            } finally {
                server.close();
                System.out.println("Server is shut down");
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
