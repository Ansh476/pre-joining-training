package app;

import java.io.IOException;
import java.util.HashMap;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {

    public static HashMap<String, String> users = new HashMap<>();

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (!users.containsKey(username)) {
            users.put(username, password);
            response.sendRedirect("login.jsp?msg=registration successful. Please login.");
        }
        else {

            response.sendRedirect("register.jsp?msg=username already exists.");
        }
    }
}