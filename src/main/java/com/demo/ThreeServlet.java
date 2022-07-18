package com.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ThreeServlet", value = "/three")
public class ThreeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String twoRadio = request.getParameter("twoRadio");
        System.out.println(twoRadio);
        writer.println("<p>Gender: " + twoRadio + "</p>");
        if (twoRadio.contains("1")) {
            response.sendRedirect("win.jsp");
        }
        if (twoRadio.contains("2")) {
            response.sendRedirect("defeat3.jsp");
        }
    }
}
