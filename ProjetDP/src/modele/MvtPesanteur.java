package modele;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import modele.Bille;

public class MvtPesanteur extends DecorateurBille
{
	Vecteur pesanteur;
	
	public MvtPesanteur(Bille billeDécoré,Vecteur pesanteur) 
	{
		super(billeDécoré);
		this.pesanteur=pesanteur;
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur, double hauteur) 
	{
		billeDécoré.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}
	
	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		billeDécoré.gestionAccélération(billes);
		
		super.getAccélération().ajoute(this.pesanteur);          // contribution du champ de pesanteur (par exemple)
	}


}
