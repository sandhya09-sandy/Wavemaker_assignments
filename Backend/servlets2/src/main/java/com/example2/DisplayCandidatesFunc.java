package com.example2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DisplayCandidatesFunc extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Connection conn=null;
        PrintWriter out=resp.getWriter();
        String query="select * from usersreg";
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registered", "root", "Sandy@*09");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                    //Display values
                    out.println("NAME: " + rs.getString("uname"));
                    out.println("PASSWORD: " + rs.getString("upw"));
                    out.println("EMAIL: " + rs.getString("uemail"));
                    out.println("MOBILE NUM: " + rs.getString("umobile"));
                    out.println();
                }
            }
         catch (SQLException e)
         {
             e.printStackTrace();
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
