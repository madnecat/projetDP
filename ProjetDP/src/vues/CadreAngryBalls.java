package vues;

import general.Animable;

import java.awt.*;
import java.util.Observer;
import java.util.Vector;

import modele.Bille;
import outilsvues.EcouteurBouton;
import outilsvues.EcouteurTerminaison;
import outilsvues.Outils;
import outilsvues.actions.ActionBoutonArrete;
import outilsvues.actions.ActionBoutonLance;

/**
 * Vue dessinant les billes et contenant les 3 boutons de contr�le (arr�t du
 * programme, lancer les billes, arr�ter les billes)
 * 
 * ICI : IL N'Y A RIEN A CHANGER
 * 
 * 
 * */
@SuppressWarnings("serial")
public class CadreAngryBalls extends Frame implements VueBillard {
	TextField pr�sentation;
	Billard billard;
	public Button lancerBilles, arr�terBilles;
	Panel haut, centre, bas;

	EcouteurTerminaison ecouteurTerminaison;

	public CadreAngryBalls(String titre, String message, Vector<Bille> billes)
			throws HeadlessException {
		super(titre);
		Outils.place(this, 0.33, 0.33, 0.5, 0.5);
		this.ecouteurTerminaison = new EcouteurTerminaison(this);

		this.haut = new Panel();
		this.haut.setBackground(Color.LIGHT_GRAY);
		this.add(this.haut, BorderLayout.NORTH);

		this.centre = new Panel();
		this.add(this.centre, BorderLayout.CENTER);

		this.bas = new Panel();
		this.bas.setBackground(Color.LIGHT_GRAY);
		this.add(this.bas, BorderLayout.SOUTH);

		this.pr�sentation = new TextField(message, 100);
		this.pr�sentation.setEditable(false);
		this.haut.add(this.pr�sentation);

		this.billard = new Billard(billes);
		this.add(this.billard);

		this.lancerBilles = new Button("lancer les billes");
		this.bas.add(this.lancerBilles);
		this.arr�terBilles = new Button("arr�ter les billes");
		this.bas.add(this.arr�terBilles);
		
	}

	public double largeurBillard() {
		return this.billard.getWidth();
	}

	public double hauteurBillard() {
		return this.billard.getHeight();
	}

	@Override
	public void miseAJour() {
		this.billard.repaint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exodecorateur.vues.VueBillard#montrer()
	 */
	@Override
	public void montrer() {
		this.setVisible(true);
	}

	@Override
	public void ajouteObserverLancer(Animable animable) {
		new EcouteurBouton(animable, lancerBilles, new ActionBoutonLance());
	}

	@Override
	public void ajouteObserverArreter(Animable animable) {
		new EcouteurBouton(animable, arr�terBilles, new ActionBoutonArrete());
	}
	
}