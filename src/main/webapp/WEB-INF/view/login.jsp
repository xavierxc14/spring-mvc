<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>

<jsp:include page="header.jsp"/>

<body>
<h1>Login</h1>
<form:form action="validateUser" method="post" modelAttribute="user">
    Nickname: <form:input path="nickName" type="text" id="nickname"/>
    Password: <form:input path="password" type="password" id="password"/>
    <input type="submit" value="Ingresar">
</form:form>
</body>
</html>