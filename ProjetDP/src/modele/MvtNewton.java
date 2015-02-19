package modele;

import java.util.Vector;

import modele.Bille;
import modele.OutilsBille;

public class MvtNewton extends DecorateurBille
{

	public MvtNewton(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		billeD�cor�.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);	
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		billeD�cor�.gestionAcc�l�ration(billes);

		this.getAcc�l�ration().ajoute(OutilsBille.gestionAcc�l�rationNewton(this, billes));     // contribution de l'acc�l�ration due � l'attraction des autres billes
	}
}
