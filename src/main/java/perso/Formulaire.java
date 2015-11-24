package perso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Formulaire extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException, ServletException{
		String age = request.getParameter("age");
		System.out.println("get : " + age );
	}

	public void doPost(HttpServletRequest request, HttpServletResponse resp) throws IOException, ServletException{
		String nom = request.getParameter("nom");
		System.out.println("post : " + nom);
	}
	
}
