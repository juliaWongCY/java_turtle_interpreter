package turtle.implementations;


import turtle.Paper;
import turtle.util.Direction;
import turtle.util.Pen;

public class ReflectingTurtle extends AbstractTurtle {

  public ReflectingTurtle(int x, int y, Paper paper, Direction direction, Pen state, char brush){
    super(x, y, paper, direction, state, brush);
  }
    @Override
    public void applyingMove(){
      if(paper.within(x, y)) {
        markCurrent();
      } else {
        moveAtEdge();
        reflect();
        markCurrent();
      }
    }

    public void reflect(){
      int width = paper.getWidth();
      int height = paper.getHeight();
        switch(direction){
          case NORTH:
            y--;
            direction = Direction.SOUTH;
            break;
          case EAST:
            x--;
            direction = Direction.WEST;
            break;
          case SOUTH:
            y++;
            direction = Direction.NORTH;
            break;
          case WEST:
            x++;
            direction = Direction.EAST;
            break;
        }


      if (x == 0 && direction == Direction.NORTHWEST){
          y++;
          direction = Direction.NORTHEAST;
      } else if(x == 0 && direction == Direction.SOUTHWEST){
          y--;
          direction = Direction.SOUTHEAST;
      } else if(y == 0 && direction == Direction.SOUTHWEST){
          x--;
          direction = Direction.NORTHWEST;
      } else if(y == 0 && direction == Direction.SOUTHEAST){
          x++;
          direction = Direction.NORTHEAST;
      } else if(x == (width - 1) && direction == Direction.SOUTHEAST){
          y--;
          direction = Direction.SOUTHWEST;
      } else if(x == (width - 1) && direction == Direction.NORTHEAST){
          y++;
          direction = Direction.NORTHWEST;
      } else if(y == (height - 1) && direction == Direction.NORTHEAST){
          x++;
          direction = Direction.SOUTHEAST;
      } else if(y == (height - 1) && direction == Direction.NORTHWEST){
          x--;
          direction = Direction.SOUTHWEST;
      }
    }

}
