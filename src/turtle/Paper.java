package turtle;

public class Paper {

    private int width;
    private int height;
    //private char[][] paper = new char[10][10];
    private char[][] paper = new char[height][width];


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

      return (x >= 0 && y >= 0 && x < width && y < height);

    }

    public void mark(int x, int y, char character){
        if(within(x,y)){
         paper[y][x] = character;
        }
    }

    public String conPaperToString(){

      String string = "";
        for (int y = 0; y < height; y++) {
          for (int x = 0; x < width; x++) {
          String output = String.valueOf(paper[y][x]) ;
          string += output;
          }
        }
      return string;
    }
}
