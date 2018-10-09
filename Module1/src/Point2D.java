public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D (){
    }
    public Point2D(float x, float y){
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
    public float[] getXY (){
        float[]listXY = new float[2];
        listXY[0] = this.x;
        listXY[1] = this.y;
        return listXY;
    }

    @Override
    public String toString() {
        return "(x ="+ this.getX() +",y=" +this.getY()+")";
    }
}
