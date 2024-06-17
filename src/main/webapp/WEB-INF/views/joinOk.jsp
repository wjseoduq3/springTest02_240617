<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 확인</title>
</head>
<body>
	<h3>[가입하신 회원정보]</h3>
	<h5>아이디 : ${mdto.memberid}이고</h5><br>
	<h5>비밀번호는 ${mdto.memberpw}입니다.</h5><br>
	<h5>이름 : ${mdto.membername}이고</h5><br>
	<h5>나이 : ${mdto.memberage}입니다.</h5><br>
	<h5>이메일 : ${mdto.memberemail}입니다.</h5>
</body>
</html>