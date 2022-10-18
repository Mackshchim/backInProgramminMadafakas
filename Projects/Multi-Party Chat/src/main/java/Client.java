import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class Client {

    private static ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
    private static Socket client;

    private static BufferedReader reader;

    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {

        try {
            try {
                client  = context.getBean(Socket.class);

                reader = context.getBean(BufferedReader.class);

                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

                System.out.print("Enter some message: ");

                String message = reader.readLine();

                out.write(message);
                out.flush();

                String serverMessage = in.readLine();
                System.out.println("Server: " + serverMessage);
            } finally {
                client.close();
                in.close();
                out.close();
                System.out.println("Client is out");
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }

}
