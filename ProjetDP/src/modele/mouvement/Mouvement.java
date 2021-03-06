package modele.mouvement;

import java.util.Vector;

import modele.Bille;
import modele.DecorateurBille;

public abstract class Mouvement extends DecorateurBille
{

	public Mouvement(Bille billeDécoré) 
	{
		super(billeDécoré);
	}
	
	@Override
	public boolean collisionContour(double abscisseCoinHautGauche,	double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		return billeDécoré.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}
	
	@Override
	public abstract void gestionAccélération(Vector<Bille> billes);
}
