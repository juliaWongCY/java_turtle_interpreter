package turtle;

import turtle.util.*;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class TurtleInterpreter {

  private final Map<String, Turtle> turtle = new HashMap<String, Turtle>();
  Scanner scanner = new Scanner(System.in);
  PrintStream print = new PrintStream(System.out);
  private Paper paper;


  public TurtleInterpreter(Scanner scanner, PrintStream print) {
    this.scanner = scanner;
    this.print = print;

    }

  public void run(){

    while(scanner.hasNext()){

      String line = scanner.nextLine();
      String[] firstLine = line.split(" ");

        switch(firstLine[0]){

          case "paper":
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            Paper paperNew = new Paper(width, height);

          case "new":
            if (firstLine[1].equals("normal")){
              String name = scanner.next();
              int x = scanner.nextInt();
              int y = scanner.nextInt();
              Turtle turtleNew = new Turtle(x, y, paper, Direction.NORTH, Pen.UP, '*');
              turtle.put(name,turtleNew);
            }

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

            case "move":
              name = scanner.next();
              int distance = scanner.nextInt();
              turtle.get(name).move(distance);

            case "right":
              name = scanner.next();
              int angle = scanner.nextInt();
              turtle.get(name).rotateMoreTimes(Rotation.RIGHT,(angle / 45));
            case "left":
              name = scanner.next();
              angle = scanner.nextInt();
              turtle.get(name).rotateMoreTimes(Rotation.LEFT,(angle / 45));
            case "show": paper.conPaperToString();
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

    */

// make another method to run and applied on the turtleInterpreter