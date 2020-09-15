package _06_extends.exercise._03_point_and_movablePoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f,ySpeed = 0.0f;
    public MovablePoint(){

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed ){
        this.xSpeed = getxSpeed();
        this.ySpeed = getySpeed();
    }
    public float[] getSpeed(){
        return new float[]{getxSpeed(),getySpeed()};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move(){
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }
    public String show(){
        return " x = "+this.x + " y = "+this.y;
    }
}
