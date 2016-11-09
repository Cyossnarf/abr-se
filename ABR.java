package abr;

public class ABR {
	private Node racine;
	
	public ABR() {
		this.racine = null;
	}
	
	public Node getRacine() {
		return this.racine;
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
	
	public int nbElements() {
		if (this.isEmpty()) {
			return 0;
		} else {
			ABR filsDroit = racine.getFilsDroit();
			ABR filsGauche = racine.getFilsGauche();
			return 1 + filsDroit.nbElements() + filsGauche.nbElements();
		}
	}
	
	public String makeString() {
		if (this.isEmpty()) {
			return "[]";
		} else {
			int racValeur = racine.getValeur();
			String stringDroit = racine.getFilsDroit().makeString();
			String stringGauche = racine.getFilsGauche().makeString();
			return "(" + stringGauche + ", " + racValeur + ", " + stringDroit + ")";
		}
	}
	
	public static void main(String args[]) {
		ABR essai = new ABR();
		essai.insert(8);
		essai.insert(3);
		essai.insert(10);
		essai.insert(1);
		essai.insert(6);
		System.out.println(essai.makeString());
		
	}

}
