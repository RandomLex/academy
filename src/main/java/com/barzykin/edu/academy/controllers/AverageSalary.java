package com.barzykin.edu.academy.controllers;

import com.barzykin.edu.academy.model.Teacher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AverageSalary extends AbstractServlet {
    private List<Teacher> teachers;

    @Override
    public void init() {
        teachers = initModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int average = getAverage(teachers);
        HttpSession session = req.getSession(true);
        session.setAttribute("average", average);
        session.setAttribute("teachers", teachers);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/average-salary.jsp");
        requestDispatcher.forward(req, resp);
    }

    private int getAverage(List<Teacher> teachers) {
        int average = 0;
        for (Teacher teacher : teachers) {
            average += teacher.getSalary();
        }
        average /= teachers.size();
        return average;
    }

    private List<Teacher> initModel() {
         return List.of(
                new Teacher(1, "Alex", 1000),
                new Teacher(2, "Roman", 2000)
        );
    }

}
