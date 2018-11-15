<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>List Member</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<script>
	function myFunction(email) {
		if (confirm('Are you sure?')== true)
		 window.location.href = '/deleteMember?email='+email;}
</script>
<body>
<a href="/"><img src="images/icons/favicon.ico" height="35" width="35"></a><br>
<h1 style="font-family:'Courier New'">
    List Member
</h1>
<p style="font-family:'Courier New';color:black;">
	<a href="/overview?email=${email}&password=${pass}" method="POST" style="color:White;">Back to overview</a>
</p>

<main>
  <table>

  <!-- Table Head -->
    <thead>
      <tr>
        <th>Email</th>
		<th>Password</th>
        <th>Username</th>
        <th>Phone</th>
		<th>#</th>
      </tr>
    </thead>

 <!-- Table Foot -->
    <tfoot>
      <tr>
        <th colspan='7'></th>
      </tr>
    </tfoot>

 <!-- Table Body -->
    <tbody>

      <c:forEach items="${memberList}" var="member">
			<tr>
         		<td>${member.email}</td>
				<td>${member.password}</td>
				<td>${member.username}</td>
				<td>${member.phone}</td>
         		<td><button onclick="myFunction('${member.email}')">delete</button></td>
         	</tr>
		</c:forEach>

    </tbody>
   

  </table>
</main>
 
<script src="js/index.js"></script>
	
		
</body>
</html>