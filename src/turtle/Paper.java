package turtle;

public class Paper {

    private int width;
    private int height;
    private Paper paper;

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
            return character;
        }
        return '\u0000';
    }

    public String toString(){
        return "(" + paper + ")";
    }
}
