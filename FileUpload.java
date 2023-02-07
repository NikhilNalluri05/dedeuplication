/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deduplication;

import com.commondb.Common_DB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Key;
import java.sql.ResultSet;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Devaa
 */
public class FileUpload extends HttpServlet {
    
         
         
    
    
    
    
    
    
    private static Key generateKey(String productkey) throws Exception {

    
     
      System.out.println("Run time aggruments"+productkey);
        String keyValue = "";
        ResultSet rs1 = Common_DB.ViewParticularData("debuplication", "registration", "userproductkey", productkey);
        String group2 = "";
        if (rs1.next()) {
            group2 = rs1.getString("userproductkey");
            
            System.out.println(" deva head key =="+group2);
        }
        System.out.println("WWWWWWWWWW" + group2);
        Key key = new SecretKeySpec(group2.getBytes(), "AES");
        return key;
    }
    
    
    
    
    
    
    
    
    

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
            out.println("<title>Servlet FileUpload</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileUpload at " + request.getContextPath() + "</h1>");
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
      
        
        
        
         String name = null;
          
          
           HttpSession session1 = request.getSession(true); 
            String productkey =session1.getAttribute("productkey").toString();
        String group = session1.getAttribute("Username").toString();
        
        
        System.out.println("FFFFFFFFFF" + productkey);
        System.out.println("deva i will checking");
        
        final String UPLOAD_DIRECTORY = "E:/" + group;
        System.out.println("file cheking "+UPLOAD_DIRECTORY);
        
         
        System.out.println("-------------------------------------");
        String TempUploadDirectory = "E:/temp10";
        System.out.println("AAAAAAAAAAAAAAAAAAAAA" + TempUploadDirectory);
        File file = new File(TempUploadDirectory);
         if (!(file.exists())) {
            file.mkdir();
        }
         
         if (ServletFileUpload.isMultipartContent(request)) {
            try {
                String nn = "";
                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest(request);

                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        name = new File(item.getName()).getName();
                        item.write(new File(TempUploadDirectory + File.separator + name));
                        nn = name;
                        
                        System.out.println("deva your file upload file name"+name);
                    }
                }
                
                 Key key1 = generateKey(productkey);

                AESEncrypter encrypter = new AESEncrypter((SecretKey) key1);     
                encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY + File.separator + nn));


                System.out.println("name==fff" + UPLOAD_DIRECTORY + File.separator + nn);

              String hashvalue=  mdhashing.shaa(UPLOAD_DIRECTORY + File.separator + nn);
                System.out.println("-----"+hashvalue);
                  Common_DB.InsertTable("debuplication", "insert into ownerprofile values('"+group+"','"+name+"','"+hashvalue+"')");

                //File uploaded successfully
                  System.out.println("file upload successfuly");
                request.setAttribute("message","FileUploaded Successfully");
        
            }
        catch (Exception ex) {
                request.setAttribute("message", "File Upload Failed due to " + ex);
            }

                
                
                
                
                
   
        }
        
        else {
            request.setAttribute("message",
                    "Sorry this Servlet only handles file upload request");
        }

        request.getRequestDispatcher("/result.jsp").forward(request, response);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
