package mackshchim.firstwebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "logInServlet", value = "/logIn")
public class LogIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");

        String user = req.getParameter("userName");
        String password = req.getParameter("userPassword");

        if (user.equals("edureka") && password.equals("edureka"))   pw.println("Login Success...!");
        else    pw.println("Login Failed...!");

        pw.close();

    }
}
