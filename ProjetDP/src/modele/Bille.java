package modele;

import java.awt.*;
import java.util.Vector;

import mesmaths.cinematique.Cinematique;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;


/**
 * Cas g�n�ral d'une bille de billard
 * 
 *  A MODIFIER
 *  
 * 
 * */
public abstract class Bille
{
//----------------- classe Bille-------------------------------------

public static double ro = 1;        // masse volumique

public abstract double masse();

/**
 * mise � jour de position et vitesse � t+deltaT � partir de position et vitesse � l'instant t
 * 
 * modifie le vecteur position et le vecteur vitesse
 * 
 * laisse le vecteur acc�l�ration intact
 *
 * La bille subit par d�faut un mouvement uniform�ment acc�l�r�
 * */
public abstract void d�placer( double deltaT);

/**
 * calcul (c-�-d mise � jour) �ventuel  du vecteur acc�l�ration. 
 * billes est la liste de toutes les billes en mouvement
 * Cette m�thode peut avoir besoin de "billes" si this subit l'attraction gravitationnelle des autres billes
 * La nature du calcul du vecteur acc�l�ration de la bille  est d�finie dans les classes d�riv�es
 * A ce niveau le vecteur acc�l�ration est mis � z�ro (c'est � dire pas d'acc�l�ration)
 * */
public abstract void gestionAcc�l�ration(Vector<Bille> billes);


/**
 * gestion de l'�ventuelle  collision de cette bille avec les autres billes
 *
 * billes est la liste de toutes les billes en mouvement
 * 
 * Le comportement par d�faut est le choc parfaitement �lastique (c-�-d rebond sans amortissement)
 * 
 * @return true si il y a collision et dans ce cas les positions et vecteurs vitesses des 2 billes impliqu�es dans le choc sont modifi�es
 * si renvoie false, il n'y a pas de collision et les billes sont laiss�es intactes 
 * */
public abstract boolean gestionCollisionBilleBille(Vector<Bille> billes);



/**
 * gestion de l'�ventuelle collision de la bille (this) avec le contour rectangulaire de l'�cran d�fini par (abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur)
 * 
 * d�tecte si il y a collision et le cas �ch�ant met � jour position et vitesse
 * 
 * La nature du comportement de la bille en r�ponse � cette collision est d�finie dans les classes d�riv�es
 * */
public abstract boolean collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur, double hauteur);



public abstract void dessine (Graphics g);


public abstract String toString(); 

//getters et setters abstraits

public abstract Vecteur getPosition();

public abstract void setPosition(Vecteur position);

public abstract double getRayon();

public abstract void setRayon(double rayon);

public abstract Vecteur getVitesse();

public abstract void setVitesse(Vecteur vitesse);

public abstract Vecteur getAcc�l�ration();

public abstract void setAcc�l�ration(Vecteur acc�l�ration);

public abstract int getClef();

public abstract void setClef(int clef);

public abstract Color getCouleur();

public abstract void setCouleur(Color couleur);


//----------------- classe Bille -------------------------------------
}

