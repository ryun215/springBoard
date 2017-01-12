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
		
		<form action="/fileUpload" method="post"  enctype="multipart/form-data">
			<input type="text" name="fileName"/>파일이름<br/>
			<input type="text" name="fileAuth"/>파일작성자<br/>
			<input type="file" name="multipartFile"/>파일입력<br/>
			<input type="submit"/>업로드
		</form>
	</div>
</body>
</html>