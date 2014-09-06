package watermelon.dumb;

import java.util.*;

import watermelon.sim.Pair;
import watermelon.sim.Point;
import watermelon.sim.seed;

public  class Player extends watermelon.sim.Player {
	static int distowall = 2;
	static int distotree = 2;
	static int distoseed = 1;
	
	public void init() {
    	
    }
    
    static double distance(Point a, Point b) {
        return Math.sqrt((a.x-b.x) * (a.x-b.x) +
                         (a.y-b.y) * (a.y-b.y));
    }
    
    // Return: the next position
    // my position: dogs[id-1]
    static double distance(seed a, Point b) {
        return Math.sqrt((a.x-b.x) * (a.x-b.x) +
                         (a.y-b.y) * (a.y-b.y));
    }
	@Override
	public ArrayList<seed> move(ArrayList<Point> treelist, int width, int length) {
		// TODO Auto-generated method stub
		
		ArrayList<seed> seedlist = new ArrayList<seed>();
		for (int i= distowall; i<width-distoseed; i=i+distoseed) {
			for (int j=distowall; j<length-distoseed; j=j+distoseed) {
				Random random = new Random();
				seed tmp;
				if (random.nextInt(2)==0)
					tmp = new seed(i, j, false);
				else 
					tmp = new seed(i, j, true);
				boolean add = true;
				for (int f=0; f<treelist.size(); f++) {
					if (distance(tmp, treelist.get(f))<distotree) {
						add = false;
						break;
					}
				}
				if (add) {
					seedlist.add(tmp);
				}
			}
		}
		System.out.printf("seedlist size is %d", seedlist.size());
		return seedlist;
	}
}