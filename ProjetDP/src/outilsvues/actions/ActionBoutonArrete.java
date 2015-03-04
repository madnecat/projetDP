package outilsvues.actions;

import general.Animable;

public class ActionBoutonArrete implements ActionBouton {

	@Override
	public void Agit(Animable animable) {
		animable.arrete();
	}

}
