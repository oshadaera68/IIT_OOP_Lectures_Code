/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public abstract class ThreeDShape extends TwoDShape {

    private int z;

    public ThreeDShape(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ() {
        this.z = z;
    }

//    @Override
//    public double getArea() {
//        return 0;
//    }

    public abstract double getVolume();

    @Override
    public double getPerimeter() {
        return 0;
        throw new UnsupportedOperationException("3 Dimensions shape doesn't have perimeter");
    }
}
