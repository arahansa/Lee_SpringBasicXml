<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title> Happy world </title>
</head>
<body>
form

@ModelAttribute 에게 보내는 폼
<form action="/test/save" method="post">
	나이 : <input type="text" name="age">
	이름 : <input type="text" name="name">
	<input type="submit" />
</form>

<hr>
<br>

Model 에게 보내는 폼
<form action="/test/save2" method="post">
	나이 : <input type="text" name="age">
	이름 : <input type="text" name="name">
	<input type="submit" />
</form>

<hr>
<br>

Sting, int 로 보내는 폼
<form action="/test/save3" method="post">
	나이 : <input type="text" name="age">
	이름 : <input type="text" name="name">
	<input type="submit" />
</form>

</body>
</html>