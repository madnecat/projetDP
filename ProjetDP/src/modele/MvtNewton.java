package modele;

public class MvtNewton extends DecorateurBille
{

	public MvtNewton(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		billeDécoré.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);	
	}

	
}
