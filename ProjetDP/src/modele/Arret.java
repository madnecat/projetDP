package modele;

import mesmaths.cinematique.Collisions;

public class Arret extends DecorateurBille
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
