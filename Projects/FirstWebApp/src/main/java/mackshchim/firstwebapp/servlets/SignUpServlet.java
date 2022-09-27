package mackshchim.firstwebapp.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import mackshchim.firstwebapp.models.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import static mackshchim.firstwebapp.Main.currentUser;
import static mackshchim.firstwebapp.Main.db;

@WebServlet(name = "signUpServlet", value = "/signUp")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("SignUpPage.html");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        pw.println("<h1>Yooopti yopti.</h1>");
        pw.println("Registration succeed<br>");
        pw.println("<a href=\"index.jsp\">Main page<a>");
        pw.println("am: " + req.getParameter("username") + " " + req.getParameter("birthday") + " " + req.getParameter("password"));
        String stringDate = req.getParameter("birthday");
        User newUser = new User(req.getParameter("username"),
                new Date(Integer.parseInt(stringDate.substring(0,4)),
                        Integer.parseInt(stringDate.substring(5,7)),
                        Integer.parseInt(stringDate.substring(8))),
                req.getParameter("password"));
        db.putCortegeInTable(newUser,"USERS");
        currentUser = newUser;
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("username", req.getParameter("username"));
        httpSession.setMaxInactiveInterval(60 * 60 * 24 * 7);

        /*
        Cookie userCookie = new Cookie("username", req.getParameter("username"));
        userCookie.setMaxAge(24 * 60 * 60);
        resp.addCookie(userCookie);
        */

        pw.close();
    }
}
