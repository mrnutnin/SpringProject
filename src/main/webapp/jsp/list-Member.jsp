<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>List Member</title>
<link rel="stylesheet" href="/css/tableAdmin.css">
<meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
</head>

<script>
	function myFunction(email) {
		if (confirm('Are you sure?')== true)
    window.location.href = '/deleteMember?email='+email+'&permiss=admin';}
</script>

<body>
<a href="/"><img src="images/icons/favicon.ico" height="35" width="35"></a><br>
<h1 style="font-family:'Courier New'">
    List Member
</h1>
<p>
<form action="/overview" method="POST"> 
<input type="hidden" name="email" value="${email}">
<input type="hidden" name="password" value="${pass}">
<input type="submit" value="Back to Market">
</form>
</p>

<main>
<table  class="table-fill">

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