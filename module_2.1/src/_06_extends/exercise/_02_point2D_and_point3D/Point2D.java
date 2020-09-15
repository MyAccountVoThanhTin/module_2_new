package _06_extends.exercise._02_point2D_and_point3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f,y = 0.0f;
    public Point2D(){

    }

    public Point2D(float x, float y) {
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
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] result = {this.x, this.y};
        return result;
    }

    @Override
    public String toString() {
        return "Point2D with x = " +getX()+" y = "+getY();

    }
}
