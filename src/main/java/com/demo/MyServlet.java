package com.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer visitCounter = (Integer) session.getAttribute("visitCounter");
        if (visitCounter == null) {
            visitCounter = 1;
        } else {
            visitCounter++;
        }
        response.setCharacterEncoding("UTF-8");
        session.setAttribute("visitCounter", visitCounter);
        String name = request.getParameter("name");
        session.setAttribute("name", name);
        session.getAttribute("name");
        response.setContentType("text/html");
        if (name.isEmpty()) {
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("visitCounter", visitCounter);
            request.setAttribute("name", name);
            // request.getRequestDispatcher("one.jsp").forward(request, response);
            response.sendRedirect("one.jsp");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
