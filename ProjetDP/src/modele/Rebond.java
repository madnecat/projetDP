package modele;

import mesmaths.cinematique.Collisions;

public class Rebond extends DecorateurBille
{

	public Rebond(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		Collisions.collisionBilleContourAvecRebond( this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}
	
}
