package turtle;

import turtle.implementations.*;
import turtle.util.*;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

public class TurtleInterpreter {


  private final Map<String, Turtle> turtle = new HashMap<>();
  Scanner scanner;
  PrintStream print;
  private Paper paper = new Paper(10, 10);


  public TurtleInterpreter(Scanner scanner, PrintStream print) {
    this.scanner = scanner;
    this.print = print;

  }

  public void run(){

    while(scanner.hasNext()){

      switch(scanner.next()){

        case "paper":
          int width = scanner.nextInt();
          int height = scanner.nextInt();
          paper = new Paper(width, height);
          break;

        case "new":
          makeTurtle("");
          break;

        case "pen":
          String name = scanner.next();
          String state = scanner.next();

            if(state.equals("up")) {
              turtle.get(name).lift();
            } else if(state.equals("down")){
              turtle.get(name).drop();
            } else {
              char brushNew = state.charAt(0);
              turtle.get(name).changeBrush(brushNew);
            }
            break;

        case "move":
          name = scanner.next();
          int distance = scanner.nextInt();
          turtle.get(name).move(distance);
          break;

        case "right":
          name = scanner.next();
          int angle = scanner.nextInt();
          turtle.get(name).rotateMoreTimes(Rotation.RIGHT,(angle / 45));
          break;

        case "left":
          name = scanner.next();
          angle = scanner.nextInt();
          turtle.get(name).rotateMoreTimes(Rotation.LEFT,(angle / 45));
          break;

        case "show": print.println(paper.conPaperToString());
          break;
        default:
      }

    }

  }

  private Turtle makeTurtle(String prefix){

    String type = scanner.next();
    String name = prefix + scanner.next();

    System.out.println("type = " + type + ", name = " + name);

    Turtle turtleNew = null;


    if(type.equals("cluster")){
      int size = scanner.nextInt();
      Turtle[] turtles = new Turtle[size];
      for (int i = 0; i < size; i++) {
        if(!scanner.next().equals("new")){
          System.out.println("exception in creating a cluster");
          System.exit(1);
        }
        turtles[i] = makeTurtle( name + ".");
      }
      turtleNew = new ClusterTurtle(turtles);

    } else {

      int x = scanner.nextInt();
      int y = scanner.nextInt();

      switch (type) {

        case "normal":
          turtleNew
            = new NormalTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
          break;

        case "continuous":
          turtleNew
            = new ContinuousTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
          break;


        case "bouncy":
          turtleNew
            = new BouncyTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
          break;

        case "reflecting":
          turtleNew
            = new ReflectingTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
          break;

        case "wrapping":
          turtleNew
            = new WrappingTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
          break;


        default:

      }
    }
  turtle.put(name, turtleNew);
  return turtleNew;
  }

}



