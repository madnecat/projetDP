package modele;

import java.util.Vector;

import mesmaths.cinematique.Collisions;

public class PasseMurailles extends DecorateurBille
{

	public PasseMurailles(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		Collisions.collisionBilleContourPasseMuraille( this.getPosition(), abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		billeDécoré.gestionAccélération(billes);
	}
}
