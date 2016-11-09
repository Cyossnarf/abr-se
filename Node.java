package abr;

public class Node {
	private int valeur;
	private ABR filsDroit;
	private ABR filsGauche;
	
	public Node(int value) {
		this.valeur = value;
		this.filsDroit = new ABR();
		this.filsGauche = new ABR();
	}
	
	public int getValeur() {
		return this.valeur;
	}
	
	public ABR getFilsDroit() {
		return this.filsDroit;
	}
	
	public ABR getFilsGauche() {
		return this.filsGauche;
	}

}
