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
		this.dbImage1 = createImage(Billard.this.getWidth(),
				Billard.this.getHeight());
		Billard.this.paintComponent(dbImage1.getGraphics());
		graphics.drawImage(dbImage1, 0, 0, this);
		
				
	}
	
	public void paintComponent(Graphics graphics) {
		for (int i = 0; i < this.billes.size(); ++i)
			this.billes.get(i).dessine(graphics);
	}

}
