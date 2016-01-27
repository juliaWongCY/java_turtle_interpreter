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

    public char changeBrush(char valueNew){

      return valueNew;

    }

    public char markCurrent(){
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
          y = y + steps;
        } else if(direction == Direction.NORTHEAST){
          x = x + steps;
          y = y + steps;
        } else if(direction == Direction.EAST){
          x = x + steps;
        } else if(direction == Direction.SOUTHEAST){
          x = x + steps;
          y = y - steps;
        } else if(direction == Direction.SOUTH){
          y = y - steps;
        } else if(direction == Direction.SOUTHWEST){
          x = x - steps;
          y = y - steps;
        } else if(direction == Direction.WEST){
          x = x - steps;
        } else if(direction == Direction.NORTHWEST){
          x = x + steps;
          y = y + steps;
        }
        markCurrent();
      }
    }


}
