package com.example1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class calci extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<html><body>");
        out.println("<center>");
        int c=0;
        int n1 = Integer.parseInt(req.getParameter("fnum"));
        int n2 = Integer.parseInt(req.getParameter("lnum"));
        String op=req.getParameter("btn");
        if(op.equals("+"))
        {
                c=n1+n2;
                out.println("<h3>ADDITION ACTION PERFORMED AND RESULT IS </h3>"+c);
        }
        if(op.equals("-"))
        {
            c=n1-n2;
            out.println("<h3>SUBRACTION ACTION PERFORMED AND RESULT IS </h3>"+c);
        }
        if(op.equals("*"))
        {
            c=n1*n2;
            out.println("<h3>MULTIPLICATION ACTION PERFORMED AND RESULT IS </h3>"+c);
        }
        if(op.equals("/"))
        {
            c=n1/n2;
            out.println("<h3>DIVISION ACTION PERFORMED AND RESULT IS </h3>"+c);
        }
        out.println("</center></body></html>");
    }
}





