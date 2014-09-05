package watermelon.sim;

import java.util.ArrayList;

import watermelon.sim.seed;

public abstract class Player {
    
    public Player() {}
    
    public abstract void init() ;
    
    public abstract ArrayList<seed> move(); // positions of all the outpost, playerid

}
