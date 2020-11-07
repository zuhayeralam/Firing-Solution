/**
 * Interface for Time
 * ADT specification for KIT107 Assignment 1
 * @author Julian Dermoudy
 * @version 22/7/2019
 */

public interface TimeInterface
{
    //public Time();
    //public Time(int h, int m);
    public void setTime(int h, int m, int s);
    public String toString();
    public String toMilitaryString();
    public boolean equals(Time t);
    public void addSeconds(double s);
}
