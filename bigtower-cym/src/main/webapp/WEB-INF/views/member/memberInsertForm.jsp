<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="/insert" method="post">
			<input type="text" name="mId"/>아이디<br/>
			<input type="password" name="mPw"/>패스워드<br/>
			<input type="text" name="mName"/>이름<br/>
			<select name="mLevel">
				<option value="관리자">관리자</option>
				<option value="회원">회원</option>
			</select>
			<input type="submit"/>
		</form>
	</div>
</body>
</html>