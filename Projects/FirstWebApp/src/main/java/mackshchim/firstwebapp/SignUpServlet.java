package mackshchim.firstwebapp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import static mackshchim.firstwebapp.Main.db;

@WebServlet(name = "signUpServlet", value = "/signUp")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");

        RequestDispatcher view = req.getRequestDispatcher("SignUpPage.html");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        pw.println("<h1>Yooopti yopti.</h1>");
        pw.println("Registration succeed");
        String stringDate = req.getParameter("birthday");
        db.putCortegeInTable(new User(req.getParameter("username"),
                new Date(Integer.parseInt(stringDate.substring(0,4)),
                        Integer.parseInt(stringDate.substring(5,7)),
                        Integer.parseInt(stringDate.substring(8))),
                req.getParameter("password")),"USERS");
    }
}
