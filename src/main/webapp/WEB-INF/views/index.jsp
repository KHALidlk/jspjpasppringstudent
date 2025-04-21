<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Message</title>
</head>
<body>
<h1>${message}</h1>
<h2>Students:</h2>
<ul>
  <c:forEach var="student" items="${students}">
        <li>Name: ${student.name}</li>
        <li>Email: ${student.email}</li>
      <c:if test="${not empty student.notes}">
          <li>Notes:
              <ul>
                  <c:forEach var="note" items="${student.notes}" varStatus="status">
                      <li>Note Modul${status.index + 1}: ${note}</li>
                  </c:forEach>
              </ul>
          </li>
      </c:if>
    </c:forEach>
</ul>
<h2>Delete Student</h2>
<form action="hello" method="post">
    <div>
        <label for="id">Student ID:</label>
        <input type="number" id="id" name="id" >
    </div>
    <button type="submit">Delete Student</button>
</form>
</body>
</body>
</html>
