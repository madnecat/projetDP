package modele.mouvement;

import java.util.Vector;

import modele.Bille;
import modele.OutilsBille;

public class MvtNewton extends Mouvement
{

	public MvtNewton(Bille billeD�cor�) 
	{
		super(billeD�cor�);
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		billeD�cor�.gestionAcc�l�ration(billes);
		
		this.getAcc�l�ration().ajoute(OutilsBille.gestionAcc�l�rationNewton(this, billes));     // contribution de l'acc�l�ration due � l'attraction des autres billes
	}
}
