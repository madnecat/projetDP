package modele.collision;

import mesmaths.cinematique.Collisions;
import modele.Bille;

public class PasseMurailles extends Collision
{

	public PasseMurailles(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public boolean collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		Collisions.collisionBilleContourPasseMuraille( this.getPosition(), abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
		return false;
	}
}
