package modele;

import java.util.Vector;

import mesmaths.mecanique.MecaniquePoint;

public class MvtFrottement extends DecorateurBille
{

	public MvtFrottement(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,	double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		billeD�cor�.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}
	
	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		billeD�cor�.gestionAcc�l�ration(billes);
		
		this.getAcc�l�ration().ajoute(MecaniquePoint.freinageFrottement(super.masse(),super.getVitesse())); // contribution de l'acc�l�ration due au frottement dans l'air
	}

}
