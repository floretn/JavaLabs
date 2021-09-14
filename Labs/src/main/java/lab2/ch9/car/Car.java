package lab2.ch9.car;
public class Car {
    private int x;
    private float benz;
    private int ras;

    public Car(int ras){
        x = 0;
        benz = 0;
        this.ras = ras;
    }

    public int getX(){ return x; }

    public float getBenz(){ return benz; }

    public boolean movement(int km){
        if( Math.abs((float)km) <= (float)ras*benz){
            x += km;
            benz -= ((float)Math.abs(km))/((float)ras);
            return true;
        }else{
            return false;
        }
    }

    public void refuel(float lit){
        benz += lit;
    }
}
