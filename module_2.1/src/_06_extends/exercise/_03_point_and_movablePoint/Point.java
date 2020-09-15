package _06_extends.exercise._03_point_and_movablePoint;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;
    Point(){

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(){
        this.x =getY();
        this.y=getY();
    }
    public float[] getXY(){
        return new float[]{getX(),getY()};
    }

    @Override
    public String toString() {
        return "Point have x = "+getX()+" y = "+getY();
    }
}
