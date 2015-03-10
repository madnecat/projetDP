package modele.collision;

import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;
import modele.Bille;

public class Arret extends Collision
{

	public Arret(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public boolean collisionContour(double abscisseCoinHautGauche,double ordonn�eCoinHautGauche, double largeur, double hauteur) 
	{
		Vecteur v = this.getPosition();
		Collisions.collisionBilleContourAvecArretHorizontal(this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, largeur);
		Collisions.collisionBilleContourAvecArretVertical(this.getPosition(), this.getRayon(), this.getVitesse(), ordonn�eCoinHautGauche, hauteur);
		if(v == this.getPosition())
			return false;
		return  true;
	}
}
