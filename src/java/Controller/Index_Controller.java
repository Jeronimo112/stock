/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;


/**
 *
 * @author john
 */
@WebServlet(name = "/index_controller", urlPatterns = { "/index_controller" })
public class Index_Controller extends HttpServlet {

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
        
        
        
        String action = request.getParameter("param1");
        if(action.equals("charts")){
      
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/charts.jsp");
			rd.forward(request, response);
                        Stock stock = YahooFinance.get("sdf");
                        stock.print();
                      
        }
        if(action.equals("index")){
      
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		
        }
        if(action.equals("forms")){
      
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/forms.html");
			rd.forward(request, response);
		
        }
        if(action.equals("tables")){
      
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/tables.html");
			rd.forward(request, response);
		
        }
        if(action.equals("bootstrap")){
      
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/bootstrap-elements.html");
			rd.forward(request, response);
		
        }
        if(action.equals("grid")){
      
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/bootstrap-grid.html");
			rd.forward(request, response);
		
        }
             
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
