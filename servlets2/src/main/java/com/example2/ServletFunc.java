package com.example2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ServletFunc extends HttpServlet {
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        Connection conn=null;
        String name=request.getParameter("uname");
        String password=request.getParameter("upw");
        String email=request.getParameter("uemail");
        String mobileno=request.getParameter("umobile");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/registered","root","Sandy@*09");
            PreparedStatement pstmt=conn.prepareStatement("insert into usersreg(uname,upw,uemail,umobile) values(?,?,?,?)");
            pstmt.setString(1,name);
            pstmt.setString(2,password);
            pstmt.setString(3,email);
            pstmt.setString(4,mobileno);
            out.println(name);
            out.println(password);
            out.println(email);
            out.println(mobileno);
            int count=pstmt.executeUpdate();
            pstmt.executeUpdate();
            out.println(count);
            response.sendRedirect("home.jsp");
        }
        catch(Exception e)
        {
           out.println(e);
        }
        finally{
            try {
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}

