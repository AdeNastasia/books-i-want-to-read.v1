<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kaya
  Date: 26/10/2022
  Time: 11:00 pm
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Book list</title>
</head>
<body>
<h2>My book list</h2>
<table>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Reading Status</th>
        <th>Grade</th>
        <th>Resume</th>
    </tr>

    <c:forEach var="book" items="${allBooks}">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.readingStatus}</td>
            <td>${book.grade}</td>
            <td>${book.resume}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
