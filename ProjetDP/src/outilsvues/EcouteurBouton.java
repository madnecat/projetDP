package outilsvues;

import general.Animable;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import outilsvues.actions.ActionBouton;

public class EcouteurBouton extends Observable implements ActionListener {

	private ActionBouton action;
	
	public EcouteurBouton(Observer obs, Button bouton, ActionBouton action) {
		super();
		this.addObserver(obs);
		bouton.addActionListener(this);
		this.action = action;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setChanged();
		notifyObservers(action);
	}

}
