import java.util.* ;

public class Bataille {

	public static void main(String[] args) {
		
		ArrayList <Carte> cartes = new ArrayList <Carte>();// va contenir l'ensemble des cartes
		
		for (String couleur : Donnees.couleurs) {
			
			for (int valeur : Donnees.valeurs) {
				cartes.add(new Carte(couleur, valeur)); // trufle
				cartes.add(new Carte(couleur, valeur)); // coeur
				cartes.add(new Carte(couleur, valeur)); // pique
				cartes.add(new Carte(couleur, valeur));	// carreau
			}
			
		}
		
		// melanger les cartes
		Collections.shuffle(cartes);
		
		// diviser les cartes en deux tas;
		ArrayList <Carte>  ta1 = new ArrayList(cartes.subList(0, (int)(cartes.size()/2)));
		ArrayList <Carte>  ta2 = new ArrayList(cartes.subList((int)(cartes.size()/2) , cartes.size()));

		// les distribuer aux joueurs
		Joueur j1 = new Joueur("Jean", ta1);
		Joueur j2 = new Joueur("Vincent", ta2);

		// lancer la partie
		System.out.println("Bienvenue à la Bataille de cartes");
		System.out.println("--------------------------------------");
		System.out.println("Ceci est une partie entre " + j1.getNom() + " et " + j2.getNom());
		while (j1.getCompteur() != 0  && j2.getCompteur() !=0) {
			
			Carte c1 = j1.tirerCarte();
			Carte c2 = j2.tirerCarte();
		
			System.out.println("--------------------------------------");
			System.out.println(j1.getNom() + " tire " + c1 +" et " + j2.getNom() + " tire " + c2);
			System.out.println("--------------------------------------");
			if ( c1.getValeur() > c2.getValeur() ) {
				j1.ajouterCarte(c2); // il ajoute en bas de sa pille la carte du joueur 2
				j1.ajouterCarte(c1); // il ajoute en bas de sa pille sa carte qu'il a jouée 
				System.out.println(j1.getNom() + " prends les deux cartes");
				
			} else if (c1.getValeur() < c2.getValeur()) {
				j2.ajouterCarte(c1); // il ajoute en bas de sa pille la carte du joueur 1
				j2.ajouterCarte(c2); // il ajoute en bas de sa pille sa carte qu'il a jouée 
				System.out.println(j2.getNom() + " prends les deux cartes");
			}else {
				System.out.println("Les deux cartes sont égales, donc mises de côté");
			}
		}
		System.out.println("--------------------------------------");
		if(j1.getCompteur() != 0) {
			System.out.println(j1.getNom() + " a gangé la partie");
		}else {
			System.out.println(j2.getNom() + " a gangé la partie");
		}
		
	
		
		

	}

}
