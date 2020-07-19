<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询学生</title>
</head>
<body>
	<h2>查询学生-输入学号查询</h2>
	<form action = "${pageContext.request.contextPath }/findStuByStudentId.do" method = "post">
		学号:<input type = "text" name = "studentId" />
		<input type = "submit" value = "查询" />
	</form>
</body>
</html>