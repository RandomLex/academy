<%@ page contentType="text/html; UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import = "com.barzykin.edu.academy.model.Teacher" %>
<%@ page import = "java.util.List" %>

<!DOCTYPE>
<html lang="ru">
  <head>
     <title>Teachers average salary</title>
  </head>

  <body>
    <%
                List<Teacher> teachers = List.of(
                                new Teacher(1, "Alex", 1000),
                                new Teacher(2, "Roman", 2000));

                int average = 0;
                for (Teacher teacher : teachers) {
                    average += teacher.getSalary();
                }
                average /= teachers.size();

                out.write("<p><span style='color: blue;'>Средняя зарплата следующих преподавателей: "
                        + average
                        + "</span></p>");
                for (Teacher teacher : teachers) {
                    out.write(teacher + "<br>");
                }
    %>
  </body>
</html>