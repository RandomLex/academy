<%@ page contentType="text/html; UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import = "com.barzykin.edu.academy.model.Teacher" %>
<%@ page import = "java.util.List" %>

<!DOCTYPE>
<html lang="ru">
  <head>
     <title>Teachers average salary</title>
  </head>

  <body>
    <%= "<p><span style='color: blue;'>Средняя зарплата следующих преподавателей: "
                + session.getAttribute("average")
                + "</span></p>"
    %>
    <%= session.getAttribute("teachers") %>
  </body>
</html>