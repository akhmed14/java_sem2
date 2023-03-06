package seminar2.cw2;

public class Vector {
    private double  x;
    private double y;
    private double z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return
     */
    public double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    /**
     *
     * @param vector сколярное произведение
     */
    public  double scal(Vector vector){
        return x* vector.x + y* vector.y + z* vector.z;
    }

    /**
     *
     * @return
     */
    public Vector vecPr(Vector vector){
        return new Vector(y* vector.z-z* vector.x,z* vector.x-x* vector.z,x* vector.y-y* vector.x);
    }
}
