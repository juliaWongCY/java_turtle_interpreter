package turtle;

import turtle.util.*;
/*import turtle.util.Direction;
import turtle.util.Pen;
import turtle.util.Rotation;
*/
public class Turtle {

    private String name;
    private int x;
    private int y;
    private Direction direction;
    private Pen state;
    private char brush;
    private Paper paper;

    public Turtle(String name, int x, int y, Direction direction, Pen state, Paper paper, char brush){
      this.name = name;
      this.x = x;
      this.y = y;
      this.direction = direction;
      this.state = state;
      this.paper = paper;
      this.brush = brush;

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

    public char changeBrush(char value){

      return value;

    }

    public char markCurrent(int x, int y, char brush, Pen state){
        if(state == Pen.DOWN){
          paper.mark(x, y, brush);
        }
        return '\u0000';
    }

    //public   move(int x, int y, char brush,Direction direction, int steps){

    //}


}
