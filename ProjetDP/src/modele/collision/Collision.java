package modele.collision;

import java.util.Vector;

import modele.Bille;
import modele.DecorateurBille;

public abstract class Collision extends DecorateurBille
{

	public Collision(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public abstract void collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur);

	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		billeDécoré.gestionAccélération(billes);
	}

}
