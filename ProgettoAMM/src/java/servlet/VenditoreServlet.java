/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import m3.FactoryOggetti;
import m3.Oggetti;
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
@WebServlet(name = "VenditoreServlet", urlPatterns = {"/VenditoreServlet"})
public class VenditoreServlet extends HttpServlet {

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
        //controllo se l'utente loggato sia un venditore

        if (session.getAttribute("loggato") != null) {
            //Controllo il tipo dell'utente
            if (((String) session.getAttribute("tipoUtente")).equals("venditore")) {
                session.setAttribute("venditoreloggato", true);
            }
        } else {
            session.setAttribute("venditoreloggato", false);
        }

        if (request.getParameter("SubmitForm") != null) {
            ArrayList<Oggetti> listaoggetti = FactoryOggetti.getInstance().getListaoggetti();

            Oggetti oggetto = new Oggetti();
            oggetto.setNome(request.getParameter("Nome"));
            oggetto.setUrlimg(request.getParameter("ImgLink"));
            oggetto.setDescrizione(request.getParameter("Descrizione"));
            oggetto.setPrezzo(Double.parseDouble(request.getParameter("Prezzo")));
            oggetto.setQuantita(Integer.parseInt(request.getParameter("Quantita")));
            listaoggetti.add(oggetto);

            request.setAttribute("oggetto", oggetto);
            request.setAttribute("formOggetto", true);
        } else {
            request.setAttribute("formOggetto", false);
        }
        request.getRequestDispatcher("venditore.jsp").forward(request, response);

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
