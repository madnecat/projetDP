package modele;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import modele.Bille;

public class MvtPesanteur extends DecorateurBille
{
	Vecteur pesanteur;
	
	public MvtPesanteur(Bille billeD�cor�,Vecteur pesanteur) 
	{
		super(billeD�cor�);
		this.pesanteur=pesanteur;
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		billeD�cor�.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}
	
	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		billeD�cor�.gestionAcc�l�ration(billes);
		
		super.getAcc�l�ration().ajoute(this.pesanteur);          // contribution du champ de pesanteur (par exemple)
	}


}
