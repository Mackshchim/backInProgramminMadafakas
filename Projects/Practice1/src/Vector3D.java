public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalarProduct(Vector3D vector) {
        return vector.x*x + vector.y*y + vector.z*z;
    }

    public void crossProduct(Vector3D vector) {
        x = y* vector.z - z* vector.y;
        y = z* vector.x - x* vector.z;
        z = x* vector.y - y* vector.x;
    }

    public double cos(Vector3D vector) {
        return scalarProduct(vector)/
                (length()*vector.length());
    }

    public void add(Vector3D vector) {
        x += vector.x;
        y += vector.y;
        z += vector.z;
    }

    public void subtract(Vector3D vector) {
        x -= vector.x;
        y -= vector.y;
        z -= vector.z;
    }




    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "( "+x+" , "+y+" , "+z+" )";
    }

    public static void main(String[] args) {
        Vector3D v = new Vector3D(0,2,3);
        System.out.println(v);
    }
}
