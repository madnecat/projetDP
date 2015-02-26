package modele;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

public abstract class DecorateurBille extends Bille
{
	protected Bille billeD�cor�;

	public DecorateurBille(Bille billeD�cor�)
	{
		//super(billeD�cor�.getPosition(),billeD�cor�.getRayon(),billeD�cor�.getVitesse(),billeD�cor�.getAcc�l�ration(),billeD�cor�.getCouleur());
		this.billeD�cor�=billeD�cor�;
	}
	
	@Override
	public abstract boolean collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur);
	
	@Override
	public abstract void gestionAcc�l�ration(Vector<Bille> billes);
	
	@Override
	public double masse() {
		return billeD�cor�.masse();
	}

	@Override
	public void d�placer(double deltaT) {
		billeD�cor�.d�placer(deltaT);
	}

	@Override
	public boolean gestionCollisionBilleBille(Vector<Bille> billes) {
		return billeD�cor�.gestionCollisionBilleBille(billes);
	}

	@Override
	public void dessine(Graphics g) {
		billeD�cor�.dessine(g);
	}

	@Override
	public String toString() {
		return billeD�cor�.toString();
	}

	@Override
	public Vecteur getPosition() {
		return billeD�cor�.getPosition();
	}

	@Override
	public void setPosition(Vecteur position) {
		billeD�cor�.setPosition(position);
	}

	@Override
	public double getRayon() {
		return billeD�cor�.getRayon();
	}

	@Override
	public void setRayon(double rayon) {
		billeD�cor�.setRayon(rayon);
	}

	@Override
	public Vecteur getVitesse() {
		return billeD�cor�.getVitesse();
	}

	@Override
	public void setVitesse(Vecteur vitesse) {
		billeD�cor�.setVitesse(vitesse);
	}

	@Override
	public Vecteur getAcc�l�ration() {
		return billeD�cor�.getAcc�l�ration();
	}

	@Override
	public void setAcc�l�ration(Vecteur acc�l�ration) {
		billeD�cor�.setAcc�l�ration(acc�l�ration);
	}

	@Override
	public int getClef() {
		return billeD�cor�.getClef();
	}

	@Override
	public void setClef(int clef) {
		billeD�cor�.setClef(clef);
	}

	@Override
	public Color getCouleur() {
		return billeD�cor�.getCouleur();
	}

	@Override
	public void setCouleur(Color couleur) {
		billeD�cor�.setCouleur(couleur);	
	}

}
