package modele;

import java.util.Vector;

public abstract class DecorateurBille extends Bille
{
	protected Bille billeDécoré;

	public DecorateurBille(Bille billeDécoré)
	{
		super(billeDécoré.getPosition(),billeDécoré.getRayon(),billeDécoré.getVitesse(),billeDécoré.getAccélération(),billeDécoré.getColor());
		this.billeDécoré=billeDécoré;
	}
	
	@Override
	public abstract void collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur);
	
	@Override
	public abstract void gestionAccélération(Vector<Bille> billes);
}
