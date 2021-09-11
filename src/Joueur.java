import java.util.ArrayList ;


public class Joueur {
	private ArrayList <Carte>  tas;
	private int compteur ;
	private String nom;
	
	public Joueur (String nom, ArrayList <Carte>  tas) {
		this.tas = tas;
		this.nom = nom;
		compteur = tas.size();
	}

	public String getNom() {
		return nom;
	}
	
	// sort la carte en haut de la pille
	public Carte tirerCarte() {
		Carte carte = tas.get(0);
		tas.remove(0);
		compteur--;
		return carte ;
		
	}
	
	// ajoute la carte gagnée en bas de la pille
	public void ajouterCarte(Carte carte) {
		tas.add(carte);
		compteur ++;
	}

	public int getCompteur() {
		return compteur;
	}



	
	
}
