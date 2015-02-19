package modele;

public abstract class DecorateurBille extends Bille
{
	protected Bille billeDécoré;
	
	public DecorateurBille(Bille billeDécoré)
	{
		super(billeDécoré.getPosition(),billeDécoré.getRayon(),billeDécoré.getVitesse(),billeDécoré.getColor());
		this.billeDécoré=billeDécoré;
	}

	@Override
	public abstract void collisionContour(double abscisseCoinHautGauche,double ordonnéeCoinHautGauche, double largeur, double hauteur);
	
}
