package modele.mouvement;

import java.util.Vector;

import modele.Bille;
import modele.OutilsBille;

public class MvtNewton extends Mouvement
{

	public MvtNewton(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		billeDécoré.gestionAccélération(billes);
		
		this.getAccélération().ajoute(OutilsBille.gestionAccélérationNewton(this, billes));     // contribution de l'accélération due à l'attraction des autres billes
	}
}
