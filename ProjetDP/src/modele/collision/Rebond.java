package modele.collision;

import mesmaths.cinematique.Collisions;
import modele.Bille;

public class Rebond extends Collision
{

	public Rebond(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public boolean collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		return Collisions.collisionBilleContourAvecRebond( this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
