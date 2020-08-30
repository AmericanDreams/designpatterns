package mir.session.designpatterns.structural.flyweight;

public class Letter {
    private char character;
    private int x;
    private int y;

    public Letter(char character, int x, int y) {
        System.out.println("Created");
        this.character = character;
        this.x = x;
        this.y = y;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "character=" + character +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
