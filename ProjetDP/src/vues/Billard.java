package vues;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

import modele.Bille;

/**
 * responsable du dessin des billes
 * 
 * ICI : IL N'Y A RIEN A CHANGER
 * 
 * 
 * */
@SuppressWarnings("serial")
public class Billard extends Canvas {
	private Image dbImage1= createImage(this.getWidth(), this.getHeight())
			,dbImage2= createImage(this.getWidth(), this.getHeight());
	Vector<Bille> billes;
	

	public Billard(Vector<Bille> billes) {
		this.billes = billes;
	}

	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Canvas#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics graphics) {
		Image mem = this.dbImage1;
		this.dbImage1 = this.dbImage2;
		this.dbImage2 = mem;
		graphics.drawImage(dbImage2, 0, 0, this);
		this.dbImage1 = createImage(this.getWidth(), this.getHeight());
		this.paintComponent(dbImage1.getGraphics());
	}
	
	public void paintComponent(Graphics graphics) {
		
/* //création du buffer si il n'existe pas
     if(buffer==null){
        image = createImage(400,400);
        buffer = image.getGraphics();
      }
     //on dessine sur le buffer mémoire
      buffer.setColor( Color.white );
      buffer.fillRect( 0, 0, 400, 400 );
      buffer.setColor( Color.black );
      buffer.drawString( "affichage d'une ligne de texte", x, 200 );
      x++;
      if(x>400) x = 0;
      // finalement, le buffer mémoire est dessiné dans le buffer d'affichage
      g.drawImage(image, 0, 0, this);
   }*/
		for (int i = 0; i < this.billes.size(); ++i)
			this.billes.get(i).dessine(graphics);
	}

}
