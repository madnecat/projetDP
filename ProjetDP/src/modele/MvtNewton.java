package modele;

import java.util.Vector;

import modele.Bille;
import modele.OutilsBille;

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

	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		billeDécoré.gestionAccélération(billes);

		this.getAccélération().ajoute(OutilsBille.gestionAccélérationNewton(this, billes));     // contribution de l'accélération due à l'attraction des autres billes
	}
}
