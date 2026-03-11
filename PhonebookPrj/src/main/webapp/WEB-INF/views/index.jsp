<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>redirect object:${_flash.message}</h1>
<h1>ModelAndView object:${message}</h1>
<ul>
<li onclick="location.href='/phonebook/insertform'">전화번호부 입력 폼</li>
<li onclick="location.href='/phonebook/list'">전화번호부 전체 출력</li>
<li onclick="location.href='/phonebook/view'">전화번호부 선택 출력</li>
<li onclick="location.href='/phonebook/updateform'">전화번호부 수정 폼</li>
<li onclick="location.href='/phonebook/delete'">전화번호부 삭제</li>
</ul>
</body>
</html>