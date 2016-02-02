package turtle;

import turtle.util.*;

public interface Turtle {

  void lift();
  void drop();
  void changeBrush(char valueNew);
  void rotateMoreTimes(Rotation rotation, int numbers);
  void markCurrent();
  void move(int steps);


}
