package modele.collision;

import mesmaths.cinematique.Collisions;
import modele.Bille;

public class PasseMurailles extends Collision
{

	public PasseMurailles(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public boolean collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		Collisions.collisionBilleContourPasseMuraille( this.getPosition(), abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
		return false;
	}
}
