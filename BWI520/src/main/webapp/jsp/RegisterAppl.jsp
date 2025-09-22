<%@ page import="model.UserDAO, model.User" %>
<%
    // Eingaben aus dem Formular lesen
    String vorname = request.getParameter("vorname");
    String nachname = request.getParameter("nachname");
    String email = request.getParameter("email");
    String userid = request.getParameter("userid");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");
    String adresse = request.getParameter("adresse");
    String plz = request.getParameter("plz");
    String ort = request.getParameter("ort");
    String zahlweise = request.getParameter("cc");
    

    // Passwort bestätigen
    if (!password.equals(password2)) {
        response.sendRedirect("Registrieren.jsp?error=pwMismatch");
        return;
    }

    // User-Objekt erstellen
    User u = new User();
    u.setVorname(vorname);
    u.setNachname(nachname);
    u.setEmail(email);
    u.setUserid(userid);
    u.setPassword(password);
    u.setAdresse(adresse);
    u.setPlz(plz);
    u.setOrt(ort);
    u.setZahlweise(zahlweise);

    // User speichern
    UserDAO dao = new UserDAO();
    boolean success = dao.insertUser(u);

    if (success) {
        response.sendRedirect("RegisterSuccessView.jsp");
    } else {
        response.sendRedirect("Registrieren.jsp?error=db");
    }
%>
