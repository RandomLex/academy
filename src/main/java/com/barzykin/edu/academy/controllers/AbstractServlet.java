package com.barzykin.edu.academy.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class AbstractServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        setUtf8(resp);
    }

    private void setUtf8(HttpServletResponse resp) {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
    }

}
