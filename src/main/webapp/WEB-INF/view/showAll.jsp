<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All employees</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
    <c:forEach var="items" items="${peoples}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${items.id}"/>
        </c:url>

        <c:url var="delEmp" value="/deleteEmployees">
            <c:param name="empId" value="${items.id}"/>
        </c:url>

        <tr>
            <td>${items.name}</td>
            <td>${items.surname}</td>
            <td>${items.department}</td>
            <td>${items.salary}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick= "window.location.href = '${delEmp}'"/>
            </td>

        </tr>
    </c:forEach>
</table>
<br><br>
    <input type="button" value="ADD"
        onclick="window.location.href = 'saveEmp'">
</body>
</html>
