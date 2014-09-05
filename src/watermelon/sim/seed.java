package watermelon.sim;

import java.util.ArrayList;


public class seed {
    public int x;
    public int y;
    public boolean tetraploid;
    
    public seed() { x = 0; y = 0; tetraploid = false; }

    public seed(int xx, int yy, boolean tetra) {
        x = xx;
        y = yy;
        tetraploid = tetra;
       
    }
}