package modele.collision;

import mesmaths.cinematique.Collisions;
import modele.Bille;

public class Rebond extends Collision
{

	public Rebond(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public boolean collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		return Collisions.collisionBilleContourAvecRebond( this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}

}
