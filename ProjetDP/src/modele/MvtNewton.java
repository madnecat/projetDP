package modele;

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

	
}
