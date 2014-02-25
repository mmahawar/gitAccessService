<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello ${userInfo.name}!</h1>

	<P>Your git user name is <b>${userInfo.loginId}</b> and you work for <b>${userInfo.company}</b>.</P>
</body>
</html>
