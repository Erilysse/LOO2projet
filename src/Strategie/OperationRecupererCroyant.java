package Strategie;

import divinae.Carte;
import divinae.Jeu;
import divinae.Joueur;

public class OperationRecupererCroyant implements Strategy {

	@Override
	public void faire(Jeu jeu, Joueur joueur) {
		int index = (int)(7*Math.random());
		Carte carte = joueur.getMainjoueur().getMain().get(index);
		String nom = joueur.getDiviniteRepresentee().getNom();
		if(!joueur.getCampjoueur().getCamp().isEmpty()){
			System.out.println(nom + " rattache un Croyant � son guide Spirituel " + carte.getNom());
			joueur.getCampjoueur().getCamp().get(0).rattacherCroyants(joueur.getCentre().donnerCroyant(0));
		}

	}

}
