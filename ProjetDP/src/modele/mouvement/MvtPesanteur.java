package modele.mouvement;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import modele.Bille;

public class MvtPesanteur extends Mouvement
{
	Vecteur pesanteur;
	
	public MvtPesanteur(Bille billeDécoré,Vecteur pesanteur) 
	{
		super(billeDécoré);
		this.pesanteur=pesanteur;
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
		billeDécoré.gestionAccélération(billes);

		this.getAccélération().ajoute(this.pesanteur);          // contribution du champ de pesanteur (par exemple)
	}

}
