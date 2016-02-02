package turtle.implementations;


import turtle.Paper;
import turtle.Turtle;
import turtle.util.Direction;
import turtle.util.Pen;
import turtle.util.Rotation;

public class BouncyTurtle implements Turtle{


    private int x;
    private int y;
    private Direction direction;
    private Pen state;
    private char brush;
    Paper paper;

  public BouncyTurtle(){

  }

    public void lift() {
        if (state == Pen.DOWN) {
            state = Pen.UP;
        }
    }


    public void drop(){
        if(state == Pen.UP){
            state = Pen.DOWN;
        }
    }

    public void changeBrush(char valueNew){

        brush = valueNew;

    }

    public void rotateMoreTimes(Rotation rotation, int number){
        for (int i = number; i > 0; i--) {
            direction.rotate(rotation);
        }
    }

    public void markCurrent(){
        if(state == Pen.DOWN){
            paper.mark(x, y, brush);
        }
    }

    public void move(int steps){

        for (int i = steps; i > 0; i--) {
            switch (direction) {
                case NORTH:
                    y++;
                case NORTHEAST:
                    y++;
                    x++;
                case EAST:
                    x++;
                case SOUTHWEST:
                    x--;
                    y--;
                case WEST:
                    x--;
                case NORTHWEST:
                    x++;
                    y++;
            }

            if (paper.within(x, y)) {
                markCurrent();
            } else {
                rotateMoreTimes(Rotation.RIGHT, 4);
            }
        }
    }

}
