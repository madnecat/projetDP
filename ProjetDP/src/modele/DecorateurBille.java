package modele;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

public abstract class DecorateurBille extends Bille
{
	protected Bille billeDécoré;

	public DecorateurBille(Bille billeDécoré)
	{
		//super(billeDécoré.getPosition(),billeDécoré.getRayon(),billeDécoré.getVitesse(),billeDécoré.getAccélération(),billeDécoré.getCouleur());
		this.billeDécoré=billeDécoré;
	}
	
	@Override
	public abstract boolean collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur);
	
	@Override
	public abstract void gestionAccélération(Vector<Bille> billes);
	
	@Override
	public double masse() {
		return billeDécoré.masse();
	}

	@Override
	public void déplacer(double deltaT) {
		billeDécoré.déplacer(deltaT);
	}

	@Override
	public boolean gestionCollisionBilleBille(Vector<Bille> billes) {
		return billeDécoré.gestionCollisionBilleBille(billes);
	}

	@Override
	public void dessine(Graphics g) {
		billeDécoré.dessine(g);
	}

	@Override
	public String toString() {
		return billeDécoré.toString();
	}

	@Override
	public Vecteur getPosition() {
		return billeDécoré.getPosition();
	}

	@Override
	public void setPosition(Vecteur position) {
		billeDécoré.setPosition(position);
	}

	@Override
	public double getRayon() {
		return billeDécoré.getRayon();
	}

	@Override
	public void setRayon(double rayon) {
		billeDécoré.setRayon(rayon);
	}

	@Override
	public Vecteur getVitesse() {
		return billeDécoré.getVitesse();
	}

	@Override
	public void setVitesse(Vecteur vitesse) {
		billeDécoré.setVitesse(vitesse);
	}

	@Override
	public Vecteur getAccélération() {
		return billeDécoré.getAccélération();
	}

	@Override
	public void setAccélération(Vecteur accélération) {
		billeDécoré.setAccélération(accélération);
	}

	@Override
	public int getClef() {
		return billeDécoré.getClef();
	}

	@Override
	public void setClef(int clef) {
		billeDécoré.setClef(clef);
	}

	@Override
	public Color getCouleur() {
		return billeDécoré.getCouleur();
	}

	@Override
	public void setCouleur(Color couleur) {
		billeDécoré.setCouleur(couleur);	
	}

}
