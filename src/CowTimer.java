/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;

public class CowTimer {
	static /*
	 * This is an advanced recipe. There may be more than one line of code for each
	 * instruction. Work in seconds when testing, then change to minutes
	 */
	CowTimer ct = new CowTimer();
	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
		ct.setTime(3);
		ct.start();
		
	}

	private int seconds;

	public void setTime(int seconds) {
		this.seconds = seconds;
		System.out.println("Cow set to " + seconds + " seconds.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60 seconds
		 * using Thread.sleep(int milliseconds).
		 */
		for(int i = seconds; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		//Thread.sleep();
		
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can use the .wav file in the default package, or you can download one
		 * from freesound.org, then drag it intothe default package.
		 */
		playSound("moo.wav");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
