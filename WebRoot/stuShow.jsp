<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息页面</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>密码</th>
			<th>性别</th>
			<th>班级号</th>
		</tr>

		<tr>
			<td>${students.studentId }</td>
			<td>${students.studentName }</td>
			<td>${students.studentPwd }</td>
			<td>${students.sex }</td>
			<td>${students.classId }</td>
		</tr>
	</table>
</body>
</html>