package modele.mouvement;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import modele.Bille;

public class MvtPesanteur extends Mouvement
{
	Vecteur pesanteur;
	
	public MvtPesanteur(Bille billeD�cor�,Vecteur pesanteur) 
	{
		super(billeD�cor�);
		this.pesanteur=pesanteur;
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
		billeD�cor�.gestionAcc�l�ration(billes);

		this.getAcc�l�ration().ajoute(this.pesanteur);          // contribution du champ de pesanteur (par exemple)
	}

}
