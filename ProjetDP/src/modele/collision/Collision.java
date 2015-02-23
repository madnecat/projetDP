package modele.collision;

import java.util.Vector;

import modele.Bille;
import modele.DecorateurBille;

public abstract class Collision extends DecorateurBille
{

	public Collision(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public abstract void collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur);

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		billeD�cor�.gestionAcc�l�ration(billes);
	}

}
