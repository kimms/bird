<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>정보</h1>
	
	<ul>
		<li>아이디 : ${userKey.userId}</li>
		<li>이름 : ${userKey.name}</li>
		<li>성별 : ${userKey.gender}</li>
		<li>주소 : ${userKey.city}</li>
	</ul>
</body>
</html>