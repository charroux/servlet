package perso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListeProduitsServlet
 */
public class ListeProduitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeProduitsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Produit> produits = new ArrayList<Produit>();
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()){
			String name = names.nextElement();
			String nom = null;
			int quantite = 0;
			if(name.startsWith("nom")){
				nom = request.getParameter(name);
			}
			if(name.startsWith("quantite")){
				quantite = Integer.parseInt(request.getParameter(name));
			}
			Produit produit = new Produit(nom, quantite);
			
			produits.add(produit);
		}
		
		request.setAttribute("produits", produits);
		
		getServletContext().getRequestDispatcher("/listeProduits.jsp").forward(request, response);
	}

}
