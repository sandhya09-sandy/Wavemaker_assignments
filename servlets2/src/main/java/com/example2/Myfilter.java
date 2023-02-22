package com.example2;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class  Myfilter implements Filter{

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        boolean status=false;
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        String name=req.getParameter("uname");
        String password=req.getParameter("upw");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registered","root","Sandy@*09");
            PreparedStatement pstmt = conn.prepareStatement("select uname,upw from usersreg where uname=? and upw=?");
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            status=rs.next();
            if(status)
            {
                RequestDispatcher dis=req.getRequestDispatcher("home.jsp");
                dis.forward(req,res);
                filterChain.doFilter(req,res);
            }
            else {
                RequestDispatcher dis=req.getRequestDispatcher("register.jsp");
                dis.forward(req,res);
            }
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            out.println(e);
        }

    }
}
