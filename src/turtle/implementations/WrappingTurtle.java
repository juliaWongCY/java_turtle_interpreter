package turtle.implementations;

import turtle.Paper;
import turtle.util.Direction;
import turtle.util.Pen;

public class WrappingTurtle extends AbstractTurtle{

  public WrappingTurtle(int x, int y, Paper paper,
                        Direction direction, Pen state, char brush){

    super(x, y, paper, direction, state, brush);

  }

    @Override
    public void applyingMove(){
      if(paper.within(x, y)) {
        markCurrent();
      } else {
        moveAtEdge();
        wrap();
        markCurrent();
      }
    }

    private void wrap(){
      int corX = paper.getWidth() - 1;
      int corY = paper.getHeight() - 1;
        switch (direction) {

          case NORTH:
            y = y - corY;
            break;

          case NORTHEAST:
            if(y == corY) {
              y = y - corY;
              x ++;
            } else if(x == corX) {
              x = x - corX;
              y ++;
            }
            break;

          case EAST:
            x = x - corX;
            break;

          case SOUTHEAST:
            if(x == corX) {
              x = x - corX;
              y --;
            } else if(y == 0) {
              x ++;
              y = corY;
            }
            break;

          case SOUTH:
            y = corY;
            break;

          case SOUTHWEST:
            if(x == 0) {
              x = corX;
              y --;
            } else if(y == 0) {
              x --;
              y = corY;
            }
            break;

          case WEST:
            x = corX;
            break;

          case NORTHWEST:
            if(x == 0) {
              y ++;
              x = corX;
            } else if (y == corY) {
              x --;
              y = y - corY;
            }
            break;
        }

    }


}
