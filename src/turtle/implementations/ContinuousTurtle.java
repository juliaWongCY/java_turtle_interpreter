package turtle.implementations;


import turtle.Paper;
import turtle.util.Direction;
import turtle.util.Pen;

public class ContinuousTurtle extends AbstractTurtle {

    public ContinuousTurtle(int x, int y, Paper paper, Direction direction, Pen state, char brush) {
      super(x, y, paper, direction, state, brush);

    }

    @Override
    public void applyingMove(){
      if(paper.within(x, y)) {
        markCurrent();
      }
    }

}
