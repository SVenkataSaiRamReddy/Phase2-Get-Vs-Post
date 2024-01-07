package com.example.servletgetpost;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/PostHandler")
public class PostHandler extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer= resp.getWriter();
        String name=req.getParameter("name");
        String add=req.getParameter("address");
        writer.println("<html><body>");
        writer.println("Name :- "+name+"<br>Address :- "+add);
        writer.println("<br> Handled from Post method");
        writer.println("</body></html>");
    }
}
