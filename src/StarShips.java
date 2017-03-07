/**
 * Created by Gavin on 3/6/17.
 */
public class StarShips {
   public String name;
   public String weapons;
   public double warpspeed;
   public int crewsize;

   public StarShips(String name, String weapons, double warpspeed, int crewsize) {
      this.crewsize = crewsize;
      this.name = name;
      this.warpspeed = warpspeed;
      this.weapons = weapons;
   }
   public String toString(){
      return "The " +this.name+", is capable of warp "+this.warpspeed + ", is armed with "+ this.weapons + " and has a crew size of " + this.crewsize;
   }
}
