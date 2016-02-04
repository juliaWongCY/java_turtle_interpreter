package turtle;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    if(args.length == 0) {
      Scanner scan = new Scanner(System.in);
      PrintStream print = new PrintStream(System.out);
      TurtleInterpreter turtleInterpreter = new TurtleInterpreter(scan, print);
      turtleInterpreter.run();
    }

    else if(args.length == 1){
      Scanner scan = new Scanner(new FileReader(args[0]));
      PrintStream print = new PrintStream(System.out);
      TurtleInterpreter turtleInterpreter = new TurtleInterpreter(scan, print);
      turtleInterpreter.run();
    }

    else if(args.length == 2){
      Scanner scan = new Scanner(new FileReader(args[0]));
      PrintStream print = new PrintStream(args[1]);
      TurtleInterpreter turtleInterpreter = new TurtleInterpreter(scan, print);
      turtleInterpreter.run();
    }

  }
}




