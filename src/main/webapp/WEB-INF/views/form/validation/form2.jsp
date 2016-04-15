<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title> Happy world </title>
<style>
	div.error{ color: red;}
</style>
</head>
<body>
form

@ModelAttribute 에게 보내는 폼

<form:form modelAttribute="firstDomain"  action="/test/validation/save2" method="post">
나이 : <form:input path="age" /> <form:errors path="age"  />  <!-- <input type="text" name="age"> --> <br>
이름 : <form:input path="name"/> <form:errors path="name" cssClass="error" element="div" /> <br>
<input type="submit" />
</form:form>

<%-- 
<form action="/test/validation/save" method="post">
	나이 : <input type="text" name="age">
	이름 : <input type="text" name="name">
	<input type="submit" />
</form>
 --%>
<hr>
<br>


</body>
</html>