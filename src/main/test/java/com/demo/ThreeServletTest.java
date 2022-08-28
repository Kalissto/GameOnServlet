package com.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.mock;

public class ThreeServletTest {
    @Test
    public void postRedirectOnWin()throws IOException, ServletException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        Mockito.when(request.getParameter("oneRadio")).thenReturn("1");
        String radio=request.getParameter("oneRadio");
        if (radio.contains("1")){
            response.sendRedirect("win.jsp");
        }
        new MyServlet().doPost(request, response);
        Mockito.verify(response).sendRedirect("win.jsp");

    }
    @Test
    public void postRedirectOnDefeat3()throws IOException, ServletException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        Mockito.when(request.getParameter("oneRadio")).thenReturn("2");
        String radio=request.getParameter("oneRadio");
        if (radio.contains("2")){
            response.sendRedirect("defeat3.jsp");
        }
        new MyServlet().doPost(request, response);
        Mockito.verify(response).sendRedirect("defeat3.jsp");

    }
}
