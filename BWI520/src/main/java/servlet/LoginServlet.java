package servlet;

import dao.BenutzerDAO;
import model.Benutzer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private BenutzerDAO benutzerDAO = new BenutzerDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String passwort = request.getParameter("passwort");

        try {
            Benutzer b = benutzerDAO.findByEmailAndPassword(email, passwort);
            if (b != null) {
                HttpSession session = request.getSession();
                session.setAttribute("benutzer", b);
                response.sendRedirect("welcome.jsp");
            } else {
                request.setAttribute("error", "Ungültige Zugangsdaten!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
