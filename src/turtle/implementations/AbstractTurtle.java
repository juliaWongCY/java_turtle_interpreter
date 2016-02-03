package turtle.implementations;

import turtle.util.*;
import turtle.*;


public abstract class AbstractTurtle implements Turtle {


        protected int x;
        protected int y;
        protected Direction direction;
        protected Pen state;
        protected char brush;
        Paper paper;

        public AbstractTurtle(int x, int y, Paper paper, Direction direction, Pen state, char brush){
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.state = state;
            this.paper = paper;
            this.brush = brush;

        }

        public void lift() {

            state = Pen.UP;
        }


        public void drop(){

          state = Pen.DOWN;

        }

        public void changeBrush(char valueNew){

            brush = valueNew;

        }

        public void rotateMoreTimes(Rotation rotation, int number){
            for (int i = 0; i < number; i++) {
              direction = direction.rotate(rotation);
            }
        }

        public void markCurrent(){
            if(state == Pen.DOWN){
                paper.mark(x, y, brush);
            }
        }

        public void move(int steps) {

            for (int i = 0; i < steps; i++) {
                switch (direction) {
                    case NORTH:
                        y++;
                        break;
                    case NORTHEAST:
                        y++;
                        x++;
                        break;
                    case EAST:
                        x++;
                        break;
                    case SOUTHEAST:
                        x++;
                        y--;
                        break;
                    case SOUTH:
                        y--;
                        break;
                    case SOUTHWEST:
                        x--;
                        y--;
                        break;
                    case WEST:
                        x--;
                        break;
                    case NORTHWEST:
                        x--;
                        y++;
                        break;
                }
                applyingMove();
            }
        }
        public void applyingMove(){
                if(paper.within(x, y)) {
                  markCurrent();
                } else {
                  moveAtEdge();
                  markCurrent();
                }
            }



        public void moveAtEdge(){
            switch (direction) {
                case NORTH:
                    y--;
                    break;
                case NORTHEAST:
                    y--;
                    x--;
                    break;
                case EAST:
                    x--;
                    break;
                case SOUTHEAST:
                    x--;
                    y++;
                    break;
                case SOUTH:
                    y++;
                    break;
                case SOUTHWEST:
                    x++;
                    y++;
                    break;
                case WEST:
                    x++;
                    break;
                case NORTHWEST:
                    x++;
                    y--;
                    break;
            }

        }
    }

/* if (paper.within(x, y)) {
                    markCurrent();
                } else {
                    moveAtEdge();
                    markCurrent();
                }
                */