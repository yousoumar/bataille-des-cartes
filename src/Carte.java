
public class Carte {
	
	private String couleur;
	private int valeur;
	
	public Carte(String couleur, int valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}
	
	public String toString () {
		String valeurAafficher;
		switch(valeur) {
		case 13 :
			valeurAafficher = "le Roi";
			break;
		case 12 :
			valeurAafficher = "la Dame";
			break;
		case 11 :
			valeurAafficher = "le Vallet";
			break;
		case 1 :
			valeurAafficher = "l'As";
			break;
		default :
			valeurAafficher = "un " + valeur;
		}
		return valeurAafficher;
	}

	public int getValeur() {
		if (valeur == 1) return 14;
		return valeur;
	}


}
