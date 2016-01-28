package turtle;

import turtle.util.*;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class TurtleInterpreter {

  private final Map<String, Turtle> turtles = new HashMap<String, Turtle>();
  Scanner scanner = new Scanner(System.in);
  PrintStream print = new PrintStream(System.out);
  private Paper paper;



    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing the file passed in:");
        while(sc.hasNextLine()) System.out.println(sc.nextLine());
    }

    */
  public TurtleInterpreter(Scanner scanner, PrintStream print) {
    this.scanner = scanner;
    this.print = print;
    run();

    }

  public void run(){

    while(scanner.hasNext()){

      String line = scanner.nextLine();
      String[] firstLine = line.split(" ");

        switch(firstLine[0]){
          case "paper":
            int width = scanner.nextInt();
            int heihgt = scanner.nextInt();
          case "new":
            if (firstLine[1].equals("normal")){
              String name = scanner.next();
              int x = scanner.nextInt();
              int y = scanner.nextInt();
            }
            case "pen":
              String name = scanner.next();
              Pen state = Pen.valueOf(scanner.next());
            case "move":
              name = scanner.next();
              int distance = scanner.nextInt();
            case "right":
              name = scanner.next();
              int angle = scanner.nextInt();
            case "left":
              name = scanner.next();
              angle = scanner.nextInt();
            case "show":
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

// make another method to run and applied on the turtleInterpreter