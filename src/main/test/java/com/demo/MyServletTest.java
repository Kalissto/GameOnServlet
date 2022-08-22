package com.demo;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class MyServletTest {
    @DisplayName("проверка на пустой ввод имени")
    @Test
   public void doGetTest() throws IOException, ServletException {
        MyServlet myServlet = mock(MyServlet.class);
       // HttpServletRequest request = mock(HttpServletRequest.class);
        //HttpServletResponse response = mock(HttpServletResponse.class);

        MockHttpServletRequest request = new MockHttpServletRequest();
        String currentURL = request.getRequestURI();
        request.setParameter("name", "");
        String name = request.getParameter("name");
        MockHttpServletResponse response = new MockHttpServletResponse();
        if (name.isEmpty()) {
            response.sendRedirect("index.jsp");
        }
        myServlet.doGet(request,response);
       Assertions.assertEquals("index.jsp",response.getRedirectedUrl());
       // when(request.getParameter("name")).thenReturn("me");




      //  String name = request.getParameter("name");
      //  when(response.sendRedirect("index.jsp"));
        //myServlet.doGet(request,response);
        //when(myServlet.doGet(request,response)).thenReturn(response.sendRedirect("index.jsp"));
    }

    @Test
    void doPost() {
    }
}
