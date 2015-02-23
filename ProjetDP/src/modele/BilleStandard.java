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
	protected  Vecteur accélération;
	protected int clef;                // identifiant unique de cette bille
	protected Color couleur;
	
	private static int prochaineClef = 0;
	
	public BilleStandard(Vecteur position, double rayon, Vecteur vitesse,Color couleur) 
	{
		this(position, rayon, vitesse, new Vecteur(), couleur);
	}
	
	public BilleStandard(Vecteur position, double rayon, Vecteur vitesse, Vecteur accélération,Color couleur) 
	{
		this.position = position;
		this.rayon = rayon;
		this.vitesse = vitesse;
		this.accélération = accélération;
		this.couleur = couleur;
		this.clef = prochaineClef ++;
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,	double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
	//ne se passe rien car si code exécuté, aucune collision choisie	
	}
	
	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		this.getAccélération().set(Vecteur.VECTEURNUL); // remise à zéro du vecteur accélération        
	}
	
	@Override
	public double masse() {return ro*Geop.volumeSphère(rayon);}

	/**
	 * mise à jour de position et vitesse à t+deltaT à partir de position et vitesse à l'instant t
	 * 
	 * modifie le vecteur position et le vecteur vitesse
	 * 
	 * laisse le vecteur accélération intact
	 *
	 * La bille subit par défaut un mouvement uniformément accéléré
	 * */
	public void déplacer( double deltaT)
	{
		Cinematique.mouvementUniformémentAccéléré( this.getPosition(), this.getVitesse(), this.getAccélération(), deltaT);	
	}
	
	/**
	 * gestion de l'éventuelle  collision de cette bille avec les autres billes
	 *
	 * billes est la liste de toutes les billes en mouvement
	 * 
	 * Le comportement par défaut est le choc parfaitement élastique (c-à-d rebond sans amortissement)
	 * 
	 * @return true si il y a collision et dans ce cas les positions et vecteurs vitesses des 2 billes impliquées dans le choc sont modifiées
	 * si renvoie false, il n'y a pas de collision et les billes sont laissées intactes 
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
		return "centre = " + position + " rayon = "+rayon +  " vitesse = " + vitesse + " accélération = " + accélération + " couleur = " + couleur + "clef = " + clef;
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

	public Vecteur getAccélération() {
		return accélération;
	}

	public void setAccélération(Vecteur accélération) {
		this.accélération = accélération;
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
	
	
