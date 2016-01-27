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
      //private boolean atEdge

      //  int yUpdated = 0;
      //  int xUpdated = 0;
          for (int i = steps; i > 0; i--) {

              if (direction == Direction.NORTH) {
                y ++;
              } else if (direction == Direction.NORTHEAST) {
                x++;
                y++;
              } else if (direction == Direction.EAST) {
                x++;
              } else if (direction == Direction.SOUTHEAST) {
                x--;
                y--;
              } else if (direction == Direction.SOUTH) {
                y--;
              } else if (direction == Direction.SOUTHWEST) {
                  x--;
                  y--;
              } else if (direction == Direction.WEST) {
                  x--;
              } else if (direction == Direction.NORTHWEST) {
                  x++;
                  y++;
              }
              if(paper.within(x, y)) {
                markCurrent();
              } else {
                atEdge();
              }
          }
    }
    private void atEdge(){
        if (direction == Direction.NORTH) {
            y--;
        } else if (direction == Direction.NORTHEAST) {
            x--;
            y--;
        } else if (direction == Direction.EAST) {
            x--;
        } else if (direction == Direction.SOUTHEAST) {
            x++;
            y++;
        } else if (direction == Direction.SOUTH) {
            y++;
        } else if (direction == Direction.SOUTHWEST) {
            x++;
            y++;
        } else if (direction == Direction.WEST) {
            x++;
        } else if (direction == Direction.NORTHWEST) {
            x--;
            y--;
        }


    }



}
