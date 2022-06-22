<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Note Taker</title>
<%@include file ="allJS_CSS.jsp" %>
</head>
<body>
  	<div class="container">
  		<%@include file ="navbar.jsp" %>  	
  	</div>


	<div class="container">
		<h1>Add Notes Here</h1>
  	</div>
    

  	<div class="container">
		<form action="SaveNoteServlet" method="post">
			  <div class="form-group">
			    <label for="title">Note Title</label>
			    <input
			    	name="title" 
			    	type="text" 
			    	class="form-control" 
			    	id="title" 
			    	aria-describedby="emailHelp" 
			    	placeholder="Enter Here" required>
			  </div>
			  
			  <div class="form-group">
			    <label for="exampleInputPassword1">Note Content</label>
			    <textarea 
			    	name="content"
			    	class="form-control" 
			    	id="content" 
			    	placeholder="Enter content here" 
			    	required></textarea>
			  </div>
			  <div class="text-center"><button type="submit" class="btn btn-primary">Submit</button></div>
		</form>
  	</div>
  	
</body>
</html>