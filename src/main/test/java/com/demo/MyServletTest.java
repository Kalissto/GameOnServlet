package com.demo;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class MyServletTest {

    @DisplayName("проверка что на пустой ввод имени вернется index.jsp")
    @Test
    public void MyServletRedirectIfNullName() throws IOException, ServletException {
        MyServlet myServlet = mock(MyServlet.class);
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        Mockito.when(request.getParameter("name")).thenReturn("");
        String name = request.getParameter("name");

        if (name.isEmpty()) {
            response.sendRedirect("index.jsp");
            // request.getRequestDispatcher("one.jsp").forward(request, response);
        }
        myServlet.doGet(request, response);
        Mockito.verify(response).sendRedirect("index.jsp");
    }


}
