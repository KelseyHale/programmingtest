<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.13/af-2.1.3/cr-1.3.2/fh-3.1.2/r-2.1.0/sc-1.4.2/datatables.min.css"/>
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css"/>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.3.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.13/af-2.1.3/cr-1.3.2/fh-3.1.2/r-2.1.0/sc-1.4.2/datatables.min.js"></script>


</head>
<script>
$(document).ready( function () {
    $('#userTable').DataTable({
        scrollY: 200,
        deferRender: true,
        scroller: true
    });
} );
</script>

<style>
table {
	border: solid black 1px;
	box-shadow: 5px 5px grey;
	border-collapse: collapse;
}
table thead tr:first-child {
	border-bottom: solid black 1px;
	background: lightgrey;
	font-weight: bold;
}
td {
	padding: 10px;
}
.dataTables_filter {
	margin: 5px;
}
</style>
<body>

	<h1>Users</h1>
		<table id="userTable" class="display">
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Address</td>
				<td>City</td>
				<td>State</td>
				<td>Zip</td>
				<td>Active</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.getFirstName()}</td>
					<td>${user.getLastName()}</td> 
					<td>${user.getAddress()}</td>
					<td>${user.getCity()}</td>
					<td>${user.getState()}</td>
					<td>${user.getZip()}</td>
					<td>${user.getIsActive()}</td>
				</tr>
	</c:forEach>
		</tbody>
	</table>

</body>
</html>