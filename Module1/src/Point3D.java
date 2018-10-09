public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){
    }
    public Point3D (float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[]listXYZ = new float[3];
        listXYZ[3] = this.z;
        return listXYZ;
    }

    @Override
    public String toString() {
        return " x="+ super.getX()+",y=" + super.getY()+"z=" + this.z;
    }
}
