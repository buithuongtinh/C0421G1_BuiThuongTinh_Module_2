package _06_ke_thua.bai_tap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr=new float[3];
        arr[0]=this.z;
        arr[1]=this.z;
        arr[2]=this.z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                ", z=" + z +
                '}';
    }


    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(3,4,5);
        System.out.println(point3D);
    }
}
