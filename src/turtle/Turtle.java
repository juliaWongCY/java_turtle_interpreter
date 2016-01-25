package turtle;

import util.Direction;
import util.Pen;

public class Turtle {

    private int x;
    private int y;
    private Direction direction;
    private Pen state;
    Paper paper = new Paper(10,10);

    public Turtle(int x, int y, Direction direction, Pen state, Paper paper){
      this.x = x;
      this.y = y;
      this.direction = direction;
      this.state = state;
      this.paper = paper;
    }

    public Pen lift(Pen state){
      if(state == Pen.DOWN){
        return Pen.UP;
      }
        return state;
    }

    public Pen put(Pen state){
      if(state == Pen.UP){
        return Pen.DOWN;
      }
        return state;
    }


}
