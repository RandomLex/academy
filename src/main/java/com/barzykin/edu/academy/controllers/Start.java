package com.barzykin.edu.academy.controllers;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Start extends AbstractServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        int x = Integer.parseInt(req.getParameter("x"));
        int y = Integer.parseInt(req.getParameter("y"));
        int sum = x + y;

        PrintWriter writer = resp.getWriter();

        writer.write("<p><span style='color: blue;'>");
        writer.write("Сумма: " + x + " + " + y + " = " + sum);
        writer.write("</span></p>");
    }
}
