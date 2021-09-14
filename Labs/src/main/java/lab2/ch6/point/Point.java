package lab2.ch6.point;

/**
 * An <code>Point</code> object represents an point with two float coordinates
 * @author Sofronov Ivan
 * @version 1.1
 */

public class Point {

    /**
     * The first coordinate of the point
     */
    private float x;

    /**
     * The second coordinate of the point
     */
    private float y;

    /**
     * Constructor for class Point to create a point at the origin
     */
    public Point(){
        x = 0;
        y = 0;
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
     */
    public void translate(float a, float b){
        x += a;
        y += b;
    }

    /**
     * Scales the coordinates of a point
     * @param  a to scale the coordinates
     */
    public void scale(float a){
        x = x*a;
        y = y*a;
    }
}
