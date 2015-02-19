package modele;

import java.awt.Color;
import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

public class BilleStandard  extends Bille
{

	public BilleStandard(Vecteur position, double rayon, Vecteur vitesse,Color couleur) 
	{
		super(position, rayon, vitesse, couleur);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,	double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		// TODO Auto-generated method stub
	}
	
	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		super.getAcc�l�ration().set(Vecteur.VECTEURNUL); // remise � z�ro du vecteur acc�l�ration        
	}
}
