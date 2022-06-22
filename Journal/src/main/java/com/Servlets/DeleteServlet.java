package com.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			int noteId = Integer.parseInt(request.getParameter("note_id").trim());

			Session sessionLocal = FactoryProvider.getFactory().openSession();

			Transaction transaction = sessionLocal.beginTransaction();

			Note note = sessionLocal.get(Note.class, noteId);
			sessionLocal.delete(note);

			transaction.commit();

			sessionLocal.close();

			response.sendRedirect("show_all_notes.jsp");
		} catch (Exception e) {

		}
	}

}
