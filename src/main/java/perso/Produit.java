package perso;

public class Produit {
	
	String name;
	int quantite;
	
	public Produit() {
		super();
	}

	public Produit(String name, int quantite) {
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

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	

}
