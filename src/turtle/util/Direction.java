package turtle.util;

import java.util.Arrays;

public enum Direction {
  NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST;

  public Direction rotate(Rotation rotation, int number){
    Direction[] direction = values();

    int currentIndex = Arrays.asList(direction).indexOf(this);
      int newIndex;
      if(rotation == Rotation.RIGHT){
        newIndex = (currentIndex + number) % direction.length;
      } else {
        newIndex = (currentIndex - number + direction.length) % direction.length;
      }

      return direction[newIndex];


  }
}


