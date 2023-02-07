/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deduplication;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Devaa
 */
public class UploadLogin extends HttpServlet {
  String Username="";
      String Password="";
      String filename;
      String productkey="";
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UploadLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UploadLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
      
       
               
               Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        
           HttpSession session1=request.getSession();
        
      
           
 
            
            
            
        try
        {
            
            ArrayList list=new ArrayList();
            
             
            
            
             Username=request.getParameter("username");
             Password=request.getParameter("password");
             
             System.out.println("name ==="+Username);
            System.out.println("passwprd"+Password);
            
             filename=request.getParameter("filename");  
             productkey=request.getParameter("productkey");
            
            
            
         
               
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/debuplication","root","password");
            st=con.createStatement();
            rs=st.executeQuery("Select * from registration where username='"+Username+"' and password='"+Password+"'");
            
            if(rs.next())
            {
              File file=new File("E:/"+Username);
               System.out.println("WWWWWWWWWWW deva"+Username);
               if(!(file.exists()))
               {
                   file.mkdir();
               }
               
                productkey=rs.getString("userproductkey");
                System.out.println("UUUUUUUUUUUU"+productkey);
                
                response.sendRedirect("UploadFile.jsp");
            
                        
                        
                          session1.setAttribute("productkey", productkey);
                          System.out.println("FFFFFFFFFFFFFF  last"+productkey);
                          session1.setAttribute("Username", Username); 
                       
                        
            }
            else
            {
                
                RequestDispatcher rd=request.getRequestDispatcher("UploadLogin.jsp");  
        rd.include(request, response); 
         out.print("<br><br><br><h1><center>Sorry UserName or Password Error!"+"</h1>");
                
                
            }           
           
            
        }
        catch(Exception ex)
        {
            //ex.printStackTrace();
            System.out.println(ex);
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
