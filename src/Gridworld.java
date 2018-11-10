import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
	World w = new World();
	w.show();
	Bug b = new Bug();
	Location x = new Location(5, 5);
	w.add(x, b);
	
	Bug c = new Bug(Color.blue);
	int i = new Random().nextInt(9);
	int i2 = new Random().nextInt(9);
	Location y = new Location(i, i2);
	w.add(y, c);
	for(int r = 0; r<2; r++ ) {
	c.turn();
	}
	
	Flower f = new Flower();
	Flower f2 = new Flower();
	Location a = new Location(i, i2+1);
	Location d = new Location(i, i2-1);
	//w.add(a, f);
	//w.add(d, f2);
	
	for(int z = 0; z < 10; z++) { 
		for(int S = 0; S < 10; S++) {
		Flower g = new Flower();
		Location h = new Location(z, S);
		w.add(h, g);
	}
	}
}
}
