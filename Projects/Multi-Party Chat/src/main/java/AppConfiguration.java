import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

@Configuration
public class AppConfiguration {

    private static final int PORT = 4004;
    private static final String HOST = "localhost";


    @Bean
    public ServerSocket serverSocket() throws IOException {
        return new ServerSocket(PORT);
    }

    @Bean
    public Socket socket() throws IOException {
        return new Socket(HOST,PORT);
    }

    @Bean
    public BufferedReader bufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

}
