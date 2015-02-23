package modele.mouvement;

import java.util.Vector;

import modele.Bille;
import modele.DecorateurBille;

public abstract class Mouvement extends DecorateurBille
{

	public Mouvement(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}
	
	@Override
	public void collisionContour(double abscisseCoinHautGauche,	double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		billeD�cor�.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}
	
	@Override
	public abstract void gestionAcc�l�ration(Vector<Bille> billes);
}
