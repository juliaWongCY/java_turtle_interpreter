package turtle.implementations;


import turtle.Paper;
import turtle.util.Direction;
import turtle.util.Pen;
import turtle.util.Rotation;

public class BouncyTurtle extends AbstractTurtle{


  public BouncyTurtle(int x, int y, Paper paper, Direction direction, Pen state, char brush){
      super(x, y, paper, direction, state, brush);

  }

    @Override
    public void applyingMove(){
      if(paper.within(x, y)) {
        markCurrent();
      } else {
        moveAtEdge();
        int rotateNum = 180/45;
        rotateMoreTimes(Rotation.RIGHT, rotateNum);
        markCurrent();
      }

    }

}



