package modele.collision;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;
import modele.Bille;

public class Arret extends Collision
{

	public Arret(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		Collisions.collisionBilleContourAvecArretHorizontal(this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, largeur);
		Collisions.collisionBilleContourAvecArretVertical(this.getPosition(), this.getRayon(), this.getVitesse(), ordonn�eCoinHautGauche, hauteur);
	}
}
