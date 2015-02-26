package modele;

import java.awt.*;
import java.util.Vector;

import mesmaths.cinematique.Cinematique;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;


/**
 * Cas général d'une bille de billard
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
 * mise à jour de position et vitesse à t+deltaT à partir de position et vitesse à l'instant t
 * 
 * modifie le vecteur position et le vecteur vitesse
 * 
 * laisse le vecteur accélération intact
 *
 * La bille subit par défaut un mouvement uniformément accéléré
 * */
public abstract void déplacer( double deltaT);

/**
 * calcul (c-à-d mise à jour) éventuel  du vecteur accélération. 
 * billes est la liste de toutes les billes en mouvement
 * Cette méthode peut avoir besoin de "billes" si this subit l'attraction gravitationnelle des autres billes
 * La nature du calcul du vecteur accélération de la bille  est définie dans les classes dérivées
 * A ce niveau le vecteur accélération est mis à zéro (c'est à dire pas d'accélération)
 * */
public abstract void gestionAccélération(Vector<Bille> billes);


/**
 * gestion de l'éventuelle  collision de cette bille avec les autres billes
 *
 * billes est la liste de toutes les billes en mouvement
 * 
 * Le comportement par défaut est le choc parfaitement élastique (c-à-d rebond sans amortissement)
 * 
 * @return true si il y a collision et dans ce cas les positions et vecteurs vitesses des 2 billes impliquées dans le choc sont modifiées
 * si renvoie false, il n'y a pas de collision et les billes sont laissées intactes 
 * */
public abstract boolean gestionCollisionBilleBille(Vector<Bille> billes);



/**
 * gestion de l'éventuelle collision de la bille (this) avec le contour rectangulaire de l'écran défini par (abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur)
 * 
 * détecte si il y a collision et le cas échéant met à jour position et vitesse
 * 
 * La nature du comportement de la bille en réponse à cette collision est définie dans les classes dérivées
 * */
public abstract boolean collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur, double hauteur);



public abstract void dessine (Graphics g);


public abstract String toString(); 

//getters et setters abstraits

public abstract Vecteur getPosition();

public abstract void setPosition(Vecteur position);

public abstract double getRayon();

public abstract void setRayon(double rayon);

public abstract Vecteur getVitesse();

public abstract void setVitesse(Vecteur vitesse);

public abstract Vecteur getAccélération();

public abstract void setAccélération(Vecteur accélération);

public abstract int getClef();

public abstract void setClef(int clef);

public abstract Color getCouleur();

public abstract void setCouleur(Color couleur);


//----------------- classe Bille -------------------------------------
}

