package perso;

public class Produit {
	
	String name;
	String quantite;
	
	public Produit() {
		super();
	}

	public Produit(String name, String quantite) {
		super();
		this.name = name;
		this.quantite = quantite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	
	

}
