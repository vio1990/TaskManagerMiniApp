<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Task Manager</title>
</head>
<body>
<h1>TODO List</h1>
<div>
    <form action="TaskServlet" method="post">
        <label>Task name</label>
        <input name="name" type="text" autofocus placeholder="Please enter task name">
        <br><br>
        <label>Task category</label>
        <input name="category" type="text" autofocus placeholder="Please enter task category">
        <br><br>
        <input type="submit" value="Add task">
    </form>
</div>
</body>
</html>
