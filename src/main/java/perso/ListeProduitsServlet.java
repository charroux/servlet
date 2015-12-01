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
		
		String nom = null;
		Integer quantite = null;
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()){
			String parameterName = names.nextElement();
			
			if(parameterName.startsWith("nom")){
				nom = request.getParameter(parameterName);
			}
			if(parameterName.startsWith("quantite")){
				quantite = Integer.parseInt(request.getParameter(parameterName));
			}
			if(nom!=null && quantite!=null){
				Produit produit = new Produit(nom, quantite);
				produits.add(produit);
				nom = null;
				quantite = null;
			}
		}
		
		request.setAttribute("produits", produits);
		
		getServletContext().getRequestDispatcher("/listeProduits.jsp").forward(request, response);
	}

}
