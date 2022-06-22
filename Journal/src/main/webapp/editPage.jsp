<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<%@include file ="allJS_CSS.jsp" %>
	<%@page import="com.helper.FactoryProvider"%>
	<%@page import="com.entities.Note"%>
	<%@page import="org.hibernate.Session"%>
	<%@page import = "org.hibernate.Transaction"%>

	
    <title>Hello, world!</title>
  </head>
  <body>
  
  
  	<div class="container">
  	
  		<%@include file ="navbar.jsp" %>
  		<h1>Edit Note</h1>
  		<%
  		
  		int id = Integer.parseInt(request.getParameter("note_id").trim());
  		
  		Session sessionVar = FactoryProvider.getFactory().openSession();
		Transaction tx = sessionVar.beginTransaction();
		
		
		tx.commit();
		sessionVar.close();
  		
  		%>
  	</div>
  
    

      </body>
</html>