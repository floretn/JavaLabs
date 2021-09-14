package lab4.ch7;

public enum Colors {
    BLACK (0, 0, 0),
    RED (255, 0,0),
    BLUE (0, 0, 255),
    GREEN (0, 255, 0),
    WHITE (255, 255, 255);

    private final int red;
    private final int green;
    private final int blue;

    Colors(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed(){
        return red;
    }

    public int getGreen(){
        return green;
    }

    public int getBlue(){
        return blue;
    }
}
