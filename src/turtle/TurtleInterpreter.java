package turtle;

import turtle.implementations.BouncyTurtle;
import turtle.implementations.ContinuousTurtle;
import turtle.implementations.NormalTurtle;
import turtle.util.*;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class TurtleInterpreter {


  //private Set<Turtle> turtles;
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

      //String line = scanner.nextLine();
      //String[] firstLine = line.split(" ");

        switch(scanner.next()){

          case "paper":
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            paper = new Paper(width, height);
            break;

          case "new":
            String type = scanner.next();
            String name = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Turtle turtleNew;

            switch (type){
              case "normal" :
                turtleNew = new NormalTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
                turtle.put(name,turtleNew);
                break;

              case "continuous":
                turtleNew = new ContinuousTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
                turtle.put(name,turtleNew);
                break;


              case "bouncy":
                turtleNew = new BouncyTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
                turtle.put(name,turtleNew);
                break;

              /*case "reflecting":
                turtleNew = new NormalTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
                turtle.put(name,turtleNew);
                break;

              case "wrapping":
                turtleNew = new NormalTurtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
                turtle.put(name,turtleNew);
                break; */
              default:

            }
            break;

            case "pen":
              name = scanner.next();
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
}

 /*  if(firstLine[0].equals("paper")){

        }

        if (firstLine[0].equals("new")) {
          if (firstLine[1].equals("normal")){
            String name = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
          }
        }
      */


    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing the file passed in:");
        while(sc.hasNextLine()) System.out.println(sc.nextLine());
    }

    if (firstLine[1].equals("normal")){
              String name = scanner.next();
              int x = scanner.nextInt();
              int y = scanner.nextInt();
              //Turtle turtleNew = new Turtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
              //turtle.put(name,turtleNew);
            }

    */

// make another method to run and applied on the turtleInterpreter