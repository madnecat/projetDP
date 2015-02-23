package modele;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import mesmaths.cinematique.Cinematique;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;

public class BilleStandard  extends Bille
{
	
	protected  Vecteur position;   // centre de la bille
	protected  double rayon;            // rayon > 0
	protected  Vecteur vitesse;
	protected  Vecteur acc�l�ration;
	protected int clef;                // identifiant unique de cette bille
	protected Color couleur;
	
	private static int prochaineClef = 0;
	
	public BilleStandard(Vecteur position, double rayon, Vecteur vitesse,Color couleur) 
	{
		this(position, rayon, vitesse, new Vecteur(), couleur);
	}
	
	public BilleStandard(Vecteur position, double rayon, Vecteur vitesse, Vecteur acc�l�ration,Color couleur) 
	{
		this.position = position;
		this.rayon = rayon;
		this.vitesse = vitesse;
		this.acc�l�ration = acc�l�ration;
		this.couleur = couleur;
		this.clef = prochaineClef ++;
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,	double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
	//ne se passe rien car si code ex�cut�, aucune collision choisie	
	}
	
	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		this.getAcc�l�ration().set(Vecteur.VECTEURNUL); // remise � z�ro du vecteur acc�l�ration        
	}
	
	@Override
	public double masse() {return ro*Geop.volumeSph�re(rayon);}

	/**
	 * mise � jour de position et vitesse � t+deltaT � partir de position et vitesse � l'instant t
	 * 
	 * modifie le vecteur position et le vecteur vitesse
	 * 
	 * laisse le vecteur acc�l�ration intact
	 *
	 * La bille subit par d�faut un mouvement uniform�ment acc�l�r�
	 * */
	public void d�placer( double deltaT)
	{
		Cinematique.mouvementUniform�mentAcc�l�r�( this.getPosition(), this.getVitesse(), this.getAcc�l�ration(), deltaT);	
	}
	
	/**
	 * gestion de l'�ventuelle  collision de cette bille avec les autres billes
	 *
	 * billes est la liste de toutes les billes en mouvement
	 * 
	 * Le comportement par d�faut est le choc parfaitement �lastique (c-�-d rebond sans amortissement)
	 * 
	 * @return true si il y a collision et dans ce cas les positions et vecteurs vitesses des 2 billes impliqu�es dans le choc sont modifi�es
	 * si renvoie false, il n'y a pas de collision et les billes sont laiss�es intactes 
	 * */
	public boolean gestionCollisionBilleBille(Vector<Bille> billes)
	{
		return OutilsBille.gestionCollisionBilleBille(this, billes);
	}
	
	public void dessine (Graphics g)
    {
	    int width, height;
	    int xMin, yMin;
	    
	    xMin = (int)Math.round(position.x-rayon);
	    yMin = (int)Math.round(position.y-rayon);
	
	    width = height = 2*(int)Math.round(rayon); 
	
	    g.setColor(couleur);
	    g.fillOval( xMin, yMin, width, height);
	    g.setColor(Color.CYAN);
	    g.drawOval(xMin, yMin, width, height);
    }
	
	public String toString() 
    {
		return "centre = " + position + " rayon = "+rayon +  " vitesse = " + vitesse + " acc�l�ration = " + acc�l�ration + " couleur = " + couleur + "clef = " + clef;
    }

	public Vecteur getPosition() {
		return position;
	}

	public void setPosition(Vecteur position) {
		this.position = position;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Vecteur getVitesse() {
		return vitesse;
	}

	public void setVitesse(Vecteur vitesse) {
		this.vitesse = vitesse;
	}

	public Vecteur getAcc�l�ration() {
		return acc�l�ration;
	}

	public void setAcc�l�ration(Vecteur acc�l�ration) {
		this.acc�l�ration = acc�l�ration;
	}

	public int getClef() {
		return clef;
	}

	public void setClef(int clef) {
		this.clef = clef;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	
}
	
	
