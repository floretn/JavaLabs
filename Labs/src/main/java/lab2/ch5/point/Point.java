package lab2.ch5.point;

/**
 * An <code>Point</code> object represents an point with two float coordinates
 * @author Sofronov Ivan
 * @version 1.1
 */
public class Point {

    /**
     * The first coordinate of the point
     */
    private final float x;

    /**
     * The second coordinate of the point
     */
    private final float y;
    /**
     * Constructor for class Point to create a point at the origin
     */
    public Point(){
        this(0,0);
    }

    /**
     * Constructor for class Point to create a point with coordinates (x,y)
     * @param  x the first coordinate
     * @param  y the second coordinate
     */
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x coordinate
     * @return the coordinate x of a class instance
     */
    public float getX(){
        return x;
    }

    /**
     * Returns the y coordinate
     * @return the coordinate y of a class instance
     */
    public float getY(){
        return y;
    }

    /**
     * Moves a point by a distance a by the x coordinate and b by the coordinate y
     * @param  a to move the x coordinate
     * @param  b to move the y coordinate
     * @return instance of the class po1 with the necessary coordinates
     */
    public Point translate(float a, float b){
        Point po1 = new Point(this.x + a, this.y + b);
        return po1;
    }

    /**
     * Scales the coordinates of a point
     * @param  a to scale the coordinates
     * @return instance of the class po1 with the necessary coordinates
     */
    public Point scale(float a){
        Point po1 = new Point(this.x*a, this.y*a);
        return po1;
    }

}
