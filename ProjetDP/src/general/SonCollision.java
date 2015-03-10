package general;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SonCollision 
{
	AudioInputStream as; 
	Clip son;
	SonCollision(String filename)
	{	
		try {
			as= AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResource(filename));
	        son = AudioSystem.getClip();
	        son.open(as);
		} catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) 
        {
			System.out.println("Erreur lors du chargement du son");
		}
	}
	
	//Joue le son
	public void jouerSon()
	{
		son.start();
	}
	
	//Arrête le son
	public void arreterSon()
	{
		son.stop();
	}


}

