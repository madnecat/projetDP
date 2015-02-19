package general;

import java.awt.Color;
import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import modele.Arret;
import modele.Bille;
import modele.BilleStandard;
import modele.MvtFrottement;
import modele.MvtNewton;
import modele.MvtPesanteur;
import modele.PasseMurailles;
import modele.Rebond;
import vues.CadreAngryBalls;

/**
 * Gestion d'une liste de billes en mouvement ayant toutes un comportement
 * diff�rent
 * 
 * Id�al pour mettre en place le DP decorator
 * */
public class TestAngryBalls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ------------------- cr�ation de la liste (pour l'instant vide) des
		// billes -----------------------

		Vector<Bille> billes = new Vector<Bille>();

		// ---------------- cr�ation de la vue responsable du dessin des billes
		// -------------------------

		CadreAngryBalls cadre = new CadreAngryBalls(
				"Angry balls",
				"Animation de billes ayant des comportements diff�rents. Situation id�ale pour mettre en place le DP Decorator",
				billes);

		cadre.montrer(); // on rend visible la vue

		// ------------- remplissage de la liste avec 4 billes
		// -------------------------------

		double xMax, yMax;
		double vMax = 0.1;
		xMax = cadre.largeurBillard(); // abscisse maximal
		yMax = cadre.hauteurBillard(); // ordonn�e maximale

		double rayon = 0.05 * Math.min(xMax, yMax); // rayon des billes : ici
													// toutes les billes ont le
													// m�me rayon, mais ce n'est
													// pas obligatoire

		Vecteur p0, p1, p2, p3, p4, v0, v1, v2, v3, v4; // les positions des
														// centres des billes et
														// les vecteurs vitesse
														// au d�marrage.
														// Elles vont �tre
														// choisies
														// al�atoirement

		// ------------------- cr�ation des vecteurs position des billes
		// ---------------------------------

		p0 = Vecteur.cr�ationAl�atoire(0, 0, xMax, yMax);
		p1 = Vecteur.cr�ationAl�atoire(0, 0, xMax, yMax);
		p2 = Vecteur.cr�ationAl�atoire(0, 0, xMax, yMax);
		p3 = Vecteur.cr�ationAl�atoire(0, 0, xMax, yMax);
		p4 = Vecteur.cr�ationAl�atoire(0, 0, xMax, yMax);

		// ------------------- cr�ation des vecteurs vitesse des billes
		// ---------------------------------

		v0 = Vecteur.cr�ationAl�atoire(-vMax, -vMax, vMax, vMax);
		v1 = Vecteur.cr�ationAl�atoire(-vMax, -vMax, vMax, 0);
		v2 = Vecteur.cr�ationAl�atoire(-vMax, -vMax, vMax, vMax);
		v3 = Vecteur.cr�ationAl�atoire(-vMax, -vMax, vMax, vMax);
		v4 = Vecteur.cr�ationAl�atoire(-vMax, -vMax, vMax, vMax);

		// --------------- ici commence la partie � changer
		// ---------------------------------
		
		Bille testRebond= new MvtPesanteur(new MvtFrottement(new Rebond(new BilleStandard(p0, rayon, v0, Color.red))),new Vecteur(0,0.001));
		billes.add(testRebond);
		/*
		Bille testRebond1= new MvtPesanteur(new Rebond(new BilleStandard(p1, rayon, v1, Color.blue)),new Vecteur(0,0.001));
		billes.add(testRebond1);
		Bille testRebond2= new MvtPesanteur(new Rebond(new BilleStandard(p2, rayon, v2, Color.cyan)),new Vecteur(0,0.001));
		billes.add(testRebond2);
		
		Bille testArret= new MvtNewton (new Arret(new BilleStandard(p1, rayon, v1, Color.blue)));
		billes.add(testArret);
		
		Bille testPasseMurailles= new PasseMurailles(new BilleStandard(p2, rayon, v2, Color.cyan));
		billes.add(testPasseMurailles);
		*/
		
		// ---------------------- ici finit la partie � changer
		// -------------------------------------------------------------

		System.out.println("billes = " + billes);

		// -------------------- cr�ation de l'objet responsable de l'animation
		// (c'est un thread s�par�) -----------------------

		AnimationBilles animationBilles = new AnimationBilles(billes, cadre);

		// ----------------------- mise en place des �couteurs de boutons qui
		// permettent de contr�ler (un peu...) l'application -----------------

		EcouteurBoutonLancer �couteurBoutonLancer = new EcouteurBoutonLancer(
				animationBilles);
		EcouteurBoutonArr�ter �couteurBoutonArr�ter = new EcouteurBoutonArr�ter(
				animationBilles);

		// ------------------------- activation des �couteurs des boutons et �a
		// tourne tout seul ------------------------------

		cadre.lancerBilles.addActionListener(�couteurBoutonLancer); // maladroit
																	// mais ne
																	// changez
																	// rien
		cadre.arr�terBilles.addActionListener(�couteurBoutonArr�ter); // maladroit
																		// mais
																		// ne
																		// changez
																		// rien

	}

}
