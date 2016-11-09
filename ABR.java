package abr;

public class ABR {
	private Node racine;
	
	public ABR() {
		this.racine = null;
	}
	
	public boolean isEmpty() {
		return racine == null;
	}
	
	public void addNode(int value) {
		this.racine = new Node(value);
	}
	
	public void insert(int value) {
		if (this.isEmpty()) {
			this.addNode(value);
		} else {
			int racValeur = racine.getValeur();
			if (value > racValeur) {
				ABR filsDroit = racine.getFilsDroit();
				filsDroit.insert(value);
			} else if (value < racValeur) {
				ABR filsGauche = racine.getFilsGauche();
				filsGauche.insert(value);
			}
		}
	}
	
	public static void main(String args[]) {
		
	}

}
