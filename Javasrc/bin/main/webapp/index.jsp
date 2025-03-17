<!DOCTYPE html>
<html>
<head>
    <title>직원 목록</title>
</head>
<body>
    <h1>직원 목록</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>이름</th>
            <th>급여</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.salary}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>