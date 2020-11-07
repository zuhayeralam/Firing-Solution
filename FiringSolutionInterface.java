/**
 * Interface for Firing Solution
 * ADT specification
 */

public interface FiringSolutionInterface
{
    //public FiringSolution(Time t, int d, double x, double y);
    public void setTime(Time t);
    public Time getTime();
    public void setDegree(int d);
    public int getDegree();
    public void setX(double x);
    public double getX();
    public void setY(double y);
    public double getY();
    public String toString();
}