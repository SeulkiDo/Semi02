<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		if(${loginEmail != null}){
			location.href = "write.board";
		}else{
			alert("로그인 후 이용해 주세요.");
			location.href = "LoginForm.members";
		}
	</script>
</body>
</html>