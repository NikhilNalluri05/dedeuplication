/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deduplication;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

/**
 *
 * @author Devaa
 */
public class AuditorRegServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AuditorRegServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AuditorRegServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession session1=request.getSession();
       
       Connection con=null;
       Statement st=null;
       //ResultSet rs=null;
       
       try
       {
           String UserId=request.getParameter("userid");
           String Username=request.getParameter("username");
           String Password=request.getParameter("password");
           String Conpassword=request.getParameter("conpassword");
           String Email=request.getParameter("email");
           String Mobile=request.getParameter("mobile");
           
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/publicauditing","root","password");
           st=con.createStatement();
           int rs=st.executeUpdate("Insert into auditorreg(userid,username,password,email,mobileno) Values('"+UserId+"','"+Username+"','"+Password+"','"+Email+"','"+Mobile+"')");
           if(rs>0)
           {
            response.sendRedirect("Index.jsp");   
           }
           else
           {
               
           }
           
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
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
