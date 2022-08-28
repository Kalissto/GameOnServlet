package com.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OneServlet", value = "/one")
public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String oneRadio = request.getParameter("oneRadio");
        System.out.println(oneRadio);
        writer.println("<p>Gender: " + oneRadio + "</p>");
        if (oneRadio.contains("1")) {
            response.sendRedirect("two.jsp");

        }
        if (oneRadio.contains("2")) {
            response.sendRedirect("defeat1.jsp");
        }
    }

}
