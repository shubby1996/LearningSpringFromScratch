<!doctype html>

<%@page import="com.helper.FactoryProvider"%>
<%@page import="com.entities.Note"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.query.Query"%>



<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<%@include file ="allJS_CSS.jsp" %>
	
    <title>All Notes</title>
  </head>
  <body>
  
  
  	<div class="container">
  	
  		<%@include file ="navbar.jsp" %>
		
		<br/>
		
	  	<div class= "row">
	  	
	  		<div class="col-12">
	  			<%  	
					Session sessionLocal = FactoryProvider.getFactory().openSession();
				
					Query q = sessionLocal.createQuery("from Note");
				
					java.util.List<Note> list = q.list();
				
					for (Note note : list) {
				%>
	
					<div class="card"">
						  <img class="card-img-top" style="max-width:100px; m-4" src="image/sticky-note.png" alt="Card image cap">
						  <div class="card-body">
						    <h5 class="card-title"><%= note.getTitle() %></h5>
						    <p class="card-text"><%= note.getContent() %></p>
						    <p class="card-text"><%= note.getDate() %></p>
						    <a href="DeleteServlet?note_id=<%= note.getId()%>" class="btn btn-danger">Delete</a>
						    <a href="editPage.jsp?note_id=<%= note.getId()%>" class="btn btn-primary">Update</a>
						  </div>
					</div>
				<% 		
						
						//out.println(note.getId()+" "+note.getTitle()+" "+note.getContent()+" "+note.getDate()+"<br/>");
						
					}
				
					sessionLocal.close();
			  	%>	
	  		
	  		
	  		</div>
	  	
	  	</div>
  
    </div>


      </body>
</html>