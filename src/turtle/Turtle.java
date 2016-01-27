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
    Paper paper;

    public Turtle(String name, int x, int y, Direction direction, Pen state, Paper paper, char brush){
      this.name = name;
      this.x = x;
      this.y = y;
      this.direction = direction;
      this.state = state;
      this.paper = paper;
      this.brush = brush;

    }

    public Pen up(){
      if(state == Pen.DOWN){
        return Pen.UP;
      }
        return state;
    }

    public Pen put(){
      if(state == Pen.UP){
        return Pen.DOWN;
      }
        return state;
    }

    public char changeBrush(char value){

      return value;

    }

    public char markCurrent(char brush){
        if(state == Pen.DOWN){
          paper.mark(x, y, brush);
        }
        return '\u0000';
    }

    public void move(int steps){
      while(paper.within(x, y)){
        int yUpdated = 0;
        int xUpdated = 0;

        if(direction == Direction.NORTH){
          xUpdated = x;
          yUpdated = y + steps;
        } else if(direction == Direction.NORTHEAST){
          xUpdated = x + steps;
          yUpdated = y + steps;
        } else if(direction == Direction.EAST){
          xUpdated = x + steps;
          yUpdated = y;
        } else if(direction == Direction.SOUTHEAST){
          xUpdated = x + steps;
          yUpdated = y - steps;
        } else if(direction == Direction.SOUTH){
          xUpdated = x;
          yUpdated = y - steps;
        } else if(direction == Direction.SOUTHWEST){
          xUpdated = x - steps;
          yUpdated = y - steps;
        } else if(direction == Direction.WEST){
          xUpdated = x - steps;
          yUpdated = y;
        } else if(direction == Direction.NORTHWEST){
          xUpdated = x + steps;
          yUpdated = y + steps;
        }
        markCurrent(brush);
      }
    }


}
