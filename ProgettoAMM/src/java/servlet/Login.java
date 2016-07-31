/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import m3.FactoryOggetti;
import m3.Oggetti;
import m3.Utente;
import m3.FactoryUtenti;
import m3.Venditori;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author canna
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession(true);

        if (request.getParameter("valore") != null) {
            String username = request.getParameter("nome");
            String password = request.getParameter("pass");

            ArrayList<Utente> listaUtenti = FactoryUtenti.getInstance().getListaUtenti();
            //scorro gli utenti e se trovo nome e password corrispondendi
            for (Utente user : listaUtenti) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {

                    session.setAttribute("loggato", true);
                    session.setAttribute("Idutente", user.getId());
                    session.setAttribute("tipoUtente", user.getTipoUtente());

                    //controllo se user sia una sottoclasse di venditori se lo è imposto user come venditore oppure viene impostato come cliente
                    if (user instanceof Venditori) {
                        session.setAttribute("venditore", user);
                        request.getRequestDispatcher("venditore.html").forward(request, response);
                    } else {
                        session.setAttribute("cliente", user);
                        request.getRequestDispatcher("cliente.html").forward(request, response);
                    }
                }
            }
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
