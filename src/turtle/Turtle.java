package turtle;

import turtle.util.Direction;
import turtle.util.Pen;
import turtle.util.Rotation;

public class Turtle {

    private String name;
    private int x;
    private int y;
    private Direction direction;
    private Pen state;
    private char brush;
    Paper paper = new Paper(10,10);

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

    /*public Direction rotate(Direction direction, Rotation rotation){
      if(rotation == Rotation.LEFT){
        if(direction == Direction.NORTH){
          return Direction.NORTHWEST;
        } else if(direction == Direction.NORTHEAST){
            return Direction.WEST;
        } else if(direction == Direction.WEST){
            return Direction.SOUTHWEST;
        } else if(direction == Direction.SOUTHWEST){
            return Direction.SOUTH;
        } else if(direction == Direction.SOUTH){
            return Direction.
        }
      }
    }
*/

}
