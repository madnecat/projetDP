package modele;

import java.awt.Color;

import mesmaths.geometrie.base.Vecteur;

public class BilleStandard  extends Bille
{

	public BilleStandard(Vecteur position, double rayon, Vecteur vitesse,Color couleur) 
	{
		super(position, rayon, vitesse, couleur);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,	double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		// TODO Auto-generated method stub
	}


}
