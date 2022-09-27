package mackshchim.firstwebapp.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import mackshchim.firstwebapp.Main;
import mackshchim.firstwebapp.models.User;

import java.io.IOException;
import java.io.PrintWriter;

import static mackshchim.firstwebapp.Main.currentUser;

@WebServlet(name = "signInServlet", value = "/signIn")
public class SignInServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        if (Main.db.tableHas("USERS",username)) {
            currentUser = (User) Main.db.getCortegeFromTable(username,"USERS");
            if (currentUser.getPassword().equals(req.getParameter("password"))) {
                HttpSession session = req.getSession();
                session.setAttribute("username",username);
                session.setMaxInactiveInterval(60*60*24*7);
                RequestDispatcher view = req.getRequestDispatcher("Profile Page.jsp");
                view.forward(req, resp);

            } else {
                PrintWriter pw = resp.getWriter();
                pw.println("wrong password");
                pw.close();
                currentUser = null;
            }
        } else {
            PrintWriter pw = resp.getWriter();
            pw.println("Not a such user");
            pw.close();
        }

    }
}
