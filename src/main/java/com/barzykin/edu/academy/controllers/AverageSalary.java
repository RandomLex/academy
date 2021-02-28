package com.barzykin.edu.academy.controllers;

import com.barzykin.edu.academy.model.Teacher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AverageSalary extends AbstractServlet {
    private List<Teacher> teachers;

    @Override
    public void init() {
        teachers = initModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int average = 0;
        for (Teacher teacher : teachers) {
            average += teacher.getSalary();
        }
        average /= teachers.size();

        PrintWriter writer = resp.getWriter();
        writer.write("<p><span style='color: blue;'>Средняя зарплата следующих преподавателей: "
                + average
                + "</span></p>");
        for (Teacher teacher : teachers) {
            writer.write(teacher + "<br>");
        }



    }

    private List<Teacher> initModel() {
         return List.of(
                new Teacher(1, "Alex", 1000),
                new Teacher(2, "Roman", 2000)
        );
    }

}
