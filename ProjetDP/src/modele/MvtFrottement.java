package modele;

import java.util.Vector;

import mesmaths.mecanique.MecaniquePoint;

public class MvtFrottement extends DecorateurBille
{

	public MvtFrottement(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,	double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		billeDécoré.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}
	
	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		billeDécoré.gestionAccélération(billes);
		
		this.getAccélération().ajoute(MecaniquePoint.freinageFrottement(super.masse(),super.getVitesse())); // contribution de l'accélération due au frottement dans l'air
	}

}
