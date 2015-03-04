package outilsvues.actions;

import general.Animable;

public class ActionBoutonLance implements ActionBouton {

	@Override
	public void Agit(Animable animable) {
		animable.lance();
	}

}
