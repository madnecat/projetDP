package general;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *  ICI : IL N'Y A RIEN A CHANGER 
 *  
 *  */

public class EcouteurBoutonArręter implements ActionListener
{
	AnimationBilles animationBilles;

	public EcouteurBoutonArręter(AnimationBilles animationBilles)
	{
	    this.animationBilles = animationBilles;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		this.animationBilles.arręterAnimation();
	}

}
