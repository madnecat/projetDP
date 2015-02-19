package modele;

import java.util.Vector;

import mesmaths.cinematique.Collisions;

public class Rebond extends DecorateurBille
{

	public Rebond(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		Collisions.collisionBilleContourAvecRebond( this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}
	
	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		billeD�cor�.gestionAcc�l�ration(billes);
	}
}
