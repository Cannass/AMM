/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import m3.FactoryOggetti;
import m3.Oggetti;
import m3.Cliente;
import m3.Utente;
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
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

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

        HttpSession session = request.getSession();

        ArrayList<Oggetti> listaOggetti = FactoryOggetti.getInstance().getListaoggetti();

        session.setAttribute("listaOggetti", listaOggetti);

        if (session.getAttribute("loggato") != null) {
            //eseguo un controllo sul tipo di utente e imposto la variabile clienteloggato true o false per accedere alla pagina
            if (((String) session.getAttribute("tipoUtente")).equals("cliente")) {
                session.setAttribute("clienteloggato", true);
            } else {
                session.setAttribute("clienteloggato", false);
            }
        }

        if (request.getParameter("idAcquisto") != null) {

            Integer idAcquisto = Integer.parseInt(request.getParameter("idAcquisto"));
            Oggetti oggetto = FactoryOggetti.getInstance().getId(idAcquisto);
            request.setAttribute("oggetto", oggetto);
            request.setAttribute("riepilogo", true);

            if (request.getParameter("Conferma") != null) {
                //controllo se il saldo è sufficiente e imposto la variabile a true o false
                if (((Utente) session.getAttribute("cliente")).getSaldo().controllo(oggetto.getPrezzo())) {
                    request.setAttribute("conferma", true);
                    request.setAttribute("riepilogo", false);
                    request.setAttribute("lowbudget", false);
                } else {
                    request.setAttribute("lowbudget", true);
                }
            }
        }
        request.getRequestDispatcher("cliente.jsp").forward(request, response);
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
