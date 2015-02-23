package modele.mouvement;

import java.util.Vector;

import mesmaths.mecanique.MecaniquePoint;
import modele.Bille;

public class MvtFrottement extends Mouvement
{

	public MvtFrottement(Bille billeDécoré) 
	{
		super(billeDécoré);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		billeDécoré.gestionAccélération(billes);
		
		this.getAccélération().ajoute(MecaniquePoint.freinageFrottement(super.masse(),super.getVitesse())); // contribution de l'accélération due au frottement dans l'air
	}

}
