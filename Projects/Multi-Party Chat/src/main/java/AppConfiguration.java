import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

@Configuration
public class AppConfiguration {

    private final int PORT = 4004;
    private final String HOST = "localhost";


    @Bean
    public ServerSocket serverSocket() {
        try {
            return new ServerSocket(PORT);
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    @Bean
    public Socket socket() {
        try {
            return new Socket(HOST, PORT);
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    @Bean
    public BufferedReader bufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

}
