<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 확인</title>
</head>
<body>
	<!-- <h3>[가입하신 회원정보]</h3>
	아이디 : ${mid}이고<br>
	비밀번호는 ${mpw}입니다.<br>
	이름 : ${mname}이고<br>
	나이 : ${mage}입니다.<br>
	이메일 : ${memail}입니다. -->
	아이디 : ${mdto.memberid}이고<br>
	비밀번호는 ${mdto.memberpw}입니다.<br>
	이름 : ${mdto.membername}이고<br>
	나이 : ${mdto.memberage}입니다.<br>
	이메일 : ${mdto.memberemail}입니다.
</body>
</html>