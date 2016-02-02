package turtle.implementations;

import turtle.util.*;
import turtle.*;


public class NormalTurtle implements Turtle {


        private int x;
        private int y;
        private Direction direction;
        private Pen state;
        private char brush;
        Paper paper;

        public NormalTurtle(int x, int y, Paper paper, Direction direction, Pen state, char brush){
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.state = state;
            this.paper = paper;
            this.brush = brush;

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
                    atEdge();
                }
            }
        }
        private void atEdge(){
            switch (direction) {
                case NORTH:
                    y--;
                case NORTHEAST:
                    y--;
                    x--;
                case EAST:
                    x--;
                case SOUTHWEST:
                    x++;
                    y++;
                case WEST:
                    x++;
                case NORTHWEST:
                    x--;
                    y--;
            }

        }
    }

