package modele;

import java.util.Vector;

public abstract class DecorateurBille extends Bille
{
	protected Bille billeD�cor�;

	public DecorateurBille(Bille billeD�cor�)
	{
		super(billeD�cor�.getPosition(),billeD�cor�.getRayon(),billeD�cor�.getVitesse(),billeD�cor�.getAcc�l�ration(),billeD�cor�.getColor());
		this.billeD�cor�=billeD�cor�;
	}
	
	@Override
	public abstract void collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur);
	
	@Override
	public abstract void gestionAcc�l�ration(Vector<Bille> billes);
}
