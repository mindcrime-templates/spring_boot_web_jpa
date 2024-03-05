<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<body>
		<h2><c:out value="${message}"></c:out></h2>
		
		<div align="left">
			<table border="1" cellpadding="2">
				<caption><h2>List of Accounts</h2></caption>
				<tr>
					<th>Account Id</th>
					<th>Legal Name</th>
					<th>Display Name</th>
					<th>Date Created</th>
				</tr>
				<c:forEach var="account" items="${accounts}">
					<tr>
						<td><c:out value="${account.accountId}"></c:out></td>
						<td><c:out value="${account.legalName}"></c:out></td>
						<td><c:out value="${account.displayName}"></c:out></td>
						<td><c:out value="${account.dateCreated}"></c:out></td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
		
	</body>
</html>