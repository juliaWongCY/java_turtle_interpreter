package turtle.implementations;

import turtle.Turtle;
import turtle.util.Rotation;

public class ClusterTurtle implements Turtle {

  private Turtle[] turtles;

  public ClusterTurtle(Turtle[] turtles){

    this.turtles = turtles;
  }

  public void lift() {
    for (int i = 0; i < turtles.length; i++) {
      turtles[i].lift();
    }
  }


  public void drop(){
    for (int i = 0; i < turtles.length; i++) {
      turtles[i].drop();
    }
  }

  public void changeBrush(char valueNew){
    for (int i = 0; i < turtles.length; i++) {
      turtles[i]. changeBrush(valueNew);
    }

  }

  public void rotateMoreTimes(Rotation rotation, int number){

    for (int j = 0; j < turtles.length; j++) {
      turtles[j].rotateMoreTimes(rotation, number);
    }

  }

  public void markCurrent(){
    for (int i = 0; i < turtles.length; i++) {
      turtles[i].markCurrent();
    }
  }

    public void move(int steps) {
      for (int i = 0; i < turtles.length; i++) {
        turtles[i].move(steps);
      }

    }



}
