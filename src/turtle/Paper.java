package turtle;

public class Paper {

    private int width;
    private int height;
    private char[][] paper;




    public Paper(int width, int height){
        this.width = width;
        this.height = height;

        paper = new char[height][width];

        for (int y = 0; y < height; y++) {
          for (int x = 0; x < width; x++) {
              paper[y][x] = ' ';

            }

        }
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
        for (int y = height - 1; y >= 0; y--) {
          for (int x = 0; x < width; x++) {
          String output = String.valueOf(paper[y][x]) ;
          string += output;
          }
          string += '\n';
        }
      return string;
    }
}
