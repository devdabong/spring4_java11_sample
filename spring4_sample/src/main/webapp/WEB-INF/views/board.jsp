<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  Board </P>
hello<br><br>

<c:forEach var="board" items="${boardList }" >
	<c:out value="${board.bNo }" />
	<c:out value="${board.title }" />
	<c:out value="${board.content }" />
	<c:out value="${board.writer }" />
	<c:out value="${board.regDate }" />
</c:forEach>
</body>
</html>
