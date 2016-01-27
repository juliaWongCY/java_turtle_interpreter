package turtle;

public class Paper {

    private int width;
    private int height;
    //private char[][] paper = new char[10][10];
    private char[][] paper = new char[width][height];


    public Paper(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){

      return width;
    }

    public int getHeight(){

      return height;
    }

    public boolean within(int x, int y){

      return (x >= 0 && y >= 0 && x < getWidth() && y < getHeight());

    }

    public char mark(int x, int y, char character){
        if(within(x,y)){
         paper[x][y] = character;
        }
        return '\u0000';
    }

    public String conPaperToString(char[][] paper){

      String string = "";
        for (int x = 0; x < width; x++) {
          for (int y = 0; y < height; y++) {
          String output = String.valueOf(paper[x][y]) ;
          string += output;
          }
        }
      return string;
    }
}
