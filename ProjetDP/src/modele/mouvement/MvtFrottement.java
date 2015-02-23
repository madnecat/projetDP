package modele.mouvement;

import java.util.Vector;

import mesmaths.mecanique.MecaniquePoint;
import modele.Bille;

public class MvtFrottement extends Mouvement
{

	public MvtFrottement(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		billeD�cor�.gestionAcc�l�ration(billes);
		
		this.getAcc�l�ration().ajoute(MecaniquePoint.freinageFrottement(super.masse(),super.getVitesse())); // contribution de l'acc�l�ration due au frottement dans l'air
	}

}
